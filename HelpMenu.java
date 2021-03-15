package View;

import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelpMenu {
	
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageHelp;
	private Scene helper;
	private AnchorPane pane;
	
	public HelpMenu() {
		
		stageHelp = new Stage();
		pane = new AnchorPane();
		helper = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageHelp.setScene(helper);
		stageHelp.setTitle("Helper Window");
		
		background();
		label();
		//define what to talk about here
		
		
	}
	
	
	public void background() {
		//Background background = new Background(Color.AQUA);
		ImageView background = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOfeqiWmLEz-SMF0tEk3pFW-beDkCSisA8qA&usqp=CAU");
		background.setScaleX(6);
		background.setScaleY(4.5);
		
		background.setX(650);
		background.setY(300);
		
		pane.getChildren().addAll(background);
		
		
	}
	public void label() {
		Label label = new Label("By going through every scenario and seeing how these real life scenarios apply to Cybersecurity and how everyday you can come across a Cybersecurity incident, CyberTeach will attempt to persudade you to learn more about the field of Cybersecurity and intrigue you into going into higher level education to learn more.  ");
		label.setMaxWidth(700);
		label.setWrapText(true);
		label.setTextFill(Color.BLACK);
		label.setFont(new Font("Cambria", 15));
		label.setLayoutX(0);
		label.setLayoutY(100);
		
		
		Label label2 = new Label("CyberTeach will help you learn to be more aware of your everyday activites, such as keeping your operating system updated, creating complex passwords and switching them regularly, making sure that your connection between you and another machine is secure, and how to protect yourself form attacks. ");
		label2.setMaxWidth(700);
		label2.setWrapText(true);
		label2.setTextFill(Color.BLACK);
		label2.setFont(new Font("Cambria", 15));
		label2.setLayoutX(0);
		label2.setLayoutY(200);
		
		
		Label label3 = new Label("CyberTeach will have the greatest amount of impact on those in high school who have never been introduced to the concept of Cybersecurity, just as the maker of the game had been. The ultimate goal of CyberTeach is to create more Cybersecurity professionals!");
		label3.setMaxWidth(700);
		label3.setWrapText(true);
		label3.setTextFill(Color.BLACK);
		label3.setFont(new Font("Cambria", 15));
		label3.setLayoutX(0);
		label3.setLayoutY(350);
		
		Label labeloptions = new Label("Key Cybersecurity concepts covered from scenario to scenario: ");
		labeloptions.setMaxWidth(700);
		labeloptions.setWrapText(true);
		labeloptions.setTextFill(Color.BLUE);
		labeloptions.setFont(new Font("Cambria", 20));
		labeloptions.setLayoutX(0);
		labeloptions.setLayoutY(530);
		
		Label scenario1concepts = new Label("Scenario1 : OS hardening- Adding extra security measures to your operating system to strengthen it against the risk of a cyberattack");
		scenario1concepts.setMaxWidth(700);
		scenario1concepts.setWrapText(true);
		scenario1concepts.setTextFill(Color.VIOLET);
		scenario1concepts.setFont(new Font("Cambria", 17));
		scenario1concepts.setLayoutX(0);
		scenario1concepts.setLayoutY(600);
		
		Label scenario1concepts2 = new Label("Scenario1: Firewall-  A division between a private network and an outer network that managers traffic passing between both, and can prevent against Cyber attacks");
		scenario1concepts2.setMaxWidth(700);
		scenario1concepts2.setWrapText(true);
		scenario1concepts2.setTextFill(Color.VIOLET);
		scenario1concepts2.setFont(new Font("Cambria", 17));
		scenario1concepts2.setLayoutX(0);
		scenario1concepts2.setLayoutY(690);
		
		Label scenario1concepts3 = new Label("Scenario1: Disabling SSID- Hiding your network from people and not allowing anyone else to connect to it");
		scenario1concepts3.setMaxWidth(700);
		scenario1concepts3.setWrapText(true);
		scenario1concepts3.setTextFill(Color.VIOLET);
		scenario1concepts3.setFont(new Font("Cambria", 17));
		scenario1concepts3.setLayoutX(0);
		scenario1concepts3.setLayoutY(750);
		
		
		Label scenario2concepts = new Label("Scenario2: Brute-Force- Submitting as many passwords as possible in the hope that you'll eventually reach the right password");
		scenario2concepts.setMaxWidth(700);
		scenario2concepts.setWrapText(true);
		scenario2concepts.setTextFill(Color.ORANGE);
		scenario2concepts.setFont(new Font("Cambria", 17));
		scenario2concepts.setLayoutX(800);
		scenario2concepts.setLayoutY(600);
		
		
		Label scenario2concepts2 = new Label("Scenario2: Password Complexity- Designed to deter brute force attacks by increasing the number of possible passwords");
		scenario2concepts2.setMaxWidth(700);
		scenario2concepts2.setWrapText(true);
		scenario2concepts2.setTextFill(Color.ORANGE);
		scenario2concepts2.setFont(new Font("Cambria", 17));
		scenario2concepts2.setLayoutX(800);
		scenario2concepts2.setLayoutY(650);
		
		Label scenario2concepts3 = new Label("Scenario2: PII - Personally Identfiable Information. Information that sets you apart from anyone else in the world, such as your Date of birth, address, name, and Social security number");
		scenario2concepts3.setMaxWidth(700);
		scenario2concepts3.setWrapText(true);
		scenario2concepts3.setTextFill(Color.ORANGE);
		scenario2concepts3.setFont(new Font("Cambria", 17));
		scenario2concepts3.setLayoutX(800);
		scenario2concepts3.setLayoutY(700);
		
		
		
		
		pane.getChildren().addAll(label, label2, label3, labeloptions, scenario1concepts, scenario1concepts2, scenario1concepts3, scenario2concepts, scenario2concepts2, scenario2concepts3);
	}
	
	
	public void show() {
		stageHelp.show();
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

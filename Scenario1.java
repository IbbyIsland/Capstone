package View;

import com.sun.prism.paint.Color;

import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario1 {
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	public ImageView firstImage = new ImageView("https://cdn2.vectorstock.com/i/1000x1000/94/26/cartoon-house-vector-3879426.jpg");
	public ImageView option1image = new ImageView("file:///C:/Users/abeto/Downloads/MaskingOption.jpg");
	public Label labeloption1 = new Label("Correct! In terms of CyberSecurity, your home would be your network and using blinds would be");
	public Label labeloption12 = new Label("Equivalent to using port security or hiding your network to the open world!");
	
	
	public ImageView option2image= new ImageView("file:///C:/Users/abeto/Downloads/OptionB.WaitForIntruder.jpg");
	public Label labeloption2 = new Label("Wrong. You don't know what an attacker can do as long as they get in your home");
	public Label labeloption22 = new Label("Additionally, in Cybersecurity terms, if your home is a network then you have no idea what ");
	public Label labeloption23 = new Label("kind've damage that an intruder can do once inside");
	
	public ImageView option3image = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKtVF6VmVInr6FWNMq0BpDOHiMRcw_v1di2A&usqp=CAU");
	public Label labeloption3 = new Label("Correct! In Cybersecurity terms, updating your doors and windows to make sure that they're secure");
	public Label labeloption32 = new Label("would be like updating the operating system or firewall on your computer and having it updated to");
	public Label labeloption33 = new Label("handle known vulnerabilities!");
	
	public ImageView option4image = new ImageView("file:///C:/Users/abeto/Downloads/ElectricFenceOption.jpg");
	public Label labeloption4 = new Label("Correct! In Cybersecurity terms, creating a electric fence for your house would be");
	public Label labeloption42 = new Label("akin to creating a firewall for your network! This would help keep away unwanted guests");
	
	public Stage stage1;
	private Scene scenario1;
	private AnchorPane pane;
	
	
	public Scenario1() {
		
		stage1 = new Stage();
		pane = new AnchorPane();
		scenario1 = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stage1.setScene(scenario1);
		stage1.setTitle("CyberTeach, The game for Teenagers!");
		scenario1.setCursor(Cursor.HAND);
		
		//Background background = new Background(Color.BLACK);
		
		//pane.setBackground(Color.BLACK);
		//try to change background color
		ImageView background = new ImageView("https://thumbs.dreamstime.com/b/streaming-binary-code-cyber-background-big-data-concept-neon-row-matrix-vector-data-technology-computer-backdrop-binary-numbers-139034502.jpg");
		background.setLayoutX(320);
		background.setLayoutY(150);
		background.setScaleX(2.1);
		background.setScaleY(1.8);
		pane.getChildren().add(background);
		
		
		backButton();
		mainImage();
		label();
		setScenarioOptions();
		answerOptions();
		
		scenario1.setFill(javafx.scene.paint.Color.WHITESMOKE);
		
	}
	
	public void label() {
		Label label = new Label("You've been alerted that there will be an intruder coming to break into your house");
		label.setFont(new Font("Cambria", 15));
		label.setTextFill(javafx.scene.paint.Color.BLUE);
		
		Label label2 = new Label("What would you do to protect yourself? ");
		label2.setFont(new Font("Cambria", 15));
		label2.setTextFill(javafx.scene.paint.Color.BLUE);
		Label option1 = new Label("Option A: Use blinds to make sure they don't see anything of value inside");
		Label option2 = new Label("Option B: Hit them with a bat once they come inside");
		Label option3 = new Label("Option C: Update your door and windows to make sure that they are secure");
		Label option4 = new Label("Option D: Create an electric fence around your house");
		
		
		label.setLayoutX(500);
		label.setLayoutY(20);
		label2.setLayoutX(500);
		label2.setLayoutY(40);
		option1.setLayoutX(500);
		option1.setLayoutY(60);
		option2.setLayoutX(500);
		option2.setLayoutY(85);
		option3.setLayoutX(500);
		option3.setLayoutY(110);
		option4.setLayoutX(500);
		option4.setLayoutY(135);
		
		
		
		pane.getChildren().addAll(label, label2, option1, option2, option3, option4 );
		
		
		
		
		
	}
	
	public void setScenarioOptions() {
		//successfully makes the scenario options
		
		
		MenuItem scenario2 = new MenuItem("Scenario 2!");
		MenuItem scenario3 = new MenuItem("Scenario 3!");
		MenuItem scenario4 = new MenuItem("Scenario 4!");
		
		MenuButton menuButton = new MenuButton("Choose your scenario1!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		
		
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario4);
		
		
		scenario2.setOnAction(e ->  {
			
			//switch to scene 2
			Scenario2 scenariotoShow= new Scenario2();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage1.close();
			
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			
			
			
		});
		scenario4.setOnAction(e ->  {
			
			
			
			
		});
		//MenuButton scenarios = new MenuButton("Scenarios", null, scenario1, scenario2, scenario3, scenario4);4
		
		menuButton.setLayoutX(1350);
		menuButton.setLayoutY(20);
		
		pane.getChildren().addAll(menuButton);
		
		
		
	}
	
	public void mainImage() {
		
		//ImageView firstImage = new ImageView("https://cdn2.vectorstock.com/i/1000x1000/94/26/cartoon-house-vector-3879426.jpg");
		firstImage.setLayoutX(-10);
		firstImage.setLayoutY(200);
		firstImage.setScaleX(.6);
		firstImage.setScaleY(.6);
		//AnchorPane.setBottomAnchor(firstImage, 5.0);
		//AnchorPane.setLeftAnchor(firstImage, 5.0);
		
		pane.getChildren().add(firstImage);
		
	}
	
	
	
	public void backButton() {
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(100);
		backToMainMenu.setWrapText(true);
		
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stage1.close();
		});
		
		
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	
	public void answerOptions() {
		//Label label1 = new Label("option1");
		RadioButton option1 = new RadioButton("A");
		
		//manually position the options
		option1.setLayoutX(1200);
		option1.setPrefHeight(50);
		option1.setPrefWidth(50);
		RadioButton option2 = new RadioButton("B");
		option2.setPrefHeight(50);
		option2.setPrefWidth(50);
		option2.setLayoutX(1200);
		option2.setLayoutY(40);
		RadioButton option3 = new RadioButton("C");
		option3.setPrefHeight(50);
		option3.setPrefWidth(50);
		option3.setLayoutX(1200);
		option3.setLayoutY(80);
		
		RadioButton option4 = new RadioButton("D");
		option4.setPrefHeight(50);
		option4.setPrefWidth(50);
		option4.setLayoutX(1200);
		option4.setLayoutY(120);
		ToggleGroup buttonGroup = new ToggleGroup();
		option1.setToggleGroup(buttonGroup);
		option2.setToggleGroup(buttonGroup);
		option3.setToggleGroup(buttonGroup);
		option4.setToggleGroup(buttonGroup);
		
		
		
		option1.setOnAction(e -> {
			//can only add once. Check if it exists before you add it
			//clear the immediate image, load the next one
			//also add text to the right
			//clear the image
			//successfully cleared the image
			//check to see if the other images are there, or automatically delete them
			firstImage.setVisible(false);
			option2image.setVisible(false);
			option3image.setVisible(false);
			option4image.setVisible(false);
			
			labeloption4.setVisible(false);
			labeloption42.setVisible(false);
			labeloption3.setVisible(false);
			labeloption32.setVisible(false);
			labeloption33.setVisible(false);
			labeloption2.setVisible(false);
			labeloption22.setVisible(false);
			labeloption23.setVisible(false);
			
//			firstImage.setScaleX(0.1);
//			firstImage.setScaleY(0.1);
//			firstImage.relocate(0, 0);
			//create labels for the image
			//red if it was wrong, green if it was right
			
			labeloption1.setLayoutX(1000);
			labeloption1.setLayoutY(400);
			labeloption12.setLayoutX(1000);
			labeloption12.setLayoutY(450);
			
			labeloption1.setTextFill(javafx.scene.paint.Color.DARKGREEN);
			labeloption12.setTextFill(javafx.scene.paint.Color.DARKGREEN);
			
			
			
			
			
			option1image.setX(50);
			option1image.setY(350);
			option1image.setScaleX(1);
			option1image.setScaleY(1);
//			Label labelExp = new Label("Correct! This option would work because");
//			labelExp.setLayoutX(850);
//			labelExp.setLayoutY(800);
			if (!pane.getChildren().contains(option1image)){
				pane.getChildren().addAll(option1image, labeloption1, labeloption12);

			}
			
			option1image.setVisible(true);
			labeloption1.setVisible(true);
			labeloption12.setVisible(true);
			
			
			
		});
		
		option2.setOnAction(e -> {
			//can only add once, check if ti is already there before adding it
			labeloption1.setVisible(false);
			labeloption12.setVisible(false);
			labeloption4.setVisible(false);
			labeloption42.setVisible(false);
			labeloption3.setVisible(false);
			labeloption32.setVisible(false);
			labeloption33.setVisible(false);
			
			
			
			
			
			
			labeloption2.setLayoutX(1000);
			labeloption2.setLayoutY(400);
			labeloption22.setLayoutX(1000);
			labeloption22.setLayoutY(450);
			labeloption23.setLayoutX(1000);
			labeloption23.setLayoutY(500);
			
			labeloption2.setTextFill(javafx.scene.paint.Color.DARKRED);
			labeloption22.setTextFill(javafx.scene.paint.Color.DARKRED);
			labeloption23.setTextFill(javafx.scene.paint.Color.DARKRED);
			
			
			
			firstImage.setVisible(false);
			option3image.setVisible(false);
			option4image.setVisible(false);
			option1image.setVisible(false);
			
			
			option2image.setScaleX(.7);
			option2image.setScaleY(.7);
			option2image.setY(400);
			option2image.setX(0);
			
			
			if (!pane.getChildren().contains(option2image)){
				pane.getChildren().addAll(option2image, labeloption2, labeloption22, labeloption23);
			}
			
			option2image.setVisible(true);
			labeloption2.setVisible(true);
			labeloption22.setVisible(true);
			labeloption23.setVisible(true);
			
		});
		
		option3.setOnAction(e -> {
			//enlarge this
			labeloption3.setLayoutX(800);
			labeloption3.setLayoutY(400);
			labeloption32.setLayoutX(800);
			labeloption32.setLayoutY(450);
			labeloption33.setLayoutX(800);
			labeloption33.setLayoutY(500);
			labeloption3.setTextFill(javafx.scene.paint.Color.DARKGREEN);
			labeloption32.setTextFill(javafx.scene.paint.Color.DARKGREEN);
			labeloption33.setTextFill(javafx.scene.paint.Color.DARKGREEN);
			
			
			
			firstImage.setVisible(false);
			option4image.setVisible(false);
			option1image.setVisible(false);
			option2image.setVisible(false);
			
			labeloption1.setVisible(false);
			labeloption12.setVisible(false);
			labeloption2.setVisible(false);
			labeloption22.setVisible(false);
			labeloption23.setVisible(false);
			labeloption4.setVisible(false);
			labeloption42.setVisible(false);
			
			
			
			option3image.setScaleX(1.5);
			option3image.setScaleY(1.7);
			option3image.setY(375);
			option3image.setX(50);
			
			
			if (!pane.getChildren().contains(option3image)){
				pane.getChildren().addAll(option3image, labeloption3, labeloption32, labeloption33);
			}
			
			option3image.setVisible(true);
			labeloption3.setVisible(true);
			labeloption32.setVisible(true);
			labeloption33.setVisible(true);
			
		});
		
		option4.setOnAction(e -> {
			//enlarge this
			labeloption4.setLayoutX(800);
			labeloption4.setLayoutY(400);
			labeloption42.setLayoutX(800);
			labeloption42.setLayoutY(450);
			labeloption4.setTextFill(javafx.scene.paint.Color.DARKGREEN);
			labeloption42.setTextFill(javafx.scene.paint.Color.DARKGREEN);
			
			
			
			firstImage.setVisible(false);
			option1image.setVisible(false);
			option2image.setVisible(false);
			option3image.setVisible(false);
			
			labeloption3.setVisible(false);
			labeloption32.setVisible(false);
			labeloption33.setVisible(false);
			labeloption2.setVisible(false);
			labeloption22.setVisible(false);
			labeloption23.setVisible(false);
			labeloption1.setVisible(false);
			labeloption12.setVisible(false);
			
			
			
			
			
			
			option4image.setScaleX(1.2);
			option4image.setScaleY(1.4);
			option4image.setY(375);
			option4image.setX(50);
			
			if (!pane.getChildren().contains(option4image)){
				pane.getChildren().addAll(option4image, labeloption4, labeloption42);
			}
			option4image.setVisible(true);
			labeloption4.setVisible(true);
			labeloption42.setVisible(true);
			
		});
		
		
		
		pane.getChildren().addAll(option1, option2, option3, option4);
		
		
		
		
	}
	
	
	
	public void show() {
		stage1.show();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


















	public void setTitle(String string) {
		// TODO Auto-generated method stub
		stage1.setTitle(string);
	}

}

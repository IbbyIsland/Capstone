package View;

import java.util.Random;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario3Learner {

	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageLearn3;
	private Scene learner;
	private AnchorPane pane;
	
	
	public String encryptionMethod ="1whdn223iedn8y3bhd73rvdjq01!bwhdcn(hwhssg2364759dbsjag1b18ey3evsjau1273846381idbwk283yvdn1i38eybskk";
	
	
	public Scenario3Learner() {
		stageLearn3 = new Stage();
		pane = new AnchorPane();
		learner = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageLearn3.setScene(learner);
		stageLearn3.setTitle("Scenario3Learner");
		stageLearn3.setFullScreen(true);
		//pane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		
		
		
		ImageView image = new ImageView("https://image.freepik.com/free-vector/black-gradient-background-spotlights-illumination_107791-1460.jpg");
		pane.getChildren().addAll(image);
		image.setScaleX(2.6);
		image.setScaleY(2.25);
		image.setX(450);
		image.setY(230);
		
		backButton();
		encryptor();
		label();
		setScenarioOptions();
		createLearnerButton();
	}
	public void setScenarioOptions() {
		//successfully makes the scenario options
		
		
		MenuItem scenario3 = new MenuItem("Scenario 3!");
		MenuItem scenario1 = new MenuItem("Scenario 1!");
		
		MenuItem scenario2 = new MenuItem("Scenario 2!");
		MenuItem scenario4 = new MenuItem("Scenario 4!");
		MenuItem scenario5 = new MenuItem("Scenario 5!");
		
		MenuButton menuButton = new MenuButton("Choose your scenario!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario4);
		menuButton.getItems().add(scenario5);
		
		
		scenario3.setOnAction(e ->  {
			
			//switch to scene 2
			Scenario3 scenariotoShow= new Scenario3();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
			
			
		});
		
		scenario1.setOnAction(e ->  {
			//switch to scene 3
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 3
			Scenario2 scenariotoShow= new Scenario2();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4 scenariotoShow= new Scenario4();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5 scenariotoShow= new Scenario5();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
			
		});
		//MenuButton scenarios = new MenuButton("Scenarios", null, scenario1, scenario2, scenario3, scenario4);4
		
		menuButton.setLayoutX(1350);
		menuButton.setLayoutY(20);
		
		pane.getChildren().addAll(menuButton);
		
		
		
	}
	public void createLearnerButton() {
		MenuItem scenario1 = new MenuItem("Scenario 2 Learner!");
		MenuItem scenario2 = new MenuItem("Scenario 1 Learner!");
		//MenuItem scenario3 = new MenuItem("Scenario 3 Learner!");
		MenuItem scenario4 = new MenuItem("Scenario 4 Learner!");
		MenuItem scenario5 = new MenuItem("Scenario 5 Learner!");
		
		MenuButton menuButton = new MenuButton("Choose your Learner Scenario!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario2);
		//menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario4);
		menuButton.getItems().add(scenario5);
		
		scenario1.setOnAction(e ->  {
			//switch to scene 1
			Scenario1Learner scenariotoShow= new Scenario1Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
		
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 2
			Scenario2Learner scenariotoShow= new Scenario2Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
			
		});
//		scenario3.setOnAction(e ->  {
//			//switch to scene 3
//			Scenario3Learner scenariotoShow= new Scenario3Learner();
//			scenariotoShow.show();
//			//include a way to get back to the main Window and a way to go to the next Scene
//			stageLearn3.close();
//			
//			
//		});
		scenario4.setOnAction(e ->  {
			Scenario4Learner scenariotoShow= new Scenario4Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5Learner scenariotoShow= new Scenario5Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn3.close();
			
			
			
		});
		
		menuButton.setLayoutX(1330);
		menuButton.setLayoutY(80);
		
		pane.getChildren().addAll(menuButton);
	}
	
	
	
	
	public void show() {
		stageLearn3.show();
	}
	
	//ask about whether the message should be randomized and jumbled up or if you should use the encryption method above
	//put the actual word in the encryptor and jumble it up.
	public void encryptor() {
		Label label = new Label("Choose your message to encrypt:");
		label.setFont(new Font("Cambria", 20));
		label.setTextFill(Color.ORANGE);
		label.setLayoutX(240);
		label.setLayoutY(650);
		
		TextField textField = new TextField();
		
		textField.setLayoutX(600);
		textField.setLayoutY(650);
		
		Button button = new Button("Encrypt!");
		button.setLayoutX(750);
		button.setLayoutY(650);
		
		Label label2 = new Label("Encryption result:");
		label2.setFont(new Font("Cambria", 20));
		label2.setTextFill(Color.ORANGE);
		label2.setLayoutX(240);
		label2.setLayoutY(740);
		
		Label label3 = new Label();
		label3.setMaxWidth(450);
		label3.setWrapText(true);
		label3.setLayoutX(430);
		label3.setLayoutY(720);
		
		button.setOnAction(e -> {
			if (!textField.getText().trim().isEmpty()) {
				Random r = new Random();
				encryptionMethod += textField.getText();
				String hashes = encrypt( r, encryptionMethod );
				
				label3.setText(hashes);
				
			}
			
			
			
			
			
		});
		label3.setFont(new Font("Cambria", 20));
		label3.setTextFill(Color.ORANGE);
		
		pane.getChildren().addAll(label, label2, label3, textField, button);
	}
	
	public String encrypt(Random r, String word) {
		
		char encrypt[] = word.toCharArray();
		
		for(int i = 0; i < encrypt.length; i++) {
			int j = r.nextInt(encrypt.length);
			
			char temporary = encrypt[i]; 
			encrypt[i] =  encrypt[j]; 
			encrypt[j] = temporary;
		}
		
		
		return new String (encrypt);
		
		
		
	}
	
	public void backButton() {
		
		
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(150);
		backToMainMenu.setWrapText(true);
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stageLearn3.close();
		});
		
		backToMainMenu.setLayoutX(0);
		backToMainMenu.setLayoutY(20);
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	public void label() {
		
		Label label = new Label("This scenario was designed to improve upon your knowledge of the regular Scenario3-Encryption, Confusion, and Diffusion.");
		label.setFont(new Font("Cambria", 20));
		label.setTextFill(Color.GOLD);
		label.setLayoutX(200);
		label.setLayoutY(20);
		label.setMaxWidth(1100);
		label.setWrapText(true);
		
		
		
		Label label1 = new Label("Encryption is used so that only a certain person can decipher whatever that you want to say, and encryption uses cryptography as its tool to ensure that.");
		label1.setFont(new Font("Cambria", 20));
		label1.setTextFill(Color.GOLD);
		label1.setLayoutX(200);
		label1.setLayoutY(140);
		label1.setMaxWidth(1100);
		label1.setWrapText(true);
		
		
		Label label2 = new Label("However, there are multiple methods of cryptography, and many of them with varying strengths. Typically, the more bits that a method uses, the harder it is for attackers to decrypt it. For Example, DES (Data Encryption Standard) was a encryption method created by the governemnt in the 1970s that they believed would be relatively secure. However, after learning that its limited bit size wouldn't be sufficient against attackers, the government moved on to a 128 base bit size encryption method called AES (Advanced Encryption Standard), which they use to this day. ");
		label2.setFont(new Font("Cambria", 20));
		label2.setTextFill(Color.GOLD);
		label2.setLayoutX(200);
		label2.setLayoutY(200);
		label2.setMaxWidth(1100);
		label2.setWrapText(true);
		
		
		
		Label label3 = new Label("However, even long bit methods don't make an encryption method impervious to being cracked, it just makes it a lot harder for them to be cracked.");
		label3.setFont(new Font("Cambria", 20));
		label3.setTextFill(Color.GOLD);
		label3.setLayoutX(200);
		label3.setLayoutY(360);
		label3.setMaxWidth(1100);
		label3.setWrapText(true);
		
		
		
		
		Label label4 = new Label("Now using the encryption tool below, create a word to encrypt, select 'encrypt!' and you'll see how the values are stored. (Spoiler: It's just a block of gibberish to the naked eye)");
		label4.setFont(new Font("Cambria", 20));
		label4.setTextFill(Color.GOLD);
		label4.setLayoutX(200);
		label4.setLayoutY(430);
		label4.setMaxWidth(1100);
		label4.setWrapText(true);
		
		Label label5 = new Label("There are various other encryption methods such as the BlowFish-448 bit size, Twofish-128 Bit size, RSA-1024 bit size , Elliptic-Curve Cryptography, and 3DES, which is 168 bit size. These are all substantially bigger and much more complicated than the 100 bit encryptor created below. ");
		label5.setFont(new Font("Cambria", 20));
		label5.setTextFill(Color.GOLD);
		label5.setLayoutX(200);
		label5.setLayoutY(490);
		label5.setMaxWidth(1100);
		label5.setWrapText(true);
		
		
		
		pane.getChildren().addAll(label, label1, label2, label3, label4, label5);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

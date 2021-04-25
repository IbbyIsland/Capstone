package View;

import java.util.Random;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario4Learner {

	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageLearn4;
	private Scene learner;
	private AnchorPane pane;
	
	public String hashMethod = "110100100101110101011011011010001010101101001100111010101011001101011001011010101001010101011010101";
	
	ImageView background = new ImageView("https://images.unsplash.com/photo-1579546929662-711aa81148cf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1050&q=80");
	
	public Scenario4Learner() {
		stageLearn4 = new Stage();
		pane = new AnchorPane();
		learner = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageLearn4.setScene(learner);
		stageLearn4.setTitle("Scenario4Learner");
		stageLearn4.setFullScreen(true);
		
		background.setLayoutX(320);
		background.setLayoutY(150);
		background.setScaleX(2.1);
		background.setScaleY(1.8);
		pane.getChildren().add(background);
		
		Random r = new Random();
		
		backButton();
		textField();
		lables();
		setScenarioOptions();
		createLearnerButton();
		
	}
	
	
	
	public void show() {
		stageLearn4.show();
	}
	
	public void textField() {
		Label label = new Label("Word to hash: ");
		
		label.setFont(new Font("Cambria", 18));
		label.setTextFill(Color.WHITE);
		label.setLayoutX(300);
		label.setLayoutY(650);
		
		
		TextField textField = new TextField();
		
		textField.setLayoutX(420);
		textField.setLayoutY(650);
		
		
		
		Button button = new Button("Hash it!");
		button.setLayoutX(600);
		button.setLayoutY(650);
		
		Label label2 = new Label("Hash value:");
		label2.setFont(new Font("Cambria", 18));
		label2.setTextFill(Color.WHITE);
		label2.setLayoutX(300);
		label2.setLayoutY(740);
		
		
		
		Label label3 = new Label();
		label3.setMaxWidth(400);
		label3.setWrapText(true);
		label3.setLayoutX(430);
		label3.setLayoutY(720);
		
		
		//now change the placement and the size of the labels.
		
		
		button.setOnAction(e -> {
			if (!textField.getText().trim().isEmpty()) {
				Random r = new Random();
				
				String hashes = hash( r, hashMethod );
				
				label3.setText(hashes);
				
			}
			
			
			
			
			
		});
		
		label3.setFont(new Font("Cambria", 20));
		label3.setTextFill(Color.WHITE);
		pane.getChildren().addAll(label, label2, label3, textField, button);
	
		
	}
	
	public void lables() {
		Label label = new Label("This scenario is based on your knowledge from Scenario4: Hashing");
		label.setLayoutX(200);
		label.setLayoutY(40);
		label.setFont(new Font("Cambria", 20));
		label.setTextFill(Color.WHITE);
		
		Label label2 = new Label("Since you've learned that hashing is one of the most important ways to check the integrity of things such as Files, Messages, and anything else that can be sent, you should also learn how companies use them and which specific kinds they use.");
		label2.setLayoutX(200);
		label2.setLayoutY(120);
		label2.setFont(new Font("Cambria", 20));
		label2.setTextFill(Color.WHITE);
		label2.setMaxWidth(1200);
		label2.setWrapText(true);
		
		
		Label label3 = new Label("Companies use hashing to check if any requests from their clients have been tampered with. For example, if a client sends a message to a company, that client's message will immediately be given a hash value and once it gets to the company, it will have another hash value. If that message has not been tampered with, both hash values will be the same.");
		label3.setLayoutX(200);
		label3.setLayoutY(220);
		label3.setFont(new Font("Cambria", 20));
		label3.setTextFill(Color.WHITE);
		label3.setMaxWidth(1200);
		label3.setWrapText(true);
		
		Label label4 = new Label("Unlike Encryption, Hashes cannot be reverted back to plaintext by attackers, since it is stored as a string of 1s and 0s. Below is your very own 100-Bit hasher, which will give you a different hash value everytime you enter a value.");
		label4.setLayoutX(200);
		label4.setLayoutY(350);
		label4.setFont(new Font("Cambria", 20));
		label4.setTextFill(Color.WHITE);
		label4.setMaxWidth(1200);
		label4.setWrapText(true);
		
		Label label5 = new Label("Other professional hash methods that companies use that are much longer than the one below, are the MD5, SHA-256, and RIPEMD hashing algorithms.");
		label5.setLayoutX(200);
		label5.setLayoutY(420);
		label5.setFont(new Font("Cambria", 20));
		label5.setTextFill(Color.WHITE);
		label5.setMaxWidth(1200);
		label5.setWrapText(true);
		
		Label label6 = new Label("These hashes use 128, 256, and 160 length bits. Since there are 8 bytes (or 8 combinations of 1s and 0s) in a single bit, it's suffice to say that a good amount of effort has to be made by the attacker to attempt to generate the same exact hash as these methods.");
		label6.setLayoutX(200);
		label6.setLayoutY(530);
		label6.setFont(new Font("Cambria", 20));
		label6.setTextFill(Color.WHITE);
		label6.setMaxWidth(1200);
		label6.setWrapText(true);
		
		
		pane.getChildren().addAll(label, label2, label3, label4, label5, label6);
		
	}
	
	public String hash(Random r, String word) {
		
		char hashes[] = word.toCharArray();
		
		for(int i = 0; i < hashes.length; i++) {
			int j = r.nextInt(hashes.length);
			
			char temporary = hashes[i]; 
			hashes[i] = hashes[j]; 
			hashes[j] = temporary;
		}
		
		
		return new String (hashes);
		
		
		
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
			stageLearn4.close();
			
			
			
			
		});
		
		scenario1.setOnAction(e ->  {
			//switch to scene 3
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
			
			
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 3
			Scenario2 scenariotoShow= new Scenario2();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4 scenariotoShow= new Scenario4();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5 scenariotoShow= new Scenario5();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
			
			
			
		});
		//MenuButton scenarios = new MenuButton("Scenarios", null, scenario1, scenario2, scenario3, scenario4);4
		
		menuButton.setLayoutX(1350);
		menuButton.setLayoutY(20);
		
		pane.getChildren().addAll(menuButton);
		
		
		
	}
	public void createLearnerButton() {
		MenuItem scenario1 = new MenuItem("Scenario 2 Learner!");
		MenuItem scenario2 = new MenuItem("Scenario 1 Learner!");
		MenuItem scenario3 = new MenuItem("Scenario 3 Learner!");
		//MenuItem scenario4 = new MenuItem("Scenario 4 Learner!");
		MenuItem scenario5 = new MenuItem("Scenario 5 Learner!");
		
		MenuButton menuButton = new MenuButton("Choose your Learner Scenario!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario3);
		//menuButton.getItems().add(scenario4);
		menuButton.getItems().add(scenario5);
		
		scenario1.setOnAction(e ->  {
			//switch to scene 1
			Scenario1Learner scenariotoShow= new Scenario1Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
		
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 2
			Scenario2Learner scenariotoShow= new Scenario2Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3Learner scenariotoShow= new Scenario3Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
			
			
		});
//		scenario4.setOnAction(e ->  {
//			Scenario4Learner scenariotoShow= new Scenario4Learner();
//			scenariotoShow.show();
//			//include a way to get back to the main Window and a way to go to the next Scene
//			stageLearn4.close();
//			
//			
//			
//		});
		
		scenario5.setOnAction(e ->  {
			Scenario5Learner scenariotoShow= new Scenario5Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn4.close();
			
			
			
		});
		
		menuButton.setLayoutX(1330);
		menuButton.setLayoutY(80);
		
		pane.getChildren().addAll(menuButton);
	}
	
	
	public void backButton() {
		
		
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(150);
		backToMainMenu.setWrapText(true);
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stageLearn4.close();
		});
		
		backToMainMenu.setLayoutX(0);
		backToMainMenu.setLayoutY(20);
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

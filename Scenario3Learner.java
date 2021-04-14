package View;

import java.util.Random;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
		stageLearn3.setTitle("Learner Window");
		pane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		
		backButton();
		encryptor();
	}
	
	public void show() {
		stageLearn3.show();
	}
	
	//ask about whether the message should be randomized and jumbled up or if you should use the encryption method above
	public void encryptor() {
		Label label = new Label("Choose your message to encrypt:");
		label.setFont(new Font("Cambria", 18));
		label.setTextFill(Color.ORANGE);
		label.setLayoutX(300);
		label.setLayoutY(650);
		
		TextField textField = new TextField();
		
		textField.setLayoutX(600);
		textField.setLayoutY(650);
		
		Button button = new Button("Encrypt!");
		button.setLayoutX(750);
		button.setLayoutY(650);
		
		Label label2 = new Label("Encrypt result:");
		label2.setFont(new Font("Cambria", 18));
		label2.setTextFill(Color.ORANGE);
		label2.setLayoutX(300);
		label2.setLayoutY(740);
		
		Label label3 = new Label();
		label3.setMaxWidth(400);
		label3.setWrapText(true);
		label3.setLayoutX(430);
		label3.setLayoutY(720);
		
		button.setOnAction(e -> {
			if (!textField.getText().trim().isEmpty()) {
				Random r = new Random();
				
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
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

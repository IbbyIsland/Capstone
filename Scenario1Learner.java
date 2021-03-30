package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario1Learner {

	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageLearn1;
	private Scene learner;
	private AnchorPane pane;
	
	public String passwordChecker = "";
	Label labelAnswer = new Label();
	//public String url = "https://cve.mitre.org/";
	//public WebView browser = new WebView();
	//public WebEngine webEngine = browser.getEngine();
	
	
	public Scenario1Learner() {
		stageLearn1 = new Stage();
		pane = new AnchorPane();
		learner = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageLearn1.setScene(learner);
		stageLearn1.setTitle("Learner Window");
		
		pane.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
		
		
		
		passwordChecker();
		labels();
		//hyperLink();
		
	}
	
	public void passwordChecker() {
		
		Label label = new Label("Set a password!");
		
		PasswordField textfield = new PasswordField();
		textfield.setPromptText("Enter your password");
		//TextField textfield = new TextField();
		textfield.setPrefColumnCount(30);
		Button button = new Button("Check your password strength!");
		
		//make a way to see what exactly is wrong with the user's password
		
		button.setOnAction(e -> {
			String input = textfield.getText();
			int strengthChecker = 0;
			
			if (input.length() < 7) {
				passwordChecker += " Extremely weak password, less than 7 characters.";
				
				
			}
			
			
			if (input.length() >= 7 ) {
				strengthChecker += 1;
			}
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '!' || input.charAt(i) == '@' || input.charAt(i) == '#' || input.charAt(i) == '$' || input.charAt(i) == '%' || input.charAt(i) == '^' || input.charAt(i) == '&' || input.charAt(i) == '*' || input.charAt(i) == '(' || input.charAt(i) == ')' || input.charAt(i) == '_' || input.charAt(i) == '-' || input.charAt(i) == '+' || input.charAt(i) == '=' || input.charAt(i) == '`' || input.charAt(i) == '~' || input.charAt(i) == '{' || input.charAt(i) == '}' || input.charAt(i) == '[' || input.charAt(i) == ']' || input.charAt(i) == ':' || input.charAt(i) == ';' || input.charAt(i) == '"' || input.charAt(i) == ',' || input.charAt(i) == '.' || input.charAt(i) == '?' || input.charAt(i) == '/') {
					strengthChecker += 1;
					break;
				}
			}
			for (int i = 0; i < input.length(); i++) {
				if(Character.isDigit(input.charAt(i))) {
					strengthChecker += 1;
				}
			}
			
			//make it so that the user knows exactly what is wrong with their password
			switch (strengthChecker) {
			
			case 0:
					if (!pane.getChildren().contains(labelAnswer)) {
						pane.getChildren().add(labelAnswer);
					}
					labelAnswer.setText("Extremely weak password, is less than 7 characters, has no special characters, and no numbers. Try again");
					labelAnswer.setLayoutX(620);
					labelAnswer.setLayoutY(700);
					labelAnswer.setWrapText(true);
					labelAnswer.setMaxWidth(500);
					break;
					
			case 1: 
				if (!pane.getChildren().contains(labelAnswer)) {
					pane.getChildren().add(labelAnswer);
				}
				labelAnswer.setText("Weak password. Ensure that the password is longer than 6 characters, has special characters, and has numbers. Try again");
				labelAnswer.setLayoutX(620);
				labelAnswer.setLayoutY(700);
				labelAnswer.setWrapText(true);
				labelAnswer.setMaxWidth(500);
				break;
				
			case 2: 
				
				if (!pane.getChildren().contains(labelAnswer)) {
					pane.getChildren().add(labelAnswer);
				}
				labelAnswer.setText("Average password. To make it even stronger, make it longer, add a special character, or a number.");
				labelAnswer.setLayoutX(620);
				labelAnswer.setLayoutY(700);
				labelAnswer.setWrapText(true);
				labelAnswer.setMaxWidth(500);
				break;
			
			case 3: 
				if (!pane.getChildren().contains(labelAnswer)) {
					pane.getChildren().add(labelAnswer);
				}
				labelAnswer.setText("Perfect! Your password matches all of the criteria to make a secure password!");
			}
			
			
			
		});
		
		textfield.setLayoutX(200);
		textfield.setLayoutY(700);
		label.setLayoutX(50);
		label.setLayoutY(700);
		button.setLayoutX(420);
		button.setLayoutY(700);
		
		
		label.setTextFill(javafx.scene.paint.Color.BLACK);
		
		pane.getChildren().addAll(textfield,label, button);
		
		
	}
	
	public void show() {
		stageLearn1.show();
	}
	
	public void labels() {
		
		Label label = new Label("Welcome to the Scenario2 Learner, a continuation of what you have/would have covered in the Scenario2 example from the Main Menu. We are furthering our learning on the importance of password security, which is especially pivotal due to our reliance on passwords in everyday life. We use passwords to access our bank accounts, social media, and other important websites and as such, we should make them strong enough so that they're not able to be guessed or found out by someone else.");
		Label label2 = new Label("There are two main types of ways that an intruder will attack your password:Brute Force or Dictionary attacks.");
		Label label3 = new Label("Brute force attacks are attacks in which the attacker guesses as many combinations of passwords as they can, using any set of numbers and letters to do the trick. However, going through every possible combination would take a very long time, and we can further that time by making complex passwords that would have the attacker taking years to find the right one!");
		Label label4 = new Label("Dictionary attacks are attacks in which the attacker uses common words to guess as your password. An example of this would be using the word 'password'. In addition, the more the attacker knows about your everyday life, the easier it would be for them to guess words that would be closely associated with you, such as your mothers middle name. Doing this would help the attacker narrow down the list of possible passwords. We can help prevent this by making complex passwords not related to our everyday lives. ");
		Label label5 = new Label("Below is your very own password checker that can tell you whether or not your password is strong enough! Play with it until you create a strong enough password to use in everyday life!");
		Label label6 = new Label("Requirements: Password must be 7 or longer characters, contain a special character, and a number");
		
		label.setMaxWidth(1000);
		label2.setMaxWidth(1000);
		label3.setMaxWidth(1000);
		label4.setMaxWidth(1000);
		label5.setMaxWidth(1000);
		label6.setMaxWidth(1000);
		
		label.setLayoutX(200);
		label.setLayoutY(20);
		label.setFont(new Font("Cambria", 20));
		label.setTextFill(javafx.scene.paint.Color.BLACK);
		
		label2.setLayoutX(200);
		label2.setLayoutY(150);
		label2.setFont(new Font("Cambria", 20));
		label2.setTextFill(javafx.scene.paint.Color.BLACK);
		
		label3.setLayoutX(200);
		label3.setLayoutY(240);
		label3.setFont(new Font("Cambria", 20));
		label3.setTextFill(javafx.scene.paint.Color.BLUE);
		
		label4.setLayoutX(200);
		label4.setLayoutY(350);
		label4.setFont(new Font("Cambria", 20));
		label4.setTextFill(javafx.scene.paint.Color.BLUE);
		
		label5.setLayoutX(200);
		label5.setLayoutY(500);
		label5.setFont(new Font("Cambria", 20));
		label5.setTextFill(javafx.scene.paint.Color.BLACK);
		
		label6.setLayoutX(200);
		label6.setLayoutY(600);
		label6.setFont(new Font("Cambria", 20));
		label6.setTextFill(javafx.scene.paint.Color.BLACK);
		
		
		
		label.setWrapText(true);
		label2.setWrapText(true);
		label3.setWrapText(true);
		label4.setWrapText(true);
		label5.setWrapText(true);
		label6.setWrapText(true);
		
		pane.getChildren().addAll(label, label2, label3, label4, label5, label6);
		
		
		
	}
	
	public void hyperLink() {
//		Hyperlink link = new Hyperlink("Click me");
//		link.setLayoutX(0);
//		link.setLayoutY(100);
//		link.setOnAction(e -> {
//			webEngine.load(url);
//		});
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

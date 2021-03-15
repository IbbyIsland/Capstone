package View;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario2 {
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	public Stage stage2;
	private Scene scenario2;
	private AnchorPane pane;
	
	public Label optionLabelA = new Label("Incorrect! Using Robert's street name is something that can easily be found out and automatically guessed");
	public Label optionLabelB = new Label("Incorrect! Using Robert's dog's name is something that anyone who knows Robert personally can guess");
	public Label optionLabelC = new Label("Incorrect! Using Robert's mother's name is something that anyone can find out with little effort");
	public Label optionLabelD = new Label("Incorrect! While it's useful to use numbers in a password, that number shouldn't be correlated with Robert's address");
	public Label optionLabelE = new Label("Correct! The best way to make a string password is by combining it with letters, numbers, and special characters!" );
	
	
	public Label option2LabelA = new Label("Correct! This would increase the number of times an intruder would have to guess!");
	public Label option2LabelB = new Label("Correct! This would definetly stop the intruder from trying as many passwords as they want!");
	public Label option2LabelC = new Label("Incorrect! Not changing passwords regularly would increase the chance that an intruder already in the network would have an extended stay!");
	public Label option2LabelD = new Label("Incorrect! Intruders an find out personally identifiable info from users, and will use that first for passwords!");
	
	public Scenario2() {
		stage2 = new Stage();
		pane = new AnchorPane();
		scenario2 = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stage2.setScene(scenario2);
		stage2.setTitle("CyberTeach, The game for Teenagers!");
		
		
		createBackground();
		backButton();
		setScenarioOptions();
		actualLabel1();
		actualLabel2();
		
		
		
		
	}
	
	
	
	
	public void backButton() {
		
		
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(100);
		backToMainMenu.setWrapText(true);
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stage2.close();
		});
		
		
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	
	private void createBackground() {
		
		//Image backGroundimage = new Image("Images/Electricity.jpg", 256, 256, false, true);
		//find out how to scale the image
		//choose an actual background
		ImageView background = new ImageView("https://us.123rf.com/450wm/lishchyshyn/lishchyshyn1904/lishchyshyn190401450/123036154-technology-dark-background-vector-futuristic-wave-3d-cyber-technology-big-data-.jpg?ver=6");
		background.setScaleX(3.5);
		background.setScaleY(3.7);
		
		//center the image
		background.setX(550);
		background.setY(300);
		
		pane.getChildren().addAll(background);
		
		
			
		
	}
	
	public void actualLabel1() {
		//create the game Labels and the Text about which one should be your password, if the wrong one is selected, color the whole background Red with a label text
		//if its green, color the wholebackground green with a label text
		Label prompt = new Label("Robert finds out that an intruder wants to gain access into his Wifi by finding out his password and trying as many guesses as possible to break in. Additionally, the intruder has Robert's personal info. Which password would take the longest for the intruder to try? ");
		prompt.setMaxWidth(650);
		prompt.setWrapText(true);
		prompt.setTextFill(Color.WHITE);
		prompt.setFont(new Font("Cambria", 20));
		prompt.setLayoutX(0);
		prompt.setLayoutY(450);
		Label label1 = new Label("Robert lives on 8021 Woodplant avenue. He has a dog named Randy and lives with his mother named Susan. His PSN is Robert223!. Which of these do you expect could be his password? Which of these is a strong password?");
		//change the font so you can see it
		
		label1.setFont(new Font("Cambria", 20));
		label1.setTextFill(Color.WHITE);
		label1.setLayoutX(0);
		label1.setLayoutY(360);
		label1.setWrapText(true);
		label1.setMaxWidth(650);
		
		
//		Label labelOptions = new Label("Mark your answer below:");
//		labelOptions.setFont(new Font("Cambria", 20));
//		labelOptions.setTextFill(Color.WHITE);
//		labelOptions.setLayoutY(500);
//		labelOptions.setLayoutX(0);
		
		
		Label labelA = new Label("A: ");
		labelA.setFont(new Font("Cambria", 20));
		labelA.setTextFill(Color.WHITE);
		RadioButton optionA = new RadioButton("Woodplant");
		labelA.setLayoutX(0);
		labelA.setLayoutY(550);
		optionA.setLayoutX(50);
		optionA.setLayoutY(550);
		optionA.setFont(new Font("Cambria", 20));
		optionA.setTextFill(Color.ORANGE);
		
		optionA.setOnAction(e -> {
			
			optionLabelB.setVisible(false);
			optionLabelC.setVisible(false);
			optionLabelD.setVisible(false);
			optionLabelE.setVisible(false);
			optionLabelA.setVisible(true);
			
			optionLabelA.setLayoutX(0);
			optionLabelA.setLayoutY(300);
			optionLabelA.setTextFill(javafx.scene.paint.Color.RED);
			optionLabelA.setFont(new Font("Cambria", 15));
			if (!pane.getChildren().contains(optionLabelA)) {
				pane.getChildren().add(optionLabelA);
			}
		});
		
		
		
		
		Label labelB = new Label("B: ");
		RadioButton optionB = new RadioButton("Randy");
		labelB.setFont(new Font("Cambria", 20));
		labelB.setTextFill(Color.WHITE);
		labelB.setLayoutX(0);
		labelB.setLayoutY(600);
		optionB.setLayoutX(50);
		optionB.setLayoutY(600);
		optionB.setFont(new Font("Cambria", 20));
		optionB.setTextFill(Color.ORANGE);
		
		optionB.setOnAction(e -> {
			
			
			optionLabelC.setVisible(false);
			optionLabelD.setVisible(false);
			optionLabelE.setVisible(false);
			optionLabelA.setVisible(false);
			optionLabelB.setVisible(true);
			
			
			optionLabelB.setLayoutX(0);
			optionLabelB.setLayoutY(300);
			optionLabelB.setTextFill(javafx.scene.paint.Color.RED);
			optionLabelB.setFont(new Font("Cambria", 15));
			if (!pane.getChildren().contains(optionLabelB)) {
				pane.getChildren().add(optionLabelB);
			}
		});
		
		Label labelC = new Label("C: ");
		RadioButton optionC = new RadioButton("Susan");
		labelC.setFont(new Font("Cambria", 20));
		labelC.setTextFill(Color.WHITE);
		labelC.setLayoutX(0);
		labelC.setLayoutY(650);
		optionC.setLayoutX(50);
		optionC.setLayoutY(650);
		optionC.setFont(new Font("Cambria", 20));
		optionC.setTextFill(Color.ORANGE);
		
		optionC.setOnAction(e -> {
			
			optionLabelC.setVisible(true);
			optionLabelD.setVisible(false);
			optionLabelE.setVisible(false);
			optionLabelA.setVisible(false);
			optionLabelB.setVisible(false);
			
			
			optionLabelC.setLayoutX(0);
			optionLabelC.setLayoutY(300);
			optionLabelC.setTextFill(javafx.scene.paint.Color.RED);
			optionLabelC.setFont(new Font("Cambria", 15));
			if (!pane.getChildren().contains(optionLabelC)) {
				pane.getChildren().add(optionLabelC);
			}
		});
		
		Label labelD = new Label("D: ");
		RadioButton optionD = new RadioButton("8021");
		labelD.setFont(new Font("Cambria", 20));
		labelD.setTextFill(Color.WHITE);
		labelD.setLayoutX(0);
		labelD.setLayoutY(700);
		optionD.setLayoutX(50);
		optionD.setLayoutY(700);
		optionD.setFont(new Font("Cambria", 20));
		optionD.setTextFill(Color.ORANGE);
		
		optionD.setOnAction(e -> {
			
			
			optionLabelC.setVisible(false);
			optionLabelD.setVisible(true);
			optionLabelE.setVisible(false);
			optionLabelA.setVisible(false);
			optionLabelB.setVisible(false);
			
			
			optionLabelD.setLayoutX(0);
			optionLabelD.setLayoutY(300);
			optionLabelD.setTextFill(javafx.scene.paint.Color.RED);
			optionLabelD.setFont(new Font("Cambria", 15));
			if (!pane.getChildren().contains(optionLabelD)) {
				pane.getChildren().add(optionLabelD);
			}
		});
		
		Label labelE = new Label("E: ");
		labelE.setFont(new Font("Cambria", 20));
		labelE.setTextFill(Color.WHITE);
		RadioButton optionE = new RadioButton("Robert223!");
		labelE.setLayoutX(0);
		labelE.setLayoutY(750);
		optionE.setLayoutX(50);
		optionE.setLayoutY(750);
		optionE.setFont(new Font("Cambria", 20));
		optionE.setTextFill(Color.ORANGE);
		
		optionE.setOnAction(e -> {
			
			
			optionLabelC.setVisible(false);
			optionLabelD.setVisible(false);
			optionLabelE.setVisible(true);
			optionLabelA.setVisible(false);
			optionLabelB.setVisible(false);
			
			
			optionLabelE.setLayoutX(0);
			optionLabelE.setLayoutY(300);
			optionLabelE.setTextFill(javafx.scene.paint.Color.GREEN);
			optionLabelE.setFont(new Font("Cambria", 15));
			if (!pane.getChildren().contains(optionLabelE)) {
				pane.getChildren().add(optionLabelE);
			}
		});
		
		ToggleGroup buttonGroup = new ToggleGroup();
		
		optionA.setToggleGroup(buttonGroup);
		optionB.setToggleGroup(buttonGroup);
		optionC.setToggleGroup(buttonGroup);
		optionD.setToggleGroup(buttonGroup);
		optionE.setToggleGroup(buttonGroup);
		
		
		
		//just make a button for all the options
		
		
		
		pane.getChildren().addAll(label1, prompt, labelA, labelB, labelC, labelD, labelE, optionA, optionB, optionC, optionD, optionE );
		
		
		
	}
	
	public void actualLabel2() {
		
		Label label1 = new Label("Mr.Isaac is the IT admin for Target. His job is to make sure that the company's internal network isn't compromised, and part of the way he does that is by making the passwords secure. To make sure that someone isn't able to try a million passwords until one of them is right, what should he do?");
		label1.setMaxWidth(650);
		label1.setWrapText(true);
		label1.setTextFill(Color.WHITE);
		label1.setFont(new Font("Cambria", 20));
		label1.setLayoutX(850);
		label1.setLayoutY(380);
		
		Label labelOptions = new Label("Mark your answer below:");
		labelOptions.setFont(new Font("Cambria", 20));
		labelOptions.setTextFill(Color.WHITE);
		labelOptions.setLayoutY(550);
		labelOptions.setLayoutX(850);
		
		Label labelA = new Label("A: ");
		labelA.setTextFill(Color.WHITE);
		labelA.setFont(new Font("Cambria", 20));
		RadioButton optionA = new RadioButton("Increase password Complexity");
		optionA.setTextFill(Color.ORANGE);
		optionA.setFont(new Font("Cambria", 20));
		
		labelA.setLayoutX(850);
		labelA.setLayoutY(600);
		optionA.setLayoutX(900);
		optionA.setLayoutY(600);
		
		optionA.setOnAction( e -> {
			
			option2LabelB.setVisible(false);
			option2LabelC.setVisible(false);
			option2LabelD.setVisible(false);
			
			option2LabelA.setVisible(true);
			
			option2LabelA.setLayoutX(850);
			option2LabelA.setLayoutY(200);
			option2LabelA.setTextFill(javafx.scene.paint.Color.GREEN);
			option2LabelA.setFont(new Font("Cambria", 15));
			if (!pane.getChildren().contains(option2LabelA)) {
				pane.getChildren().add(option2LabelA);
			}
		});
		
		Label labelB = new Label("B: ");
		labelB.setTextFill(Color.WHITE);
		labelB.setFont(new Font("Cambria", 20));
		RadioButton optionB = new RadioButton("Account lockout after 3 tries");
		optionB.setTextFill(Color.ORANGE);
		optionB.setFont(new Font("Cambria", 20));

		labelB.setLayoutX(850);
		labelB.setLayoutY(650);
		optionB.setLayoutX(900);
		optionB.setLayoutY(650);
		
		optionB.setOnAction(e -> {
			
			option2LabelB.setVisible(true);
			option2LabelC.setVisible(false);
			option2LabelD.setVisible(false);
			
			option2LabelA.setVisible(false);
			
			option2LabelB.setLayoutX(850);
			option2LabelB.setLayoutY(200);
			option2LabelB.setTextFill(javafx.scene.paint.Color.GREEN);
			option2LabelB.setFont(new Font("Cambria", 15));
			if (!pane.getChildren().contains(option2LabelB)) {
				pane.getChildren().add(option2LabelB);
			}
		});
		
		Label labelC = new Label("C: ");
		labelC.setTextFill(Color.WHITE);
		labelC.setFont(new Font("Cambria", 20));
		RadioButton optionC = new RadioButton("Allow users to keep the same password for a long time");
		optionC.setTextFill(Color.ORANGE);
		optionC.setFont(new Font("Cambria", 20));

		labelC.setLayoutX(850);
		labelC.setLayoutY(700);
		optionC.setLayoutX(900);
		optionC.setLayoutY(700);
		
		optionC.setOnAction(e ->{
			
			option2LabelB.setVisible(false);
			option2LabelC.setVisible(true);
			option2LabelD.setVisible(false);
			
			option2LabelA.setVisible(false);
			
			option2LabelC.setLayoutX(850);
			option2LabelC.setLayoutY(200);
			option2LabelC.setTextFill(javafx.scene.paint.Color.RED);
			option2LabelC.setFont(new Font("Cambria", 15));
			option2LabelC.setWrapText(true);
			option2LabelC.setMaxWidth(400);
			if (!pane.getChildren().contains(option2LabelC)) {
				pane.getChildren().add(option2LabelC);
			}
		});
		
		Label labelD = new Label("D: ");
		labelD.setTextFill(Color.WHITE);
		labelD.setFont(new Font("Cambria", 20));
		RadioButton optionD = new RadioButton("Allow users to use personal data as a password, like their birthday");
		optionD.setTextFill(Color.ORANGE);
		optionD.setFont(new Font("Cambria", 20));

		labelD.setLayoutX(850);
		labelD.setLayoutY(750);
		optionD.setLayoutX(900);
		optionD.setLayoutY(750);
		
		optionD.setOnAction(e -> {
			option2LabelB.setVisible(false);
			option2LabelC.setVisible(false);
			option2LabelD.setVisible(true);
			
			option2LabelA.setVisible(false);
			
			option2LabelD.setLayoutX(850);
			option2LabelD.setLayoutY(200);
			option2LabelD.setTextFill(javafx.scene.paint.Color.RED);
			option2LabelD.setFont(new Font("Cambria", 15));
			option2LabelD.setWrapText(true);
			option2LabelD.setMaxWidth(400);
			if (!pane.getChildren().contains(option2LabelD)) {
				pane.getChildren().add(option2LabelD);
			}
			
		});
		
		ToggleGroup buttonGroup = new ToggleGroup();
		
		optionA.setToggleGroup(buttonGroup);
		optionB.setToggleGroup(buttonGroup);
		optionC.setToggleGroup(buttonGroup);
		optionD.setToggleGroup(buttonGroup);
		
		
		
		
		pane.getChildren().addAll(label1, labelOptions, labelA, labelB, labelC, labelD, optionA, optionB, optionC, optionD);
		
		
		
	}
	
	public void setScenarioOptions() {
		//successfully makes the scenario options
		
		
		MenuItem scenario1 = new MenuItem("Scenario 1!");
		MenuItem scenario3 = new MenuItem("Scenario 3!");
		MenuItem scenario4 = new MenuItem("Scenario 4!");
		
		MenuButton menuButton = new MenuButton("Choose your scenario1!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario4);
		
		
		scenario1.setOnAction(e ->  {
			
			//switch to scene 2
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage2.close();
			
			
			
			
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void show() {
		stage2.show();
	}

}

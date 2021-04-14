package View;

import javax.swing.ButtonGroup;

import javafx.geometry.Insets;
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
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario4 {

	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	public Stage stage4;
	private Scene scenario4;
	private AnchorPane pane;
	Label introLabel = new Label();
	
	Label option1Answer = new Label("Correct! Ensuring that the signature is in the exact same form as it was when it was first sent out would translate in Cybersecurity as hashing. Hashing is a way to make sure that data has not been changed or tampered with! ");
	
	Label option2Answer = new Label("Incorrect! The Teacher won't know whether the parents themselves signed the log, or if it was the students. This would translate in Cybersecurity to blindly accepting data from another machine without checking if someone else had modified it or changed it entirely. Thus, attacking the integrity of the original message.");
	
	Label option3Answer = new Label("Correct! By making sure that the parents themselves turn it in and verifying their identity, you can make sure that the original message is untouched, and that they cannot say they didn't turn the reading log in. This would be an example of non-repudiation in Cybersecurity. Which would be making sure that a user cannot deny whatever action they performed.");
	
	Label option4Answer = new Label("Correct! Using time stamps helps verify when the reading log was signed, which we also use in Cybersecurity. By using a time stamp in Cybersecurity, we can verify when actions were taken place and as such, get accurate results of when certain events happened. This concept can also be similar to logging! ");
	
	public ImageView image = new ImageView("https://thumbs.dreamstime.com/b/pupils-teacher-classroom-school-pedagogue-teach-geography-lesson-map-globe-to-pupil-kids-character-schools-lessons-124097623.jpg");
	
	
	public ImageView image1 = new ImageView("https://miro.medium.com/max/482/0*gcW7w9_3Y6jb_tsj");
	
	
	//scale this more vertically
	public ImageView image2 = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2I2-vhfWqikcMiCvIXwYchWyBKdkGYK02wA&usqp=CAU");
	
	
	//insert image here
	public ImageView image3 = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjYNe0g996-lll57dNTF_lUr-3KMxN8nDhrg&usqp=CAU");
	
	//insert image here
	public ImageView image4 = new ImageView("https://1.bp.blogspot.com/-wBJJO9sSlio/XShtc54qpOI/AAAAAAAADCQ/sC2z-6Cj8ZUMh69UVt5vlTHWinnvZM_xgCLcBGAs/s1600/timestamps-bash-history.png");
	
	public Scenario4() {
		
		stage4 = new Stage();
		pane = new AnchorPane();
		scenario4 = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT);
		stage4.setScene(scenario4);
		stage4.setTitle("CyberTeach, The game for Teenagers!        Hashing");
		
		pane.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		image.setLayoutX(0);
		image.setLayoutY(380);
		image.setScaleX(.7);
		image.setScaleY(.7);
		pane.getChildren().add(image);
		
		setScenarioOptions();
		backButton();
		playable();
		createLearnerButton();
		
	}
	
	public void show() {
		stage4.show();
	}
	
	public void setScenarioOptions() {
		//successfully makes the scenario options
		
		
		MenuItem scenario1 = new MenuItem("Scenario 1!");
		MenuItem scenario3 = new MenuItem("Scenario 3!");
		MenuItem scenario2 = new MenuItem("Scenario 2!");
		MenuItem scenario5 = new MenuItem("Scenario 5!");
		
		MenuButton menuButton = new MenuButton("Choose your scenario1!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario5);
		
		scenario1.setOnAction(e ->  {
			
			//switch to scene 2
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3 scenariotoShow= new Scenario3();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
		});
		scenario2.setOnAction(e ->  {
			Scenario2 scenariotoShow= new Scenario2();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
			
		});
		scenario5.setOnAction(e ->  {
			Scenario5 scenariotoShow= new Scenario5();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
			
		});
		//MenuButton scenarios = new MenuButton("Scenarios", null, scenario1, scenario2, scenario3, scenario4);4
		
		menuButton.setLayoutX(1350);
		menuButton.setLayoutY(20);
		
		pane.getChildren().addAll(menuButton);
		
		
		
	}
	
	public void backButton() {
		
		
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(100);
		backToMainMenu.setWrapText(true);
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stage4.close();
		});
		
		
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	
	public void createLearnerButton() {
		MenuItem scenario1 = new MenuItem("Scenario 1 Learner!");
		MenuItem scenario2 = new MenuItem("Scenario 2 Learner!");
		MenuItem scenario3 = new MenuItem("Scenario 3 Learner!");
		MenuItem scenario4 = new MenuItem("Scenario 4 Learner!");
		MenuItem scenario5 = new MenuItem("Scenario 5 Learner!");
		
		MenuButton menuButton = new MenuButton("Choose your Learner Scenario!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario4);
		menuButton.getItems().add(scenario5);
		
		scenario1.setOnAction(e ->  {
			//switch to scene 1
			Scenario1Learner scenariotoShow= new Scenario1Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
		
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 2
			Scenario2Learner scenariotoShow= new Scenario2Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3Learner scenariotoShow= new Scenario3Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4Learner scenariotoShow= new Scenario4Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5Learner scenariotoShow= new Scenario5Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage4.close();
			
			
			
		});
		
		menuButton.setLayoutX(1330);
		menuButton.setLayoutY(80);
		
		pane.getChildren().addAll(menuButton);
	}
	
	public void playable() {
		introLabel.setText("A Teacher asks their students to fill out a reading log and for the students to get their parents to sign it afterwards, verifying that they indeed did the required readings. The Teacher wants to make sure that everyone did their readings like they said they did, and that noone forges their parents signature. What should the teacher do?");
		introLabel.setMaxWidth(800);
		introLabel.setWrapText(true);
		introLabel.setLayoutX(350);
		introLabel.setLayoutY(100);
		
		introLabel.setFont(new Font("Cambria", 25));
		introLabel.setTextFill(Color.BLACK);
		
		option1Answer.setMaxWidth(600);
		option1Answer.setWrapText(true);
		
		option2Answer.setMaxWidth(500);
		option2Answer.setWrapText(true);
		
		option3Answer.setMaxWidth(500);
		option3Answer.setWrapText(true);
		
		option4Answer.setMaxWidth(500);
		option4Answer.setWrapText(true);
		
		
		
		
		Label option1 = new Label("Make sure that the signature is in the exact same form as the parents previous forms, to make sure it wasn't forged or tampered with. ");
		option1.setLayoutX(50);
		option1.setLayoutY(300);
		option1.setFont(new Font("Cambria", 15));
		option1.setTextFill(Color.BLACK);
		option1.setMaxWidth(650);
		option1.setWrapText(true);
		
		
		
		
		
		
		
		Label option2 = new Label("Take it as it is");
		option2.setLayoutX(900);
		option2.setLayoutY(300);
		option2.setFont(new Font("Cambria", 15));
		option2.setTextFill(Color.BLACK);
		option2.setMaxWidth(400);
		option2.setWrapText(true);
		
		Label option3 = new Label("Make sure that the parents turn it in themselves, along with ID verifying that they are who they say they are.");
		option3.setLayoutX(50);
		option3.setLayoutY(400);
		option3.setFont(new Font("Cambria", 15));
		option3.setTextFill(Color.BLACK);
		option3.setMaxWidth(650);
		option3.setWrapText(true);
		
		
		
		Label option4 = new Label("Use time stamps to show when it was signed, and have the parents verify it.");
		option4.setLayoutX(900);
		option4.setLayoutY(400);
		option4.setFont(new Font("Cambria", 15));
		option4.setTextFill(Color.BLACK);
		option4.setMaxWidth(400);
		option4.setWrapText(true);
		
		
		
		
		RadioButton option1Button = new RadioButton("A:");
		option1Button.setFont(new Font("Cambria", 15));
		option1Button.setTextFill(Color.ORANGE);
		option1Button.setLayoutX(0);
		option1Button.setLayoutY(300);
		
		
		
		
		
		RadioButton option2Button = new RadioButton("B:");
		option2Button.setFont(new Font("Cambria", 15));
		option2Button.setTextFill(Color.ORANGE);
		option2Button.setLayoutX(850);
		option2Button.setLayoutY(300);
		
		
		
		RadioButton option3Button = new RadioButton("C");
		option3Button.setFont(new Font("Cambria", 15));
		option3Button.setTextFill(Color.ORANGE);
		option3Button.setLayoutX(0);
		option3Button.setLayoutY(400);
		
		RadioButton option4Button = new RadioButton("D");
		option4Button.setFont(new Font("Cambria", 15));
		option4Button.setTextFill(Color.ORANGE);
		option4Button.setLayoutX(850);
		option4Button.setLayoutY(400);
		
		ToggleGroup buttongroup = new ToggleGroup();
		option1Button.setToggleGroup(buttongroup);
		option2Button.setToggleGroup(buttongroup);
		option3Button.setToggleGroup(buttongroup);
		option4Button.setToggleGroup(buttongroup);
		
		option1Button.setOnAction(e -> {
			image.setVisible(false);
			image2.setVisible(false);
			image3.setVisible(false);
			image4.setVisible(false);
			option1Answer.setVisible(true);
			option2Answer.setVisible(false);
			option3Answer.setVisible(false);
			option4Answer.setVisible(false);
			
			image1.setVisible(true);
			
			
			image1.setLayoutX(0);
			image1.setLayoutY(450);
			image1.setScaleY(1.1);
			
			option1Answer.setLayoutX(700);
			option1Answer.setLayoutY(500);
			
			option1Answer.setFont(new Font("Cambria", 20));
			option1Answer.setTextFill(Color.WHITE);
			
			
			
			if (!pane.getChildren().contains(image1) && !pane.getChildren().contains(option1Answer)) {
				pane.getChildren().add(image1);
				pane.getChildren().add(option1Answer);
			}
			
			
			
			
		});
		
		
		option2Button.setOnAction(e -> {
			image.setVisible(false);
			image1.setVisible(false);
			image2.setVisible(true);
			image3.setVisible(false);
			image4.setVisible(false);
			option1Answer.setVisible(false);
			option2Answer.setVisible(true);
			option3Answer.setVisible(false);
			option4Answer.setVisible(false);
			
			image2.setLayoutX(0);
			image2.setLayoutY(550);
			image2.setScaleY(1.2);
			
			option2Answer.setLayoutX(700);
			option2Answer.setLayoutY(550);
			
			option2Answer.setFont(new Font("Cambria", 20));
			option2Answer.setTextFill(Color.RED);
			
			if (!pane.getChildren().contains(image2) && !pane.getChildren().contains(option2Answer)) {
				pane.getChildren().add(image2);
				pane.getChildren().add(option2Answer);
			}
			
			
		});
		
		option3Button.setOnAction(e -> {
			image.setVisible(false);
			image1.setVisible(false);
			image2.setVisible(false);
			image3.setVisible(true);
			image4.setVisible(false);
			option1Answer.setVisible(false);
			option2Answer.setVisible(false);
			option3Answer.setVisible(true);
			option4Answer.setVisible(false);
			
			image3.setLayoutX(0);
			image3.setLayoutY(500);
			image3.setScaleX(1.4);
			
			option3Answer.setLayoutX(700);
			option3Answer.setLayoutY(500);
			
			option3Answer.setFont(new Font("Cambria", 20));
			option3Answer.setTextFill(Color.WHITE);
			
			if (!pane.getChildren().contains(image3) && !pane.getChildren().contains(option3Answer)) {
				pane.getChildren().add(image3);
				pane.getChildren().add(option3Answer);
			}
			
		});
		
		option4Button.setOnAction(e -> {
			image.setVisible(false);
			image1.setVisible(false);
			image2.setVisible(false);
			image3.setVisible(false);
			image4.setVisible(true);
			option1Answer.setVisible(false);
			option2Answer.setVisible(false);
			option3Answer.setVisible(false);
			option4Answer.setVisible(true);
			
			image4.setLayoutX(0);
			image4.setLayoutY(370);
			image4.setScaleX(.7);
			image4.setScaleY(.6);
			
			option4Answer.setLayoutX(800);
			option4Answer.setLayoutY(600);
			
			option4Answer.setFont(new Font("Cambria", 20));
			option4Answer.setTextFill(Color.WHITE);
			
			if (!pane.getChildren().contains(image4) && !pane.getChildren().contains(option4Answer)) {
				pane.getChildren().add(image4);
				pane.getChildren().add(option4Answer);
			}
			
		});
		
		
		pane.getChildren().addAll(introLabel, option1, option2, option3, option4, option1Button, option2Button, option3Button, option4Button);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package View;


import java.awt.event.WindowAdapter;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

import application.Main;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Popup;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainMenuManager {
	
	
	
	
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
//	private final WebView browser = new WebView();
//	private final WebEngine webEngine = browser.getEngine();
	
	private Stage stage;
	private Scene scene;
	private AnchorPane pane;
	//private String url = "https://cve.mitre.org/";
	
	public MainMenuManager() {
		
		
		//Vertifcal Box displays things from top to bottom
		
		stage = new Stage();
		pane = new AnchorPane();
		scene = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stage.setScene(scene);
		stage.setTitle("CyberTeach, The game for Teenagers!");
		scene.setCursor(Cursor.HAND);
		//stage.setFullScreen(true);
		stage.setFullScreen(true);
		

//		

//	
		
		
		setStagePosition(stage);
		createBackground();
		//createLoadSongsButton();
		//createButton();
		//createAdditionalButton();
		setTitle();
		entryLabel();
		setScenarioOptions();
		createLearnerButton();
		//createHelpButton();
		
		//Hyperlink linkToCVE = new Hyperlink("Link to the Common Vulnerabilities and Exposures Database!");
//		linkToCVE.setOnAction(e -> {
//			//webEngine.loadContent(url);
//			
//		});
		//pane.getChildren().addAll(linkToCVE);
		
		
		
		//try to make this the intro to scenario1
		Stage stage2 = new Stage();
		stage2.setTitle("This is Scenario1");
		//stage2.show();
		
	}
	
	
	
	private void setStagePosition(Stage stage) {
		// TODO Auto-generated method stub
		javafx.geometry.Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		
		stage.setX(primaryScreenBounds.getMaxX()-  MAIN_WINDOW_WIDTH);
		stage.setY(primaryScreenBounds.getMaxY()- MAIN_WINDOW_HEIGHT );
		stage.setAlwaysOnTop(true);
	}
	
	private void createBackground() {
		
		//Image backGroundimage = new Image("Images/Electricity.jpg", 256, 256, false, true);
		//find out how to scale the image
		//choose an actual background
		ImageView background = new ImageView("https://media.istockphoto.com/photos/programming-and-password-concept-picture-id1183143306?k=6&m=1183143306&s=612x612&w=0&h=A-gHChmi1L89LIdjPQouzlSeA7VJVVzoFxlsHVycXFY=");
		background.setScaleX(2.6);
		background.setScaleY(2.25);
		
		//center the image
		background.setX(450);
		background.setY(230);
		
		pane.getChildren().addAll(background);
		
		
			
		
	}
	
	public void show() {
		stage.show();
	}
	
	private void entryLabel() {
		//can combine images with labels
		Label label1 = new Label("Welcome to CyberTeach, the tool made to teach teenagers more about cybersecurity by applying it to their everyday lives.");
		Label label2 = new Label("There will be 5 scenarios to help you through your journey. We hope you have fun and enjoy your experience!");
		label1.setWrapText(true);
		label1.setLayoutX(0);
		label1.setLayoutY(600);
		label2.setLayoutX(50);
		label2.setLayoutY(650);
		label1.setFont(new Font("Cambria", 29));
		label1.setTextFill(Color.BISQUE);
		label2.setFont(new Font("Cambria", 29));
		label2.setTextFill(Color.BISQUE);
		pane.getChildren().add(label1);
		pane.getChildren().add(label2);
		
		
		
	}
	
//	private void addGoButton(Main button) {
//		button.setLayoutX(100);
//		button.setLayoutY(150);
//		
//	}
//	
	
	
	private void createLoadSongsButton() {
		
//		ImageView imageView = new ImageView("https://image.flaticon.com/icons/png/512/61/61972.png");
//		imageView.setScaleX(.1);
//		imageView.setScaleY(.1);
//		
		Button button = new Button("Load songs");
		
		button.setPrefWidth(100);
		button.setPrefHeight(25);
		
		
		AnchorPane.setLeftAnchor(button, 5.0);
		AnchorPane.setBottomAnchor(button, 5.0);
		
		button.setOnAction( e -> {

			Media letterSound = new Media(new File("music/560445_migfus20_future-chill-music.mp3").toURI().toString());
			MediaPlayer mediaPlayer = new MediaPlayer(letterSound);
			mediaPlayer.play();
			
		});
		
		pane.getChildren().add(button);
		
		
	}
	private void createAdditionalButton() {
		//in here I adjusted the height of the button
		Button button = new Button("Additional One");
		button.setPrefWidth(150);
		button.setPrefHeight(150);
		AnchorPane.setBottomAnchor(button, 6.0);
		AnchorPane.setRightAnchor(button, 6.0);
		pane.getChildren().add(button);
		
	}
	
	private void createButton() {
		Button button = new Button();
		button.setLayoutX(200);
		button.setLayoutY(200);
		pane.getChildren().add(button);
		
		button.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				System.out.println("Yes it worked");
				//button.scaleXProperty();
			}
			

			
			
			
		});
	}
	
	
	
	private void createHelpButton() {
		Button button = new Button();
		button.setText("Learn!");
		button.setScaleX(2);
		button.setScaleY(2);
		button.setLayoutX(50);
		button.setLayoutY(20);
		pane.getChildren().add(button);
		
		button.setOnAction(e -> {
			//create either a miniwindow with what to say, or a popup
			HelpMenu helpmenu= new HelpMenu();
			//helpmenu.setTitle("Scenario1");
			helpmenu.show();
			
		});
	}
	public void createLearnerButton() {
		MenuItem scenario1 = new MenuItem("Scenario 2 Learner!");
		MenuItem scenario2 = new MenuItem("Scenario 1 Learner!");
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
			stage.close();
		
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 2
			Scenario2Learner scenariotoShow= new Scenario2Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3Learner scenariotoShow= new Scenario3Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4Learner scenariotoShow= new Scenario4Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5Learner scenariotoShow= new Scenario5Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
			
		});
		
		menuButton.setLayoutX(0);
		menuButton.setLayoutY(30);
		
		pane.getChildren().addAll(menuButton);
	}
	
	private void setTitle() {
		Label label = new Label("Welcome to CyberTeach!");
		label.setFont(new Font("Cambria", 20));
		label.setTextFill(Color.WHITESMOKE);
		//label.setPrefSize(MAIN_WINDOW_WIDTH, MAIN_WINDOW_WIDTH);
		label.setScaleX(5);
		label.setScaleY(8);
		label.setLayoutX(700);
		label.setLayoutY(40);
		pane.getChildren().add(label);
		
		
	}
	
	
	private void setScenarioOptions() {
		//successfully makes the scenario options
		
		MenuItem scenario1 = new MenuItem("Scenario 1!");
		MenuItem scenario2 = new MenuItem("Scenario 2!");
		MenuItem scenario3 = new MenuItem("Scenario 3!");
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
		
		scenario1.setOnAction(e ->  {
			//switch to scene 1
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
			
			
			
			
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 2
			Scenario2 scenariotoShow= new Scenario2();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3 scenariotoShow= new Scenario3();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4 scenariotoShow= new Scenario4();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5 scenariotoShow= new Scenario5();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage.close();
			
			
			
		});
		//MenuButton scenarios = new MenuButton("Scenarios", null, scenario1, scenario2, scenario3, scenario4);4
		
		menuButton.setLayoutX(1350);
		menuButton.setLayoutY(20);
		
		pane.getChildren().addAll(menuButton);
		
		
		
	}
	
//	private void createBackground() {
//		
//		// specify where it's coming fromImage backgroundImage = new Image("")
//	}
	
	
	public void music() {
//		MediaPlayer mediaPlayer;
//		String s = "music/560445_migfus20_future-chill-music.mp3";
//		//creates an error on the line underneath
//		Media h = new Media(Paths.get(s).toUri().toString());
//		mediaPlayer = new MediaPlayer(h);
//		mediaPlayer.play();
		
		//does not like the link to the music
//		Media musicFile = new Media(Paths.get().toUri().toString());
//		MediaPlayer mediaPlayer = new MediaPlayer(musicFile);
//		mediaPlayer.play();
		
//		Media m = new Media(Paths.get().toUri().toString());
//		new MediaPlayer(m).play();
		
		
		
	}
	
	


	public Stage getMainStage() {
		
		return stage;
	}





//	public static void main(String args[]) {
//		
//		
//		
//	}


	
	
	
	
	
	
	

	

}

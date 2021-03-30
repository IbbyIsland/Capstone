package View;

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

public class Scenario3 {

	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	public Stage stage3;
	private Scene scenario3;
	private AnchorPane pane;
	public ImageView firstImage = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6EZJYEg7mYZQQ-nalUlS01sM1fUnULmi57w&usqp=CAU");
	public ImageView secondImage = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShHaWla6bXjYcF8JJcjdDWJjf9g0dm1ckh3A&usqp=CAU");
	public ImageView thirdImage = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxGH5K3br0nVGGQ3ajCJRcUGWLcMg3_lAzLg&usqp=CAU");
	//public ImageView fourthImage = new ImageView("");
	public ImageView option1Image = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkfOtHk7h0ifsNgHsz3Hhfuo32J__s8U-T8A&usqp=CAU");
	public Label option1Answer = new Label("Correct! This is akin to using encryption technology such as IPSec or HTTPS, to protect your data from being seen by others");
	
	public ImageView option2Image = new ImageView("https://www.confused.com/-/media/confused/articles/on-the-road/safety/robber-looking-into-car-article-image.jpg?la=en-gb&hash=DA1FD0D4052449DF477B253FF18521D61E7B01F3");
	public Label option2Answer = new Label("Incorrect! This is akin to trusting that people won't look into your critical data, which would be very unsafe. As such, you should take precautions against your data being looked into.");
	
	public ImageView option3Image = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRj8Vn4fEhTxRuursyC58KY9fto2x3RTml6Rg&usqp=CAU");
	public Label option3Answer = new Label("Correct! This would be akin to creating a Virtual Private Network between only you and your desination that noone else would have access to.");
	
	public ImageView option4Image = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQl7plLdjidG81wbr7FjtCIvRz-QVR6AYZ6dA&usqp=CAU");
	public Label option4Answer = new Label("Correct! Using something like AES to encrypt the data and keep it confidential so that only the destination reader can make sense of it.");
	
	public Scenario3() {
		stage3 = new Stage();
		pane = new AnchorPane();
		scenario3 = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT);
		stage3.setScene(scenario3);
		stage3.setTitle("CyberTeach, The game for Teenagers!");
		
		
		pane.setBackground(new Background(new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY)));
		
		backButton();
		setScenarioOptions();
		firstImages();
		firstLabel();
		scenarioOptions();
	}
	
	public void backButton() {
		
		
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(100);
		backToMainMenu.setWrapText(true);
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stage3.close();
		});
		
		
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	
	public void firstImages() {
		firstImage.setLayoutX(210);
		firstImage.setLayoutY(580);
		//firstImage.setRotate(360);
		
		secondImage.setLayoutX(0);
		secondImage.setLayoutY(550);
		secondImage.setScaleY(.7);
		
		thirdImage.setLayoutX(1250);
		thirdImage.setLayoutY(550);
		
		
		
		
		pane.getChildren().addAll(firstImage, secondImage, thirdImage);
	
	}
	
	public void firstLabel() {
		
		Label label = new Label("The president must carry a briefcase of confidential information to his destination client. However, he must do so without anyone other than the destination client, seeing the briefcase or knowing its content. What should he do?");
		label.setMaxWidth(600);
		label.setWrapText(true);
		label.setFont(new Font("Cambria", 20));
		label.setTextFill(javafx.scene.paint.Color.BLUE);
		label.setLayoutX(450);
		label.setLayoutY(0);
		
		
		pane.getChildren().add(label);
	}
	
	public void scenarioOptions() {
		Label option1Label = new Label("Use Window Tint so noone can see inside :");
		option1Label.setLayoutX(0);
		option1Label.setLayoutY(200);
		option1Label.setFont(new Font("Cambria", 15));
		option1Label.setTextFill(Color.ORANGE);
		
		RadioButton option1 = new RadioButton("A");
		option1.setLayoutX(0);
		option1.setLayoutY(220);
		option1.setFont(new Font("Cambria", 15));
		option1.setTextFill(Color.ORANGE);
		//option1.setPrefHeight(50);
		//option1.setPrefWidth(50);
		
		
		Label option2Label = new Label("Hope the president can just drive to the destination without anyone noticing: ");
		option2Label.setLayoutX(900);
		option2Label.setLayoutY(200);
		option2Label.setFont(new Font("Cambria", 15));
		option2Label.setTextFill(Color.ORANGE);
		RadioButton option2 = new RadioButton("B");
		option2.setFont(new Font("Cambria", 15));
		option2.setTextFill(Color.ORANGE);
		option2.setPrefHeight(50);
		option2.setPrefWidth(50);
		option2.setLayoutX(900);
		option2.setLayoutY(220);
		
		Label option3Label = new Label("Secure a private road between the president and the destination: ");
		option3Label.setLayoutX(0);
		option3Label.setLayoutY(400);
		option3Label.setFont(new Font("Cambria", 15));
		option3Label.setTextFill(Color.ORANGE);
		RadioButton option3 = new RadioButton("C");
		option3.setFont(new Font("Cambria", 15));
		option3.setTextFill(Color.ORANGE);
		option3.setPrefHeight(50);
		option3.setPrefWidth(50);
		option3.setLayoutX(0);
		option3.setLayoutY(420);
		
		
		Label option4Label = new Label("Configure the data in such a way that it can't be read by anyone other than the president or client: ");
		option4Label.setLayoutX(900);
		option4Label.setLayoutY(400);
		option4Label.setFont(new Font("Cambria", 15));
		option4Label.setTextFill(Color.ORANGE);
		
		RadioButton option4 = new RadioButton("D");
		option4.setFont(new Font("Cambria", 15));
		option4.setTextFill(Color.ORANGE);
		
		option4.setLayoutX(900);
		option4.setLayoutY(420);
		
		ToggleGroup buttonGroup = new ToggleGroup();
		option1.setToggleGroup(buttonGroup);
		option2.setToggleGroup(buttonGroup);
		option3.setToggleGroup(buttonGroup);
		option4.setToggleGroup(buttonGroup);
		
		
		option1.setOnAction(e -> {
			//set the image view and clear the other images
			firstImage.setVisible(false);
			secondImage.setVisible(false);
			thirdImage.setVisible(false);
			option2Image.setVisible(false);
			option3Image.setVisible(false);
			option4Image.setVisible(false);
			option1Image.setVisible(true);
			
			option1Answer.setVisible(true);
			option2Answer.setVisible(false);
			option3Answer.setVisible(false);
			option4Answer.setVisible(false);
			
			option1Image.setLayoutX(50);
			option1Image.setLayoutY(550);
			option1Image.setScaleX(1.5);
			option1Image.setScaleY(1.3);
			
			option1Answer.setLayoutX(600);
			option1Answer.setLayoutY(550);
			option1Answer.setTextFill(javafx.scene.paint.Color.GREEN);
			option1Answer.setFont(new Font("Cambria", 15));
			
			if (!pane.getChildren().contains(option1Image) && !pane.getChildren().contains(option1Answer)) {
				pane.getChildren().add(option1Image);
				pane.getChildren().add(option1Answer);
				
				
			}
			
		});
		
		option2.setOnAction(e -> {
			firstImage.setVisible(false);
			secondImage.setVisible(false);
			thirdImage.setVisible(false);
			option2Image.setVisible(true);
			option3Image.setVisible(false);
			option4Image.setVisible(false);
			option1Image.setVisible(false);
			
			option1Answer.setVisible(false);
			option2Answer.setVisible(true);
			option3Answer.setVisible(false);
			option4Answer.setVisible(false);
			
			option2Image.setLayoutX(0);
			option2Image.setLayoutY(475);
			option2Image.setScaleX(.8);
			option2Image.setScaleY(.6);
			
			option2Answer.setLayoutX(650);
			option2Answer.setLayoutY(550);
			option2Answer.setTextFill(javafx.scene.paint.Color.RED);
			option2Answer.setFont(new Font("Cambria", 15));
			option2Answer.setMaxWidth(600);
			option2Answer.setWrapText(true);
			
			
			if (!pane.getChildren().contains(option2Image) && !pane.getChildren().contains(option2Answer)) {
				pane.getChildren().add(option2Image);
				pane.getChildren().add(option2Answer);
			}
		});
		option3.setOnAction(e -> {
			firstImage.setVisible(false);
			secondImage.setVisible(false);
			thirdImage.setVisible(false);
			option2Image.setVisible(false);
			option3Image.setVisible(true);
			option4Image.setVisible(false);
			option1Image.setVisible(false);
			
			option1Answer.setVisible(false);
			option2Answer.setVisible(false);
			option3Answer.setVisible(true);
			option4Answer.setVisible(false);
			
			option3Image.setLayoutX(20);
			option3Image.setLayoutY(550);
			
			option3Answer.setLayoutX(600);
			option3Answer.setLayoutY(550);
			option3Answer.setTextFill(javafx.scene.paint.Color.GREEN);
			option3Answer.setFont(new Font("Cambria", 15));
			
			if (!pane.getChildren().contains(option3Image) && !pane.getChildren().contains(option4Answer)) {
				pane.getChildren().add(option3Image);
				pane.getChildren().add(option3Answer);
			}
			
		});
		option4.setOnAction(e -> {
			firstImage.setVisible(false);
			secondImage.setVisible(false);
			thirdImage.setVisible(false);
			option2Image.setVisible(false);
			option3Image.setVisible(false);
			option4Image.setVisible(true);
			option1Image.setVisible(false);
			
			option1Answer.setVisible(false);
			option2Answer.setVisible(false);
			option3Answer.setVisible(false);
			option4Answer.setVisible(true);
			
			option4Image.setLayoutX(0);
			option4Image.setLayoutY(550);
			option4Image.setScaleX(2);
			
			
			option4Answer.setLayoutX(600);
			option4Answer.setLayoutY(550);
			option4Answer.setTextFill(javafx.scene.paint.Color.GREEN);
			option4Answer.setFont(new Font("Cambria", 15));
			
			if (!pane.getChildren().contains(option4Image) && !pane.getChildren().contains(option4Answer) ) {
				pane.getChildren().add(option4Image);
				pane.getChildren().add(option4Answer);
				
			}
			
		});
		
		
		pane.getChildren().addAll(option1, option2, option3, option4, option1Label, option2Label, option3Label, option4Label);
		
		
		
	}
	
	
	public void setScenarioOptions() {
		//successfully makes the scenario options
		
		
		MenuItem scenario1 = new MenuItem("Scenario 1!");
		MenuItem scenario2 = new MenuItem("Scenario 2!");
		MenuItem scenario4 = new MenuItem("Scenario 4!");
		
		MenuButton menuButton = new MenuButton("Choose your scenario1!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario4);
		
		
		scenario1.setOnAction(e ->  {
			
			//switch to scene 2
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage3.close();
			
			
			
			
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 3
			Scenario2 scenariotoShow= new Scenario2();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage3.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4 scenariotoShow= new Scenario4();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage3.close();
			
			
			
		});
		//MenuButton scenarios = new MenuButton("Scenarios", null, scenario1, scenario2, scenario3, scenario4);4
		
		menuButton.setLayoutX(1350);
		menuButton.setLayoutY(20);
		
		pane.getChildren().addAll(menuButton);
		
		
		
	}
	
	public void show() {
		stage3.show();
	}
	
	public void background() {
		//BackgroundFill background_fill = new BackgroundFill(java.awt.Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

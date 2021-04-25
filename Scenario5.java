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

public class Scenario5 {
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stage5;
	private Scene scenario5;
	private AnchorPane pane;
	
	public Label optionLabelA = new Label("Correct! In cybersecurity terms, this would relate to making a 'hot site' where you can still operate if your regular place of work is unavailable.");
	public Label optionLabelB = new Label("Correct! In cybersecurity terms, this would relate to doing 'tabletop exercises' in which you and your employees would go over what to do under certain situations.");
	public Label optionLabelC = new Label("Correct! In cybersecurity terms, this would equate to making 'Threat assessments' or a 'Business impact Analysis' in which you would examine the possible threats against your business while in a certain area. ");
	public Label optionLabelD = new Label("Incorrect! You should never wait until a disaster hits to prepare, and this is especially important in cybersecurity.");
	
	public Label option2LabelA = new Label("Correct! In cybersecurity terms, this would be the same as creating 'incremental backups'. hese backups let you see and possibly replicate what you had every day in case data is lost.");
	public Label option2LabelB = new Label("Correct! In cybersecurity, you never want to have a single point in failure, as in, having all of your networks functions dependent on one tool always working. As such, you should separate the duties of that tool to other tools");
	public Label option2LabelC = new Label("Correct! In cybersecurity, this would equate to having a 'Redundant Array of Inexpensive Disks' in which you would always have at least 1 disk to back up another disk.");
	public Label option2LabelD = new Label("Incorrect! You should never assume that your system or project will always be safe and readily available.");
	
	public ImageView image = new ImageView("https://media.istockphoto.com/photos/rows-of-shelves-picture-id1138429558?k=6&m=1138429558&s=612x612&w=0&h=Vp_3KUoOalc0R1VYZwqbZK1g-hsiyg501J_RwJa6kA4=");
	
	public ImageView image2 = new ImageView("https://www.myconnectpartners.com/wp-content/uploads/2017/11/3-6-12-tabletop-meeting.jpg");
	
	public ImageView image3 = new ImageView("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8iZ3vtmblfJkuwdgon1yYXorDPhrg5C3HTw&usqp=CAU");
	
	public ImageView image4 = new ImageView("http://cache.boston.com/bonzai-fba/Third_Party_Photo/2007/08/21/1187708852_9268.jpg");
	
	
	public ImageView image21 = new ImageView("https://networkencyclopedia.com/wp-content/uploads/2019/10/incremental-backup.png");
	
	public ImageView image22 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/8/83/Single_Point_of_Failure.png");
	
	public ImageView image23 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/RAID_1.svg/150px-RAID_1.svg.png");
	
	public ImageView image24 = new ImageView("http://www.hmmrmedia.com/wp-content/uploads/2019/05/man-facepalming.png");
	
	public Scenario5() {
		stage5 = new Stage();
		pane = new AnchorPane();
		scenario5 = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT);
		stage5.setScene(scenario5);
		stage5.setTitle("CyberTeach, The game for Teenagers!     Availability");
		stage5.setFullScreen(true);
		
		pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		createBackground();
		backButton();
		setScenarioOptions();
		label();
		executable();
		executable2();
		createLearnerButton();
		
	}
	public void backButton() {
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(100);
		backToMainMenu.setWrapText(true);
		
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stage5.close();
		});
		
		
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
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
			stage5.close();
		
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 2
			Scenario2Learner scenariotoShow= new Scenario2Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3Learner scenariotoShow= new Scenario3Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4Learner scenariotoShow= new Scenario4Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5Learner scenariotoShow= new Scenario5Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
			
		});
		
		menuButton.setLayoutX(1330);
		menuButton.setLayoutY(80);
		
		pane.getChildren().addAll(menuButton);
	}
	
	public void createBackground() {
		
		ImageView background = new ImageView("https://st3.depositphotos.com/2978065/17214/v/600/depositphotos_172146102-stock-video-4k-animation-3d-abstract-dark.jpg");
		background.setScaleX(2.55);
		background.setScaleY(2.35);
		
		
		
		background.setX(460);
		background.setY(230);
		
		pane.getChildren().addAll(background);
		
		
	}
	
	public void setScenarioOptions() {
		//successfully makes the scenario options
		
		MenuItem scenario1 = new MenuItem("Scenario 1!");
		MenuItem scenario2 = new MenuItem("Scenario 2!");
		MenuItem scenario3 = new MenuItem("Scenario 3!");
		MenuItem scenario4 = new MenuItem("Scenario 4!");
		
		
		MenuButton menuButton = new MenuButton("Choose your scenario!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario4);
		
		
		scenario1.setOnAction(e ->  {
			
			//switch to scene 2
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
			
			
		});
		
		scenario2.setOnAction(e ->  {
			
			//switch to scene 2
			Scenario2 scenariotoShow= new Scenario2();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3 scenariotoShow= new Scenario3();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4 scenariotoShow= new Scenario4();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stage5.close();
			
			
			
		});
		
		menuButton.setLayoutX(1350);
		menuButton.setLayoutY(20);
		
		pane.getChildren().addAll(menuButton);
		
	}
	
	
	public void label() {
		Label label = new Label("Your family just moved into a new neighborhood and they want to make plans for any natural disasters that might happen, ensure that they will still have a place to live in case anything happens, and above all, stay safe. What should they do?");
		label.setFont(new Font("Cambria", 19));
		label.setTextFill(Color.BLUE);
		label.setMaxWidth(450);
		label.setLayoutY(330);
		label.setWrapText(true);
		
		Label label2 = new Label("You're working on a long term science project for school and want to ensure that you don't lose any data for it. What should you do? ");
		label2.setFont(new Font("Cambria", 19));
		label2.setTextFill(Color.BLUE);
		label2.setMaxWidth(450);
		label2.setLayoutX(1000);
		label2.setLayoutY(380);
		label2.setWrapText(true);
		
		pane.getChildren().addAll(label, label2);
		
	}
	
	
	
	
	public void executable() {
		Label labelA = new Label("Move into a smaller house until your current one is fixed: ");
		labelA.setFont(new Font("Cambria", 18));
		labelA.setTextFill(Color.WHITE);
		RadioButton optionA = new RadioButton("A");
		labelA.setLayoutX(0);
		labelA.setLayoutY(450);
		optionA.setLayoutX(510);
		optionA.setLayoutY(450);
		optionA.setFont(new Font("Cambria", 20));
		optionA.setTextFill(Color.ORANGE);
		labelA.setMaxWidth(500);
		labelA.setWrapText(true);
		
		optionA.setOnAction(e -> {
			optionLabelB.setVisible(false);
			optionLabelC.setVisible(false);
			optionLabelD.setVisible(false);
			optionLabelA.setVisible(true);
			
			image2.setVisible(false);
			image3.setVisible(false);
			image4.setVisible(false);
			image.setVisible(true);
			
			optionLabelA.setLayoutX(0);
			optionLabelA.setLayoutY(100);
			optionLabelA.setTextFill(javafx.scene.paint.Color.LIGHTGREEN);
			optionLabelA.setFont(new Font("Cambria", 19));
			optionLabelA.setMaxWidth(300);
			optionLabelA.setWrapText(true);
			
			image.setScaleX(0.5);
			image.setScaleY(0.5);
//			
			image.setLayoutX(200);
			image.setLayoutY(0);
			
			
			//create the images too
			if (!pane.getChildren().contains(optionLabelA) && !pane.getChildren().contains(image)) {
				pane.getChildren().add(optionLabelA);
				pane.getChildren().add(image);
			}
			
		});
		
		Label labelB = new Label("Go over practice exercises with your family to make sure evryone knows what to do: ");
		labelB.setFont(new Font("Cambria", 18));
		labelB.setTextFill(Color.WHITE);
		RadioButton optionB = new RadioButton("B");
		labelB.setLayoutX(0);
		labelB.setLayoutY(500);
		optionB.setLayoutX(510);
		optionB.setLayoutY(500);
		optionB.setFont(new Font("Cambria", 20));
		optionB.setTextFill(Color.ORANGE);
		
		labelB.setMaxWidth(500);
		labelB.setWrapText(true);
		
		optionB.setOnAction(e -> {
			optionLabelB.setVisible(true);
			optionLabelC.setVisible(false);
			optionLabelD.setVisible(false);
			optionLabelA.setVisible(false);
			
			image2.setVisible(true);
			image3.setVisible(false);
			image4.setVisible(false);
			image.setVisible(false);
			
			optionLabelB.setLayoutX(0);
			optionLabelB.setLayoutY(100);
			optionLabelB.setTextFill(javafx.scene.paint.Color.LIGHTGREEN);
			optionLabelB.setFont(new Font("Cambria", 19));
			optionLabelB.setMaxWidth(300);
			optionLabelB.setWrapText(true);
			
			image2.setScaleX(0.5);
			image2.setScaleY(0.5);
//			
			image2.setLayoutX(200);
			image2.setLayoutY(0);
			
			
			if (!pane.getChildren().contains(optionLabelB) && !pane.getChildren().contains(image2)) {
				pane.getChildren().add(optionLabelB);
				pane.getChildren().add(image2);
			}
			
		});
		
		
		Label labelC = new Label("Identify the likelihood of an environmental threat occuring wherever they moved to: ");
		labelC.setFont(new Font("Cambria", 18));
		labelC.setTextFill(Color.WHITE);
		RadioButton optionC = new RadioButton("C");
		labelC.setLayoutX(0);
		labelC.setLayoutY(560);
		optionC.setLayoutX(480);
		optionC.setLayoutY(560);
		optionC.setFont(new Font("Cambria", 20));
		optionC.setTextFill(Color.ORANGE);
		
		labelC.setMaxWidth(500);
		labelC.setWrapText(true);
		
		optionC.setOnAction(e -> {
			optionLabelB.setVisible(false);
			optionLabelC.setVisible(true);
			optionLabelD.setVisible(false);
			optionLabelA.setVisible(false);
			
			image2.setVisible(false);
			image3.setVisible(true);
			image4.setVisible(false);
			image.setVisible(false);
			
			optionLabelC.setLayoutX(0);
			optionLabelC.setLayoutY(100);
			optionLabelC.setTextFill(javafx.scene.paint.Color.LIGHTGREEN);
			optionLabelC.setFont(new Font("Cambria", 19));
			optionLabelC.setMaxWidth(300);
			optionLabelC.setWrapText(true);
			
			image3.setScaleX(0.8);
			image3.setScaleY(0.8);
//			
			image3.setLayoutX(300);
			image3.setLayoutY(20);
			
			
			if (!pane.getChildren().contains(optionLabelC) && !pane.getChildren().contains(image3)) {
				pane.getChildren().add(optionLabelC);
				pane.getChildren().add(image3);
			}
			
		});
		
		Label labelD = new Label("Just listen to the news for whenever a disaster might strike: ");
		labelD.setFont(new Font("Cambria", 18));
		labelD.setTextFill(Color.WHITE);
		RadioButton optionD = new RadioButton("D");
		labelD.setLayoutX(0);
		labelD.setLayoutY(660);
		optionD.setLayoutX(480);
		optionD.setLayoutY(660);
		optionD.setFont(new Font("Cambria", 20));
		optionD.setTextFill(Color.ORANGE);
		
		labelD.setMaxWidth(500);
		labelD.setWrapText(true);
		
		optionD.setOnAction(e -> {
			optionLabelB.setVisible(false);
			optionLabelC.setVisible(false);
			optionLabelD.setVisible(true);
			optionLabelA.setVisible(false);
			
			image2.setVisible(false);
			image3.setVisible(false);
			image4.setVisible(true);
			image.setVisible(false);
			
			optionLabelD.setLayoutX(0);
			optionLabelD.setLayoutY(100);
			optionLabelD.setTextFill(javafx.scene.paint.Color.RED);
			optionLabelD.setFont(new Font("Cambria", 19));
			optionLabelD.setMaxWidth(300);
			optionLabelD.setWrapText(true);
			
			image4.setScaleX(0.5);
			image4.setScaleY(0.5);
//			
			image4.setLayoutX(200);
			image4.setLayoutY(0);
			
			
			if (!pane.getChildren().contains(optionLabelD) && !pane.getChildren().contains(image4)) {
				pane.getChildren().add(optionLabelD);
				pane.getChildren().add(image4);
			}
			
			
			
			
		});
		
		ToggleGroup buttonGroup = new ToggleGroup();
		optionA.setToggleGroup(buttonGroup);
		optionB.setToggleGroup(buttonGroup);
		optionC.setToggleGroup(buttonGroup);
		optionD.setToggleGroup(buttonGroup);
		
		pane.getChildren().addAll(labelA, optionA, labelB, optionB, labelC, optionC, labelD, optionD);
		
	}
	
	public void executable2() {
		
		Label labelA = new Label("Keep track of all the progress you've done day by day: ");
		labelA.setFont(new Font("Cambria", 18));
		labelA.setTextFill(Color.WHITE);
		RadioButton optionA = new RadioButton("A");
		labelA.setLayoutX(1000);
		labelA.setLayoutY(450);
		optionA.setLayoutX(1300);
		optionA.setLayoutY(450);
		optionA.setFont(new Font("Cambria", 20));
		optionA.setTextFill(Color.ORANGE);
		labelA.setMaxWidth(290);
		labelA.setWrapText(true);
		
		
		optionA.setOnAction(e -> {
			option2LabelB.setVisible(false);
			option2LabelC.setVisible(false);
			option2LabelD.setVisible(false);
			option2LabelA.setVisible(true);
			
			image22.setVisible(false);
			image23.setVisible(false);
			image24.setVisible(false);
			image21.setVisible(true);
			
			option2LabelA.setLayoutX(1100);
			option2LabelA.setLayoutY(130);
			option2LabelA.setTextFill(javafx.scene.paint.Color.LIGHTGREEN);
			option2LabelA.setFont(new Font("Cambria", 19));
			option2LabelA.setMaxWidth(300);
			option2LabelA.setWrapText(true);
			
			image21.setScaleX(0.5);
			image21.setScaleY(0.5);
//			
			image21.setLayoutX(600);
			image21.setLayoutY(0);
			
			
			//create the images too
			if (!pane.getChildren().contains(option2LabelA) && !pane.getChildren().contains(image21)) {
				pane.getChildren().add(option2LabelA);
				pane.getChildren().add(image21);
			}
			
		});
		
		Label labelB = new Label("Make sure all of your data isn't in one place: ");
		labelB.setFont(new Font("Cambria", 18));
		labelB.setTextFill(Color.WHITE);
		RadioButton optionB = new RadioButton("B");
		labelB.setLayoutX(1000);
		labelB.setLayoutY(550);
		optionB.setLayoutX(1300);
		optionB.setLayoutY(550);
		optionB.setFont(new Font("Cambria", 20));
		optionB.setTextFill(Color.ORANGE);
		labelB.setMaxWidth(290);
		labelB.setWrapText(true);
		
		optionB.setOnAction(e -> {
			option2LabelB.setVisible(true);
			option2LabelC.setVisible(false);
			option2LabelD.setVisible(false);
			option2LabelA.setVisible(false);
			
			image22.setVisible(true);
			image23.setVisible(false);
			image24.setVisible(false);
			image21.setVisible(false);
			
			option2LabelB.setLayoutX(1100);
			option2LabelB.setLayoutY(130);
			option2LabelB.setTextFill(javafx.scene.paint.Color.LIGHTGREEN);
			option2LabelB.setFont(new Font("Cambria", 19));
			option2LabelB.setMaxWidth(300);
			option2LabelB.setWrapText(true);
			
			image22.setScaleX(0.5);
			image22.setScaleY(0.5);
//			
			image22.setLayoutX(600);
			image22.setLayoutY(0);
			
			
			//create the images too
			if (!pane.getChildren().contains(option2LabelB) && !pane.getChildren().contains(image22)) {
				pane.getChildren().add(option2LabelB);
				pane.getChildren().add(image22);
			}
			
		});
		
		Label labelC = new Label("Ensure you have all your data in another notebook as well: ");
		labelC.setFont(new Font("Cambria", 18));
		labelC.setTextFill(Color.WHITE);
		RadioButton optionC = new RadioButton("C");
		labelC.setLayoutX(1000);
		labelC.setLayoutY(650);
		optionC.setLayoutX(1300);
		optionC.setLayoutY(650);
		optionC.setFont(new Font("Cambria", 20));
		optionC.setTextFill(Color.ORANGE);
		
		labelC.setMaxWidth(290);
		labelC.setWrapText(true);
		optionC.setOnAction(e -> {
			option2LabelB.setVisible(false);
			option2LabelC.setVisible(true);
			option2LabelD.setVisible(false);
			option2LabelA.setVisible(false);
			
			image22.setVisible(false);
			image23.setVisible(true);
			image24.setVisible(false);
			image21.setVisible(false);
			
			option2LabelC.setLayoutX(1100);
			option2LabelC.setLayoutY(130);
			option2LabelC.setTextFill(javafx.scene.paint.Color.LIGHTGREEN);
			option2LabelC.setFont(new Font("Cambria", 19));
			option2LabelC.setMaxWidth(300);
			option2LabelC.setWrapText(true);
			
			image23.setScaleX(0.7);
			image23.setScaleY(0.7);
//			
			image23.setLayoutX(800);
			image23.setLayoutY(0);
			
			
			//create the images too
			if (!pane.getChildren().contains(option2LabelC) && !pane.getChildren().contains(image23)) {
				pane.getChildren().add(option2LabelC);
				pane.getChildren().add(image23);
			}
			
			
			
			
		});
		
		Label labelD = new Label("Hope that you've taken the necessary precautions and that nothing happens to the project: ");
		labelD.setFont(new Font("Cambria", 18));
		labelD.setTextFill(Color.WHITE);
		RadioButton optionD = new RadioButton("D");
		labelD.setLayoutX(1000);
		labelD.setLayoutY(730);
		optionD.setLayoutX(1300);
		optionD.setLayoutY(730);
		optionD.setFont(new Font("Cambria", 20));
		optionD.setTextFill(Color.ORANGE);
		
		labelD.setMaxWidth(290);
		labelD.setWrapText(true);
		
		optionD.setOnAction(e -> {
			option2LabelB.setVisible(false);
			option2LabelC.setVisible(false);
			option2LabelD.setVisible(true);
			option2LabelA.setVisible(false);
			
			image22.setVisible(false);
			image23.setVisible(false);
			image24.setVisible(true);
			image21.setVisible(false);
			
			option2LabelD.setLayoutX(1100);
			option2LabelD.setLayoutY(130);
			option2LabelD.setTextFill(javafx.scene.paint.Color.RED);
			option2LabelD.setFont(new Font("Cambria", 19));
			option2LabelD.setMaxWidth(300);
			option2LabelD.setWrapText(true);
			
			image24.setScaleX(0.5);
			image24.setScaleY(0.5);
//			
			image24.setLayoutX(600);
			image24.setLayoutY(0);
			
			
			//create the images too
			if (!pane.getChildren().contains(option2LabelD) && !pane.getChildren().contains(image24)) {
				pane.getChildren().add(option2LabelD);
				pane.getChildren().add(image24);
			}
			
		});
		
		
		ToggleGroup buttonGroup = new ToggleGroup();
		optionA.setToggleGroup(buttonGroup);
		optionB.setToggleGroup(buttonGroup);
		optionC.setToggleGroup(buttonGroup);
		optionD.setToggleGroup(buttonGroup);
		
		pane.getChildren().addAll(labelA, optionA, labelB, optionB, labelC, optionC, labelD, optionD);
		
		
		
		
	}
	
	public void show() {
		stage5.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

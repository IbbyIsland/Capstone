package View;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario5Learner {
	
	//just use a menuButton event and use it like how you did for all the other scenarios, use setOnAction
	
	
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageLearn5;
	private Scene learner;
	private AnchorPane pane;
	ImageView background = new ImageView("https://images.unsplash.com/photo-1521449256184-170b4a4c437c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1049&q=80");

	ChoiceBox<String> ports = new ChoiceBox<String>();
	ChoiceBox<String> sourceIp = new ChoiceBox<String>();
	ChoiceBox<String> destinationIp = new ChoiceBox<String>();
	ChoiceBox<String> actions = new ChoiceBox<String>();
	
	
	Line lineforInternet = new Line();
	Line lineforWeb = new Line();
	Line lineforDNS = new Line();
	Line linefor210 = new Line();
	Line linefor211 = new Line();
	Line lineforEmail = new Line();
	
	//make a line for every route, and change it's color whenever the action is fit
	//turn the menuItems into choiceboxes
	
	
	
	public ImageView image = new ImageView("http://etutorials.org/shared/images/tutorials/tutorial_56/02fig06.gif");
	public Scenario5Learner() {
		stageLearn5 = new Stage();
		pane = new AnchorPane();
		learner = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageLearn5.setScene(learner);
		stageLearn5.setTitle("Scenario5Learner");
		stageLearn5.setFullScreen(true);
		
		background.setLayoutX(320);
		background.setLayoutY(150);
		background.setScaleX(2.1);
		background.setScaleY(1.8);
		pane.getChildren().add(background);
		
		network();
		fireWall();
		backButton();
		setScenarioOptions();
		createLearnerButton();
		//whenever the action is changed
		
		
		
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
			stageLearn5.close();
			
			
			
			
		});
		
		scenario1.setOnAction(e ->  {
			//switch to scene 3
			Scenario1 scenariotoShow= new Scenario1();
			scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
			
			
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 3
			Scenario2 scenariotoShow= new Scenario2();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4 scenariotoShow= new Scenario4();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
			
			
			
		});
		
		scenario5.setOnAction(e ->  {
			Scenario5 scenariotoShow= new Scenario5();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
			
			
			
		});
		//MenuButton scenarios = new MenuButton("Scenarios", null, scenario1, scenario2, scenario3, scenario4);4
		
		menuButton.setLayoutX(1250);
		menuButton.setLayoutY(680);
		
		pane.getChildren().addAll(menuButton);
		
		
		
	}
	public void createLearnerButton() {
		MenuItem scenario1 = new MenuItem("Scenario 1 Learner!");
		MenuItem scenario2 = new MenuItem("Scenario 2 Learner!");
		MenuItem scenario3 = new MenuItem("Scenario 3 Learner!");
		MenuItem scenario4 = new MenuItem("Scenario 4 Learner!");
		//MenuItem scenario5 = new MenuItem("Scenario 5 Learner!");
		
		MenuButton menuButton = new MenuButton("Choose your Learner Scenario!", null);
		menuButton.setScaleX(1);
		menuButton.setScaleY(2);
		
		menuButton.getItems().add(scenario1);
		menuButton.getItems().add(scenario2);
		menuButton.getItems().add(scenario3);
		menuButton.getItems().add(scenario4);
		
		
		scenario1.setOnAction(e ->  {
			//switch to scene 1
			Scenario1Learner scenariotoShow= new Scenario1Learner();
			//scenariotoShow.setTitle("Scenario1");
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
		
		});
		scenario2.setOnAction(e ->  {
			//switch to scene 2
			Scenario2Learner scenariotoShow= new Scenario2Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
			
			
			
		});
		scenario3.setOnAction(e ->  {
			//switch to scene 3
			Scenario3Learner scenariotoShow= new Scenario3Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
			
			
		});
		scenario4.setOnAction(e ->  {
			Scenario4Learner scenariotoShow= new Scenario4Learner();
			scenariotoShow.show();
			//include a way to get back to the main Window and a way to go to the next Scene
			stageLearn5.close();
			
			
			
		});
		
		
		
		menuButton.setLayoutX(1000);
		menuButton.setLayoutY(680);
		
		pane.getChildren().addAll(menuButton);
	}
	
	
	
	
	public void show() {
		stageLearn5.show();
	}
	
	public void backButton() {
		
		
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(150);
		backToMainMenu.setWrapText(true);
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stageLearn5.close();
		});
		
		backToMainMenu.setLayoutX(0);
		backToMainMenu.setLayoutY(750);
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	
	public void network() {
		
		image.setX(0);
		image.setY(100);
		image.setScaleY(1.5);
		
		pane.getChildren().add(image);
		
		Label label = new Label("Welcome to your very own firewall! In Cybersecurity, professionals configure firewalls for their companies in order to control what kinds of services come into and out of their servers. More importantly, it enables the company to know how to handle internet traffic and control the size of the attack surface presented by the insecure Internet. Play with this firewall to configure what servers go from which machine to another, and decide whether or not to permit the traffic! ");
		label.setLayoutX(0);
		label.setLayoutY(500);
		label.setFont(new Font("Cambria", 21));
		label.setTextFill(Color.BLACK);
		label.setMaxWidth(500);
		label.setWrapText(true);
		
		Label label2 = new Label("Press Apply to set the firewall to whichever configuration you make!");
		label2.setLayoutX(850);
		label2.setLayoutY(550);
		label2.setFont(new Font("Cambria", 20));
		label2.setTextFill(Color.BLACK);
		label2.setMaxWidth(500);
		label2.setWrapText(true);
		
		
		Label label3 = new Label("The workgroup switch can also be used as a Firewall.");
		label3.setLayoutX(500);
		label3.setLayoutY(100);
		label3.setMaxWidth(300);
		label3.setWrapText(true);
		label3.setFont(new Font("Cambria", 18));
		label3.setTextFill(Color.BLACK);
		
		Label label4 = new Label("The Email, Web, and DNS servers cannot connect to each other.");
		label4.setLayoutX(500);
		label4.setLayoutY(200);
		label4.setMaxWidth(300);
		label4.setWrapText(true);
		label4.setFont(new Font("Cambria", 18));
		label4.setTextFill(Color.BLACK);
		
		
		
		pane.getChildren().addAll(label, label2, label3, label4);
		
	}
	
	public void fireWall() {
		//Label label = new Label("")
		Rectangle rect = new Rectangle();
		rect.setX(850);
		rect.setY(0);
		rect.setWidth(700);
		rect.setHeight(500);
		rect.setFill(Color.WHITE);
		rect.setOpacity(0.6);
		
		Label firewallLabel = new Label("This is your firewall!");
		firewallLabel.setLayoutX(1100);
		firewallLabel.setLayoutY(0);
		firewallLabel.setFont(new Font("Cambria", 20));
		firewallLabel.setTextFill(Color.LIMEGREEN);
		
		Line line = new Line();
		line.setStartX(850);
		line.setStartY(50);
		line.setEndX(1550);
		line.setEndY(50);
		line.setStroke(Color.DARKRED);
		line.setOpacity(0.8);
		
		Label portLabel = new Label("Port:");
		portLabel.setLayoutX(900);
		portLabel.setLayoutY(100);
		
		lineforInternet.setStartX(180);
		lineforInternet.setStartY(230);
		lineforInternet.setEndX(265);
		lineforInternet.setEndY(230);
		lineforInternet.setOpacity(1.0);
		lineforInternet.setStrokeWidth(3);
		lineforInternet.setVisible(false);
		
		lineforWeb.setStartX(80);
		lineforWeb.setStartY(360);
		lineforWeb.setEndX(136);
		lineforWeb.setEndY(243);
		lineforWeb.setOpacity(1.0);
		lineforWeb.setStrokeWidth(3);
		lineforWeb.setVisible(false);
		
		lineforEmail.setStartX(160);
		lineforEmail.setStartY(248);
		lineforEmail.setEndX(215);
		lineforEmail.setEndY(345);
		lineforEmail.setOpacity(1.0);
		lineforEmail.setStrokeWidth(3);
		lineforEmail.setVisible(false);
		
		lineforDNS.setStartX(145);
		lineforDNS.setStartY(248);
		lineforDNS.setEndX(145);
		lineforDNS.setEndY(345);
		lineforDNS.setOpacity(1);
		lineforDNS.setStrokeWidth(3);
		
		lineforDNS.setVisible(false);
		
		linefor211.setStartX(145);
		linefor211.setStartY(210);
		linefor211.setEndX(145);
		linefor211.setEndY(128);
		linefor211.setOpacity(1);
		linefor211.setStrokeWidth(3);
		linefor211.setVisible(false);
		
		linefor210.setStartX(50);
		linefor210.setStartY(100);
		linefor210.setEndX(135);
		linefor210.setEndY(210);
		linefor210.setOpacity(1);
		linefor210.setStrokeWidth(3);
		linefor210.setVisible(false);
		
		
		
		
		ports.setLayoutX(870);
		ports.setLayoutY(150);
		
		Label source = new Label("Source IP:");
		source.setLayoutX(1050);
		source.setLayoutY(100);
		
		
		
		
		
		ports.getItems().add("Internet/Any");
		ports.getItems().add("587-SMTP");
		ports.getItems().add("80-HTTP");
		ports.getItems().add("53-DNS");
		
		
		
		
		sourceIp.getItems().add("Internet/Any");
		sourceIp.getItems().add("200.1.1.4");
		sourceIp.getItems().add("200.1.1.3");
		sourceIp.getItems().add("200.1.1.2");
		sourceIp.getItems().add("200.1.1.10");
		sourceIp.getItems().add("200.1.1.11");
		
		sourceIp.setLayoutX(1020);
		sourceIp.setLayoutY(150);
		
		
		Label destination = new Label("Destination IP:");
		destination.setLayoutX(1300);
		destination.setLayoutY(100);
		
		
		
		
		destinationIp.getItems().add("Internet/Any");
		destinationIp.getItems().add("200.1.1.4");
		destinationIp.getItems().add("200.1.1.3");
		destinationIp.getItems().add("200.1.1.2");
		destinationIp.getItems().add("200.1.1.10");
		destinationIp.getItems().add("200.1.1.11");
		
		destinationIp.setLayoutX(1290);
		destinationIp.setLayoutY(150);
		
		Label action = new Label("Action:");
		action.setLayoutX(1450);
		action.setLayoutY(100);
		
		//make a listener for whenever the choice for actions is selected
		
		
		actions.getItems().add("Deny");
		actions.getItems().add("Permit");
		
		actions.setLayoutX(1440);
		actions.setLayoutY(150);
		
		Button listener = new Button("Apply!");
		
		listener.setOnAction(e -> {
			//clear the entire thing once clicked, from Internet/Anything else that had been up
			lineforInternet.setVisible(false);
			lineforWeb.setVisible(false);
			lineforEmail.setVisible(false);
			lineforDNS.setVisible(false);
			linefor211.setVisible(false);
			linefor210.setVisible(false);
			
			if (ports.getValue() == "Internet/Any" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Deny") {
				//make everything red
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				lineforWeb.setStroke(Color.RED);
				lineforWeb.setVisible(true);
				lineforEmail.setStroke(Color.RED);
				lineforEmail.setVisible(true);
				lineforDNS.setStroke(Color.RED);
				lineforDNS.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
				
			}
			
			if (ports.getValue() == "Internet/Any" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Permit") {
				//make everything red
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				lineforWeb.setStroke(Color.LIMEGREEN);
				lineforWeb.setVisible(true);
				lineforEmail.setStroke(Color.LIMEGREEN);
				lineforEmail.setVisible(true);
				lineforDNS.setStroke(Color.LIMEGREEN);
				lineforDNS.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
				
			}
			if (ports.getValue() == "Internet/Any" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "Internet/Any" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "Internet/Any" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			
			if (ports.getValue() == "Internet/Any" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			
			if (ports.getValue() == "587-SMTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "587-SMTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			
			
			if (ports.getValue() == "587-SMTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "587-SMTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			
			if (ports.getValue() == "80-HTTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "80-HTTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			
			if (ports.getValue() == "80-HTTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "80-HTTP" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			
			if (ports.getValue() == "53-DNS" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "53-DNS" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			
			if (ports.getValue() == "53-DNS" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
			}
			
			if (ports.getValue() == "53-DNS" && sourceIp.getValue() == "Internet/Any" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			
			//conditions for if the internet wants to connect to Internet/Any other services
			if(sourceIp.getValue() == "Internet/Any" && destinationIp.getValue()== "200.1.1.2" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				lineforWeb.setStroke(Color.RED);
				lineforWeb.setVisible(true);
			}
			
			if(sourceIp.getValue() == "Internet/Any" && destinationIp.getValue()== "200.1.1.2" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				lineforWeb.setStroke(Color.LIMEGREEN);
				lineforWeb.setVisible(true);
			}
			
			if(sourceIp.getValue() == "Internet/Any" && destinationIp.getValue()== "200.1.1.3" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				lineforDNS.setStroke(Color.RED);
				lineforDNS.setVisible(true);
			}
			
			if(sourceIp.getValue() == "Internet/Any" && destinationIp.getValue()== "200.1.1.3" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				lineforDNS.setStroke(Color.LIMEGREEN);
				lineforDNS.setVisible(true);
			}
			
			if(sourceIp.getValue() == "Internet/Any" && destinationIp.getValue()== "200.1.1.4" && actions.getValue() == "Deny") {
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
				lineforEmail.setStroke(Color.RED);
				lineforEmail.setVisible(true);
			}
			
			if(sourceIp.getValue() == "Internet/Any" && destinationIp.getValue()== "200.1.1.4" && actions.getValue() == "Permit") {
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
				lineforEmail.setStroke(Color.LIMEGREEN);
				lineforEmail.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.2" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				lineforWeb.setStroke(Color.RED);
				lineforWeb.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.2" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				lineforWeb.setStroke(Color.LIMEGREEN);
				lineforWeb.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.2" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				lineforWeb.setStroke(Color.RED);
				lineforWeb.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			
			if(sourceIp.getValue() == "200.1.1.2" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				lineforWeb.setStroke(Color.LIMEGREEN);
				lineforWeb.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.3" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				lineforDNS.setStroke(Color.RED);
				lineforDNS.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.3" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				lineforDNS.setStroke(Color.LIMEGREEN);
				lineforDNS.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.3" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				lineforDNS.setStroke(Color.RED);
				lineforDNS.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.3" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				lineforDNS.setStroke(Color.LIMEGREEN);
				lineforDNS.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			
			if(sourceIp.getValue() == "200.1.1.4" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				lineforEmail.setStroke(Color.RED);
				lineforEmail.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.4" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				lineforEmail.setStroke(Color.LIMEGREEN);
				lineforEmail.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.4" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				lineforEmail.setStroke(Color.RED);
				lineforEmail.setVisible(true);
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.4" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				lineforEmail.setStroke(Color.LIMEGREEN);
				lineforEmail.setVisible(true);
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
			}
			if (sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Deny") {
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			if (sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.11" && actions.getValue() == "Permit") {
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			if (sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Deny") {
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
			}
			if (sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.10" && actions.getValue() == "Permit") {
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
			}
			
			//now do the conditions for the workgroup interacting with each other
			//now for the workgroups to communicate with the servers
			if (ports.getValue()== "587-SMTP" && sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.4" && actions.getValue() == "Deny" ) {
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
				lineforEmail.setStroke(Color.RED);
				lineforEmail.setVisible(true);
			}
			if (ports.getValue()== "587-SMTP" && sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.4" && actions.getValue() == "Permit" ) {
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
				lineforEmail.setStroke(Color.LIMEGREEN);
				lineforEmail.setVisible(true);
			}
			
			if (ports.getValue()== "587-SMTP" && sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.4" && actions.getValue() == "Deny" ) {
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
				lineforEmail.setStroke(Color.RED);
				lineforEmail.setVisible(true);
			}
			if (ports.getValue()== "587-SMTP" && sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.4" && actions.getValue() == "Permit" ) {
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
				lineforEmail.setStroke(Color.LIMEGREEN);
				lineforEmail.setVisible(true);
			}
			
			
			
			
			if (ports.getValue()== "80-HTTP" && sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.2" && actions.getValue() == "Deny" ) {
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
				lineforWeb.setStroke(Color.RED);
				lineforWeb.setVisible(true);
			}
			if (ports.getValue()== "80-HTTP" && sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.2" && actions.getValue() == "Permit" ) {
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
				lineforWeb.setStroke(Color.LIMEGREEN);
				lineforWeb.setVisible(true);
			}
			if (ports.getValue()== "80-HTTP" && sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.2" && actions.getValue() == "Deny" ) {
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
				lineforWeb.setStroke(Color.RED);
				lineforWeb.setVisible(true);
			}
			if (ports.getValue()== "80-HTTP" && sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.2" && actions.getValue() == "Permit" ) {
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
				lineforWeb.setStroke(Color.LIMEGREEN);
				lineforWeb.setVisible(true);
			}
			
			
			
			
			if(ports.getValue() == "53-DNS" && sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.3" && actions.getValue() == "Deny" ) {
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
				lineforDNS.setStroke(Color.RED);
				lineforDNS.setVisible(true);
			}
			if(ports.getValue() == "53-DNS" && sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "200.1.1.3" && actions.getValue() == "Permit" ) {
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
				lineforDNS.setStroke(Color.LIMEGREEN);
				lineforDNS.setVisible(true);
			}
			
			if(ports.getValue() == "53-DNS" && sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.3" && actions.getValue() == "Deny" ) {
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
				lineforDNS.setStroke(Color.RED);
				lineforDNS.setVisible(true);
			}
			if(ports.getValue() == "53-DNS" && sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "200.1.1.3" && actions.getValue() == "Permit" ) {
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
				lineforDNS.setStroke(Color.LIMEGREEN);
				lineforDNS.setVisible(true);
			}
			
			//now for the servers to interact with the internet as the source
			if(sourceIp.getValue() == "200.1.1.4" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Deny") {
				lineforEmail.setStroke(Color.RED);
				lineforEmail.setVisible(true);
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.4" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Permit") {
				lineforEmail.setStroke(Color.LIMEGREEN);
				lineforEmail.setVisible(true);
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
			}
			
			if(sourceIp.getValue() == "200.1.1.3" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Deny") {
				lineforDNS.setStroke(Color.RED);
				lineforDNS.setVisible(true);
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.3" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Permit") {
				lineforDNS.setStroke(Color.LIMEGREEN);
				lineforDNS.setVisible(true);
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.2" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Deny") {
				lineforWeb.setStroke(Color.RED);
				lineforWeb.setVisible(true);
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.2" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Permit") {
				lineforWeb.setStroke(Color.LIMEGREEN);
				lineforWeb.setVisible(true);
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
			}
			
			if(sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Deny") {
				linefor210.setStroke(Color.RED);
				linefor210.setVisible(true);
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.10" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Permit") {
				linefor210.setStroke(Color.LIMEGREEN);
				linefor210.setVisible(true);
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Deny") {
				linefor211.setStroke(Color.RED);
				linefor211.setVisible(true);
				lineforInternet.setStroke(Color.RED);
				lineforInternet.setVisible(true);
			}
			if(sourceIp.getValue() == "200.1.1.11" && destinationIp.getValue() == "Internet/Any" && actions.getValue() == "Permit") {
				linefor211.setStroke(Color.LIMEGREEN);
				linefor211.setVisible(true);
				lineforInternet.setStroke(Color.LIMEGREEN);
				lineforInternet.setVisible(true);
			}
			
			
		});
		listener.setLayoutX(900);
		listener.setLayoutY(350);
		
		
		
		
		pane.getChildren().addAll(rect, firewallLabel, line, portLabel, source, destination, ports, sourceIp, destinationIp, action, actions, lineforInternet, lineforWeb, lineforEmail, lineforDNS, linefor211, linefor210, listener);
		
		
		//make a listener for whenever the choicebox changes

	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

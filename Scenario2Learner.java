package View;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Scenario2Learner {
	
	
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageLearn2;
	private Scene learner;
	private AnchorPane pane;
	
	public Label ipAddress = new Label("");
	public Label ipAddressLabel = new Label("This is your IP address: ");
	public Label subnetMask = new Label("This is your subnet, everything after the bracketed text is IPV6");
	public Label subnetMaskShow = new Label("");
	
	public Scenario2Learner() {
		stageLearn2 = new Stage();
		pane = new AnchorPane();
		learner = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageLearn2.setScene(learner);
		stageLearn2.setTitle("Learner Window");
		
		pane.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		label();
		labelExplanation();
		getIPaddress();
		calculateSubnet();
		backButton();
		
	}
	
	public void show() {
		stageLearn2.show();
	}
	
	public void label() {
		Label label = new Label("Click the button to get your IP address:");
		
		label.setLayoutX(200);
		label.setLayoutY(710);
		
		pane.getChildren().add(label);
		
	}
	
	public void getIPaddress() {
		Button button = new Button("Get your IP!");
		
		button.setLayoutX(450);
		button.setLayoutY(710);
		button.setOnAction(e -> {
			try {
				InetAddress myIP = InetAddress.getLocalHost();
				ipAddress.setText(myIP.getHostAddress());
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (!pane.getChildren().contains(ipAddress) && !pane.getChildren().contains(ipAddressLabel)) {
				pane.getChildren().add(ipAddress);
				pane.getChildren().add(ipAddressLabel);
			}
			
			
			ipAddressLabel.setLayoutX(630);
			ipAddressLabel.setLayoutY(710);
			ipAddress.setLayoutX(760);
			ipAddress.setLayoutY(710);
			
			
			
			
		});
		
		
		pane.getChildren().addAll(button);
		
	}
	
	public void backButton() {
		
		
		Button backToMainMenu = new Button("Back to Main Menu!");
		backToMainMenu.setPrefHeight(50);
		backToMainMenu.setPrefWidth(100);
		backToMainMenu.setWrapText(true);
		backToMainMenu.setOnAction(e -> {
			MainMenuManager manager = new MainMenuManager();
			manager.show();
			stageLearn2.close();
		});
		
		
		//set this on action
		pane.getChildren().add(backToMainMenu);
		
		
	}
	
	public void calculateSubnet() {
		
		Button button = new Button("Get your subnet mask!");
		button.setLayoutX(200);
		button.setLayoutY(760);
		button.setOnAction(e -> {
			try {
				String addresses = "";
				InetAddress localHost = Inet4Address.getLocalHost();
				NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
				for (InterfaceAddress address : networkInterface.getInterfaceAddresses()) {
					addresses += address;
					
			}
				
				
				subnetMaskShow.setText(addresses);
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SocketException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if (!pane.getChildren().contains(subnetMask) && !pane.getChildren().contains(subnetMaskShow)) {
				pane.getChildren().add(subnetMask);
				pane.getChildren().add(subnetMaskShow);
			}
			
			subnetMask.setLayoutX(350);
			subnetMask.setLayoutY(760);
			subnetMaskShow.setLayoutX(710);
			subnetMaskShow.setLayoutY(760);
			
			
			
		});
		
		pane.getChildren().addAll(button);
		
	}
	
	public void labelExplanation() {
		
		Label label = new Label("Welcome to the Scenario1Learner, an extension of what you have/ would have covered in the Scenario1 example from the main menu. We are furthering the importance of knowing your network or computer and knowing how to protect it. While scenario1 showed you some of the ways to protect your computer or network from attackers, there are additional things that you can do to such as: ");
		Label label2 = new Label("*Installing AntiMalware. Installing antimalware can give you protection from malicious software that some attackers use, such as Malware. Examples are Norton's antivirus program, McAfee's antivirus protection, and AVG's antivirus system.");
		Label label3 = new Label("*Only going through secured and trusted Internet sites. By going through secured internet sites that can be shown from the lock symbol on the top left of every URL, you can avoid the possibility of an attack called a drive-by download, which is when attackers can install malware on your system by just having you visit their site.");
		Label label4 = new Label("*Ignore Spam. Spamming is a very common way for attackers to infect your system with malware. Spam is typically sent through email through fake email addresses. As such, you should never click on random links in those emails which is where attackers could contain malware that would affect the integrity of your computer.");
		Label label5 = new Label("*Use a VPN to hide your IP address. Using a secure virtual private network over something as inseure as the Internet would allow you great protection from others trying to listen on to your connection.");
		Label label6 = new Label("Speaking of IP addresses, we've configured a tool that allows you to find your own IP address and even your subnet, which shows you the specific range of IP addresses that your own IP address is in: ");
		
		label.setFont(new Font("Cambria", 20));
		label2.setFont(new Font("Cambria", 20));
		label3.setFont(new Font("Cambria", 20));
		label4.setFont(new Font("Cambria", 20));
		label5.setFont(new Font("Cambria", 20));
		label6.setFont(new Font("Cambria", 20));
		
		label.setMaxWidth(900);
		label2.setMaxWidth(900);
		label3.setMaxWidth(900);
		label4.setMaxWidth(900);
		label5.setMaxWidth(900);
		label6.setMaxWidth(900);
		
		label.setWrapText(true);
		label2.setWrapText(true);
		label3.setWrapText(true);
		label4.setWrapText(true);
		label5.setWrapText(true);
		label6.setWrapText(true);
		
		label.setLayoutX(200);
		label.setLayoutY(0);
		
		label2.setLayoutX(200);
		label2.setLayoutY(150);
		
		label3.setLayoutX(200);
		label3.setLayoutY(270);
		
		label4.setLayoutX(200);
		label4.setLayoutY(390);
		
		label5.setLayoutX(200);
		label5.setLayoutY(510);
		
		label6.setLayoutX(200);
		label6.setLayoutY(630);
		
		pane.getChildren().addAll(label, label2, label3, label4, label5, label6);
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

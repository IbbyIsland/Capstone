package application;

import View.MainMenuManager;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;




public class Main extends Application {
	
	Button button;
	
	@Override
	public void start(Stage primaryStage) {
			
			MainMenuManager manager = new MainMenuManager();
			
			
			primaryStage = manager.getMainStage();
			primaryStage.show();
			
			
			//primaryStage.setTitle("Title of the window");

			
			//StackPane layout = new StackPane();
						
//			Button button = new Button("Clicker");
//			button.setOnAction(this);
			
			
			
			
			
      		//layout.getChildren().add(button);
      		
      		
      		
      		
      		
      		
      		

//      		Scene scene = new Scene(layout,400,400);
//      		
//			primaryStage.setScene(scene);
//			primaryStage.show();

			
			
		
	}
	
	
//	@Override
//	public void handle(ActionEvent event) {
//		// TODO Auto-generated method stub
//		if (event.getSource() == button) {
//			System.out.println("Button Pressed");
//		}
//		
//	}
	
	public static void main(String[] args) {
		launch(args);
	}


	

	
}

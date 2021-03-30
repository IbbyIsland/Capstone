package View;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scenario5Learner {

	
	
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageLearn5;
	private Scene learner;
	private AnchorPane pane;
	
	
	public Scenario5Learner() {
		stageLearn5 = new Stage();
		pane = new AnchorPane();
		learner = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageLearn5.setScene(learner);
		stageLearn5.setTitle("Learner Window");
		
		
		
	}
	
	public void show() {
		stageLearn5.show();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

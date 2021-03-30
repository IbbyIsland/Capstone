package View;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scenario4Learner {

	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageLearn4;
	private Scene learner;
	private AnchorPane pane;
	
	
	public Scenario4Learner() {
		stageLearn4 = new Stage();
		pane = new AnchorPane();
		learner = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageLearn4.setScene(learner);
		stageLearn4.setTitle("Learner Window");
		
		
		
	}
	
	public void show() {
		stageLearn4.show();
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

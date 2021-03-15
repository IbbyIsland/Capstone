package View;

import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelpMenu {
	
	private static final int MAIN_WINDOW_WIDTH = 400;
	private static final int MAIN_WINDOW_HEIGHT = 400;
	
	public Stage stageHelp;
	private Scene helper;
	private AnchorPane pane;
	
	public HelpMenu() {
		
		stageHelp = new Stage();
		pane = new AnchorPane();
		helper = new Scene(pane, MAIN_WINDOW_WIDTH,MAIN_WINDOW_HEIGHT  );
		stageHelp.setScene(helper);
		stageHelp.setTitle("Helper Window");
		
		background();
		//define what to talk about here
		
		
	}
	
	
	public void background() {
		//Background background = new Background(Color.AQUA);
		ImageView background = new ImageView("https://lh3.googleusercontent.com/proxy/K6f89sm1ORUmbxzfAlnfd5AY6ATV73qYD2yvB_4iO-Hswpils9IUTxdVkBiZFlAOtP47u17MGF246Q4j28N_wqBt");
		background.setScaleX(2.5);
		background.setScaleY(2);
		
		background.setX(430);
		background.setY(250);
		
		pane.getChildren().addAll(background);
		
		
	}
	
	
	
	public void show() {
		stageHelp.show();
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

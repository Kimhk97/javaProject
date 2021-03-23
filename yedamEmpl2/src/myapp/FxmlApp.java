package myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("viewPackage/RootBoard.fxml")); //getClass : 상대경로 불러옴
		
		
		
		//컨테이너를 Scene의 매개값으로
		Scene scene = new Scene(root);
		
		//Stage의 매개값으로 Scene을 달아줌
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	
}

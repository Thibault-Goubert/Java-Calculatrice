package com.tg.vue;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Calculatrie");
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Calculatrice.fxml"));
			AnchorPane mainLayout = (AnchorPane)loader.load();
			
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,700);
			Scene scene = new Scene(mainLayout);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

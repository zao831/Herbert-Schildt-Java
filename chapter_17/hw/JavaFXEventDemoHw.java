package chapter_17.hw;

import javafx.application.*;
//import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 640
 * Questions and exercises 
 * for self-examination
 * Question number 10
 * Use Platfrom.exit()
 */

public class JavaFXEventDemoHw extends Application {

	Label response;

	public static void main(String[] args) {
		// Start application JavaFX, by calling method launch()
		launch(args);
	}

	@Override
	public void start(Stage myStage) {
		// Set the title of the application window
		myStage.setTitle("Use Platform.exit().");

		// Use FlowPane for root node. In this case, the value of the vertical and
		// horizontal gaps is 10
		FlowPane rootNode = new FlowPane(10, 10);

		// Center the controls on the stage
		rootNode.setAlignment(Pos.CENTER);

		// Create scene
		Scene myScene = new Scene(rootNode, 300, 100);

		// Set scene on the platform
		myStage.setScene(myScene);

		// Create label
		response = new Label("Push a Button");

		// Create two button
		Button btnRun = new Button("Run");
		Button btnExit = new Button("Exit");

		// Process the action events for the "Up" button using a lambda-expression
		btnRun.setOnAction((ae) -> response.setText("You press Run"));
		
		// Process the action events for the "Exit" button using a lambda-expression
		btnExit.setOnAction((ae) -> Platform.exit());

		// Add label and buttons to the scene graph
		rootNode.getChildren().addAll(btnRun, btnExit, response);

		// Display the platform along with its scene
		myStage.show();

	}
}
package chapter_17;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 618
 * Demonstration JavaFX event handling for buttons (using lambda-expressions)
 */

public class JavaFXEventDemo2 extends Application {

	Label response;

	public static void main(String[] args) {
		// Start application JavaFX, by calling method launch()
		launch(args);
	}

	@Override
	public void start(Stage myStage) {
		// Set the title of the application window
		myStage.setTitle("Use JavaFX Buttons and Events.");

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
		Button btnUp = new Button("Up");
		Button btnDown = new Button("Down");

		// Process events the actions for button "Up"
		btnUp.setOnAction((ae) -> response.setText("You pressed Up"));

		// Process events the actions for button "Down"
		btnDown.setOnAction((ae) -> response.setText("You pressed Down."));

		// Add label and buttons to the scene graph
		rootNode.getChildren().addAll(btnUp, btnDown, response);

		// Display the platform along with its scene
		myStage.show();

	}
}
package chapter_17;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 614
 * Demonstration of using JavaFX labels
 */

public class JavaFXLabelDemo extends Application {
	public static void main(String[] args) {
		// Start application JavaFX, by calling method launch()
		launch(args);
	}

	// Override start() method
	@Override
	public void start(Stage myStage) {
		// Set the title of the application window
		myStage.setTitle("Use a JavaFX label.");

		// Use FlowPane for root node
		FlowPane rootNode = new FlowPane();

		// Create scene
		Scene myScene = new Scene(rootNode, 300, 200);

		// Set scene on the platform
		myStage.setScene(myScene);

		// Create label
		Label myLabel = new Label("JavaFX is a powerful GUI");

		// Add a label to the scene graph
		rootNode.getChildren().add(myLabel);

		// Display the platform along with its scene
		myStage.show();

	}
}
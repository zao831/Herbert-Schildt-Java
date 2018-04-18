package chapter_17;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 610
 * Application framework JavaFX
 */

public class JavaFXSkel extends Application {

	public static void main(String[] args) {
		System.out.println("Start application JavaFX");

		// Start application JavaFX, by calling method launch()
		launch(args);
	}

	@Override
	public void init() {
		System.out.println("In the body method init()");
	}

	@Override
	public void start(Stage myStage) {
		System.out.println("In the body method start()");

		// Set the title of the application window
		myStage.setTitle("Application framework JavaFX");

		// Create a root node. In this case, a floating layout is used, but other
		// options are possible.
		FlowPane rootNode = new FlowPane();

		// Create scene
		Scene myScene = new Scene(rootNode, 300, 200);

		// Set scene on the platform
		myStage.setScene(myScene);

		// Display the platform along with its scene
		myStage.show();

	}

	@Override
	public void stop() {
		System.out.println("In the body method stop()");
		
	}
}
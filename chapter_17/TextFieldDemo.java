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
 * Page 631
 * Demonstrating the use of text fields
 */

public class TextFieldDemo extends Application {

	TextField tf;
	Label response;

	public static void main(String[] args) {
		// Start application JavaFX, by calling method launch()
		launch(args);
	}

	// Override start() method
	@Override
	public void start(Stage myStage) {
		// Set the title of application window
		myStage.setTitle("Demonstrate a TextField");

		// Use FlowPane for the root node. In this case, the value of the vertical and
		// horizontal gaps is 10
		FlowPane rootNode = new FlowPane(10, 10);

		// Center the controls no the stage
		rootNode.setAlignment(Pos.CENTER);

		// Create scene
		Scene myScene = new Scene(rootNode, 230, 140);

		// Set the scene of the platform
		myStage.setScene(myScene);

		// Create a label to notify the status of the checkbox
		response = new Label("Enter Name: ");

		// Create a button that controls the receipt of text
		Button btnGetText = new Button("Get Name");

		// Create text field
		tf = new TextField();

		// Set a hint
		tf.setPromptText("Enter a Name");

		// Set the preferred number of columns
		tf.setPrefColumnCount(15);

		// Use a lambda-expression that handles action events for the text field. Action
		// events are generated when the <ENTER> key is pressed while the input focus is
		// in the text field. In this case, the processing of the event consists in
		// retrieving and displaying the text
		tf.setOnAction((ae) -> response.setText("Button pressed. Name is: " + tf.getText()));

		// Use a separator to better organize output
		Separator separator = new Separator();
		separator.setPrefWidth(180);

		// Add the items to the scene graph
		rootNode.getChildren().addAll(tf, btnGetText, separator, response);

		// Display the platform along with it's scene
		myStage.show();

	}
}
package chapter_17.hw;

import java.io.*;
import javafx.application.*;
import javafx.event.*;
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
 * Question number 13
 * Implementation of the JavaFX version of the file comparison utility in Exercise 16.1.
 */

public class JavaFXFileCompHw extends Application {

	TextField tfFirst; // Stores the name of the first file
	TextField tfSecond; // Stores the name of the second file

	Button btnComp; // File compare start operation button

	Label labFirst, labSecond; // Labels, that display prompts for the user
	Label labResult; // Label to display comparison result and error messages

	public static void main(String[] args) {
		launch(args);
	}

	// Override start() method
	@Override
	public void start(Stage myStage) throws Exception {
		// Set the title of the application window
		myStage.setTitle("Compare Files");

		// Use FlowPane for the root node. In this case, the value of the vertical and
		// horizontal gaps is 10
		FlowPane rootNode = new FlowPane(10, 10);

		// Center the control on the stage
		rootNode.setAlignment(Pos.CENTER);

		// Create scene
		Scene myScene = new Scene(rootNode, 180, 180);

		// Set scene on the platform
		myStage.setScene(myScene);

		tfFirst = new TextField();
		tfSecond = new TextField();

		// Set preferred column sizes
		tfFirst.setPrefColumnCount(12);
		tfSecond.setPrefColumnCount(12);

		// Set prompts for the files name
		tfFirst.setPromptText("Enter file name");
		tfSecond.setPromptText("Enter file name");

		// Create "Compare" button
		btnComp = new Button("Compare");

		// Create label
		labFirst = new Label("First file: ");
		labSecond = new Label("Second file: ");
		labResult = new Label("");

		// Use lambda-expression for handle the action events associated with text
		// boxes. These handlers simply start the event for the "Compare" button
		tfFirst.setOnAction((ae) -> btnComp.fire());
		tfSecond.setOnAction((ae) -> btnComp.fire());

		// Handle the action event for the Compare button
		btnComp.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int i = 0, j = 0;

				// First make sure that the names of both files are entered
				if (tfFirst.getText().equals("")) {
					labResult.setText("First file name missing.");
					return;
				}
				if (tfSecond.getText().equals("")) {
					labResult.setText("Second file name missing.");
					return;
				}

				// Compare files, using a try operator with resources
				try (FileInputStream f1 = new FileInputStream(tfFirst.getText());
						FileInputStream f2 = new FileInputStream(tfSecond.getText())) {
					// Compare the files content
					do {
						i = f1.read();
						j = f2.read();
						if (i != j)
							break;
					} while (i != -1 && j != -1);

					if (i != j)
						labResult.setText("Files are not the same.");
					else
						labResult.setText("Files compare equal.");
				} catch (IOException exc) {
					labResult.setText("File Error Encountered");
				}
			}
		});

		// Add the items in the scene graph
		rootNode.getChildren().addAll(labFirst, tfFirst, labSecond, tfSecond, btnComp, labResult);

		// Display the platform along with its scene
		myStage.show();

	}
}
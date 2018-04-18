package chapter_17;

import javafx.application.*;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 627
 * Demonstrating the use of lists
 */

public class ListViewDemo extends Application {

	Label response;

	public static void main(String[] args) {
		// Start application JavaFX, by calling launch() method
		launch(args);
	}

	// Override start() method
	@Override
	public void start(Stage myStage) {
		// Set the title of application window
		myStage.setTitle("ListView Demo");

		// Use FlowPane for root node. In this case, the value of the vertical and
		// horizontal gaps is 10
		FlowPane rootNode = new FlowPane(10, 10);

		// Center the controls on the stage
		rootNode.setAlignment(Pos.CENTER);

		// Create scene
		Scene myScene = new Scene(rootNode, 200, 120);

		// Set scene of the platform
		myStage.setScene(myScene);

		// Create label
		response = new Label("Select Computer Type");

		// Create object ObservableList type for list
		ObservableList<String> computerType = FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook",
				"Desktop");

		// Create list
		ListView<String> lvComputers = new ListView<String>(computerType);

		// Specify preferred height and width values
		lvComputers.setPrefSize(100, 70);

		// Get the model of choice for the list
		MultipleSelectionModel<String> lvSelModel = lvComputers.getSelectionModel();

		// Use the listener to respond to changes in the selection within the list
		lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

				// Show selection
				response.setText("Computer selected is " + newValue);
			}
		});

		// Add label and list to the scene graph
		rootNode.getChildren().addAll(lvComputers, response);

		// Display the platform along with it's scene
		myStage.show();

	}
}
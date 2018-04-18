package chapter_17;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 624
 * Exercise 16.1
 * Demonstration of the use of checkbox (using an undefined state)
 */

public class CheckboxDemo2 extends Application {

	CheckBox cbSmartfone, cbTablet, cbNotebook, cbDesktop;
	Label response, selected;
	String computers;

	public static void main(String[] args) {
		// Start application JavaFX, by calling method launch()
		launch(args);
	}

	// Override start() method
	@Override
	public void start(Stage myStage) {
		// Set the title of application window
		myStage.setTitle("Demonstrate Check Boxes 2");

		// Use FlowPane for root node. In this case, the value of the vertical and
		// horizontal gaps is 10
		FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);

		// Center the controls on the stage
		rootNode.setAlignment(Pos.CENTER);

		// Create scene
		Scene myScene = new Scene(rootNode, 350, 230);

		// Set scene of the platform
		myStage.setScene(myScene);

		Label heading = new Label("What Computers Do You Own");

		// Create a label to notify the status of the checkbox
		response = new Label("");

		// Create a label notifying about the selection of any checkbox
		selected = new Label("");

		// Create checkbox
		cbSmartfone = new CheckBox("Smartphone");
		cbTablet = new CheckBox("Tablet");
		cbNotebook = new CheckBox("Notebook");
		cbDesktop = new CheckBox("Desktop");

		// Process events the actions for checkboxes
		cbSmartfone.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				if (cbSmartfone.isIndeterminate())
					response.setText("Smartphone state is indeterminate.");
				else if (cbSmartfone.isSelected())
					response.setText("Smartphone was just selected");
				else
					response.setText("Smartphone was just cleared");

				shoeAll();
			}
		});

		cbTablet.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				if (cbTablet.isSelected())
					response.setText("Tablet was just selected");
				else
					response.setText("Tablet was just cleared");

				shoeAll();
			}
		});

		cbNotebook.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				if (cbNotebook.isSelected())
					response.setText("Notebook was just selected");
				else
					response.setText("Notebook was just cleared");

				shoeAll();
			}
		});

		cbDesktop.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				if (cbDesktop.isSelected())
					response.setText("Desktop was just selected");
				else
					response.setText("Desktop was just cleared");

				shoeAll();
			}
		});

		// Add controls to the scene graph
		rootNode.getChildren().addAll(heading, cbSmartfone, cbTablet, cbNotebook, cbDesktop, response, selected);

		// Display the platform along with its scene
		myStage.show();

		shoeAll();
		
		// Activate an undefined state for the Smartphone checkbox
		cbSmartfone.setAllowIndeterminate(true);

	}

	// Refresh and display a variants select
	void shoeAll() {
		computers = "";
		if (cbSmartfone.isSelected())
			computers = "Smartfone ";
		if (cbTablet.isSelected())
			computers += "Tablet ";
		if (cbNotebook.isSelected())
			computers += "Notebook ";
		if (cbDesktop.isSelected())
			computers += "Desktop ";
		selected.setText("Computers selected: " + computers);

	}
}
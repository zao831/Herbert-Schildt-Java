package chapter_17.hw;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.scene.transform.*;
import javafx.stage.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 641
 * Questions and exercises 
 * for self-examination
 * Question number 14Demonstration of rotation, scaling, reflection and blurring of the control
 */

public class EffectsAndTransformsDemoHw extends Application {

	double angle = 0.0;
	double scaleFactor = 0.4;
	double blurVal = 1.0;

	// Create initial transform and effect objects
	Reflection reflection = new Reflection();
	BoxBlur blur = new BoxBlur();
	BoxBlur rotateBlur = new BoxBlur(5.0, 5.0, 2);
	Rotate rotate = new Rotate();
	Scale scale = new Scale();

	// Create button
	Button btnRotate = new Button("Rotate");
	Button btnBlur = new Button("Blur off");
	Button btnScale = new Button("Scale");
	Label reflect = new Label("Reflection Adds Visual Sparkle");

	public static void main(String[] args) {
		// Start application JavaFX, by calling launch() method
		launch(args);
	}

	// Override start() method
	@Override
	public void start(Stage myStage) {

		// Set the title application window
		myStage.setTitle("Effects and Transform Demo");

		// Use FlowPane for root node. In this case, the value of the vertical and
		// horizontal gaps is 20
		FlowPane rootNode = new FlowPane(20, 20);

		// Center the control on the stage
		rootNode.setAlignment(Pos.CENTER);

		// Create scene
		Scene myScene = new Scene(rootNode, 300, 120);

		// Set scene on the platform
		myStage.setScene(myScene);

		// Add rotate in list of transformations for Rotate button
		btnRotate.getTransforms().add(rotate);

		// Add scaling to the list of transformations for button Scale
		btnScale.getTransforms().add(scale);

		// Specify the reflection effect for the Reflection label
		reflection.setTopOpacity(0.7);
		reflection.setBottomOpacity(0.3);
		reflect.setEffect(reflection);

		// Handle action events for the Rotate button
		btnRotate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				// With each press of the button, it rotates 30 degrees around the center
				angle += 15.0;

				rotate.setAngle(angle);
				rotate.setPivotX(btnRotate.getWidth() / 2);
				rotate.setPivotY(btnRotate.getHeight() / 2);

				if (blurVal == 12) {
					blurVal = 1.0;
					btnRotate.setEffect(null);
				} else {
					blurVal++;
					btnRotate.setEffect(rotateBlur);
				}
//				btnRotate.setEffect(rotateBlur);

			}
		});

		// Handle action events for the Scale button
		btnScale.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// Each time the button is pressed, its dimensions change
				scaleFactor += 0.1;
				if (scaleFactor > 2.0)
					scaleFactor = 0.4;

				scale.setX(scaleFactor);
				scale.setY(scaleFactor);
			}
		});

		// Handle action events for the Blur button
		btnBlur.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// Each time the button is pressed, the degree of blurring of its image changes
				if (blurVal == 10.0) {
					blurVal = 1.0;
					btnBlur.setEffect(null);
					btnBlur.setText("Blur off");
					;
				} else {
					blurVal++;
					btnBlur.setEffect(blur);
					btnBlur.setText("Blur on");
				}
				blur.setWidth(blurVal);
				blur.setHeight(blurVal);
			}
		});

		// Add label and button in the scene graph
		rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);

		// Display the platform along with it's scene
		myStage.show();
		
	}
}
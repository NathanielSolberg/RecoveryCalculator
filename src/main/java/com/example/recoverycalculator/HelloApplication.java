package com.example.recoverycalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Elliptical prachute = new Elliptical(3.0f, 4);

        Rocket rocket = new Rocket(prachute);

        //Text fields
        TextField velocityField = new TextField();
        TextField airDensityField = new TextField();
        TextField weightField = new TextField();
        TextField dragCoefficientField = new TextField();
        TextField areaField = new TextField();

        //labels

        Label velocityLabel = new Label("Velocity: ");
        Label airDensityLabel = new Label("Air Density: ");
        Label weightLabel = new Label("Weight: ");
        Label dragCoefficientLabel = new Label("Drag Coefficient: ");
        Label areaLabel = new Label("Area: ");

        //buttons

        Button calculateButton = new Button("Calculate");

        calculateButton.setOnAction(event -> {
            //find which text box is empty and run the calculate method for that text box
        });

        VBox box = new VBox(5);

        box.getChildren().add(velocityLabel);
        box.getChildren().add(velocityField);
        box.getChildren().add(airDensityLabel);
        box.getChildren().add(airDensityField);
        box.getChildren().add(weightLabel);
        box.getChildren().add(weightField);
        box.getChildren().add(dragCoefficientLabel);
        box.getChildren().add(dragCoefficientField);
        box.getChildren().add(areaLabel);
        box.getChildren().add(areaField);
        box.getChildren().add(calculateButton);

        Scene scene = new Scene(box, 500, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
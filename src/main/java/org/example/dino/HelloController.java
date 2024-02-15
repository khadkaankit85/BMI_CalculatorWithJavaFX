package org.example.dino;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {


    //initialising varibales to that is fx:ids
    @FXML
    private TextField weightField;

    @FXML
    private TextField heightField;

    @FXML
    private Label result;

    @FXML
    private Label Overweight;

    @FXML
    private Label Underweight;

    @FXML
    private Label Normal;

    @FXML
    private Label Obese;

    @FXML
    public Button calculate;

//required logic to calculate and change display according to the question

    @FXML
    public void calculateBMI(ActionEvent event) {
        System.out.println("button clicked");
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            // BMI calculation
            double bmi = weight / (height * height);

            // Display the result in the label
            result.setText("BMI: " + String.format("%.2f", bmi));

            // Set label background color and text color based on BMI range
            if (bmi < 18.5) {
                Underweight.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
                Normal.setStyle("-fx-background-color: transparent;");
                Overweight.setStyle("-fx-background-color: transparent;");
                Obese.setStyle("-fx-background-color: transparent;");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                Underweight.setStyle("-fx-background-color: transparent;");
                Normal.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
                Overweight.setStyle("-fx-background-color: transparent;");
                Obese.setStyle("-fx-background-color: transparent;");
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                Underweight.setStyle("-fx-background-color: transparent;");
                Normal.setStyle("-fx-background-color: transparent;");
                Overweight.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
                Obese.setStyle("-fx-background-color: transparent;");
            } else {
                Underweight.setStyle("-fx-background-color: transparent;");
                Normal.setStyle("-fx-background-color: transparent;");
                Overweight.setStyle("-fx-background-color: transparent;");
                Obese.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
            }

        } catch (NumberFormatException e) {
            // Handle the case when the input is not a valid number
            result.setText("Invalid input. Please enter valid numbers.");
        }
    }





}





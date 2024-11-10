package com.example.lab31;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class QuadraticRootsChecker extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label instructionLabel = new Label("Введіть значення для a, b та c:");

        TextField aField = new TextField();
        aField.setPromptText("a");

        TextField bField = new TextField();
        bField.setPromptText("b");

        TextField cField = new TextField();
        cField.setPromptText("c");

        Label resultLabel = new Label();
        Button checkButton = new Button("Перевірити корені");

        checkButton.setOnAction(e -> {
            try {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                double c = Double.parseDouble(cField.getText());

                int result = checkRoots(a, b, c);
                resultLabel.setText("Результат: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Будь ласка, введіть коректні числа для a, b і c.");
            }
        });

        VBox root = new VBox(10, instructionLabel, aField, bField, cField, checkButton, resultLabel);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Перевірка коренів квадратного рівняння");
        primaryStage.show();
    }

    public int checkRoots(double a, double b, double c) {
        if (a != 0 && b != 0 && c != 0) {
            double discriminant = b * b - 4 * a * c;
            return discriminant > 0 ? 1 : 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

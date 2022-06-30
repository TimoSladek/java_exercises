package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Training {
    private Dictionary dictionary;
    private String word;

    public Training(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandom();
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label instruction = new Label("Translate the word '" + this.word + "'");
        TextField textField = new TextField();
        Button checkButton = new Button("Check");
        Label feedback = new Label("");

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(instruction, 0, 1);
        layout.add(textField, 0, 1);
        layout.add(checkButton, 0, 3);
        layout.add(feedback, 0, 4);

        checkButton.setOnMouseClicked((event) -> {
            String translation = textField.getText();
            if (this.dictionary.get(this.word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation for the word '" + this.word + "' is '" + this.dictionary.get(word) + "'.");
                return;
            }

            this.word = this.dictionary.getRandom();
            instruction.setText("Translate the word '" + this.word + "'");
            textField.clear();
        });

        return layout;
    }
}

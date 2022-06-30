package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class enteringWords {
    private Dictionary dictionary;

    public enteringWords(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label firstText = new Label("Word");
        TextField wordField = new TextField();
        Label secondText = new Label("Translation");
        TextField translationField = new TextField();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Button addbutton = new Button("Add the word pair");

        layout.add(firstText, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(secondText, 0, 2);
        layout.add(translationField, 0, 3);
        layout.add(addbutton, 0, 4);

        addbutton.setOnMouseClicked((event -> {
            String word = wordField.getText();
            String translation = translationField.getText();

            this.dictionary.add(word, translation);

            wordField.clear();
            translationField.clear();
        }));

        return layout;
    }
}

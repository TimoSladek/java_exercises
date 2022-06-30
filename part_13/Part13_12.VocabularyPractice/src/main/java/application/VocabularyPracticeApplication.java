package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {
    private Dictionary dictionary;

    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        enteringWords firstView = new enteringWords(dictionary);
        Training secondView = new Training(dictionary);

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button newWords = new Button("Enter new words");
        Button practice = new Button("Practice");

        menu.getChildren().addAll(newWords, practice);
        layout.setTop(menu);

        newWords.setOnAction(event -> {
            layout.setCenter(firstView.getView());
        });
        practice.setOnAction(event -> {
            layout.setCenter(secondView.getView());
        });

        layout.setCenter(firstView.getView());

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }
}

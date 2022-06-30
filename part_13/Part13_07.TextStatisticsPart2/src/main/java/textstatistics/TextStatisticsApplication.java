package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        HBox texts = new HBox();
        texts.setSpacing(10);
        Label label1 = new Label("Letters: 0");
        Label label2 = new Label("Words: 0");
        Label label3 = new Label("The longest word is:");
        texts.getChildren().add(label1);
        texts.getChildren().add(label2);
        texts.getChildren().add(label3);

        layout.setBottom(texts);
        TextArea area = new TextArea("");
        layout.setCenter(area);

        area.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            label1.setText("Letters: " + characters);
            label2.setText("Words: " + words);
            label3.setText("The longest word is: " + longest);
        });

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
}

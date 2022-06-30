package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout1 = new BorderPane();
        VBox layout2 = new VBox();
        GridPane layout3 = new GridPane();

        Scene first = new Scene(layout1);
        Scene second = new Scene(layout2);
        Scene third = new Scene(layout3);

        layout1.setTop(new Label("First view!"));
        Button button = new Button("To the second view!");
        layout1.setCenter(button);
        button.setOnAction(actionEvent -> {
            window.setScene(second);
        });

        Button button2 = new Button("To the third view!");
        layout2.getChildren().add(button2);
        layout2.getChildren().add(new Label("Second view!"));
        button2.setOnAction(actionEvent -> {
            window.setScene(third);
        });

        layout3.add(new Label("Third view!"), 0, 0);
        Button button3 = new Button("To the first view!");
        layout3.add(button3, 1, 1);
        button3.setOnAction(actionEvent -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }
}

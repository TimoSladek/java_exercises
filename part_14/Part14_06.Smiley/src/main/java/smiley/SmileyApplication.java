package smiley;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(500, 480);
        GraphicsContext painter = canvas.getGraphicsContext2D();

        BorderPane layout = new BorderPane();
        layout.setCenter(canvas);

        painter.setFill(Color.BLACK);
        painter.fillRect(150,100,50,50);
        painter.fillRect(300,100,50,50);
        painter.fillRect(150,300,200,50);
        painter.fillRect(100,250,50,50);
        painter.fillRect(350,250,50,50);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }
}

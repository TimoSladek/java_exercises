package collage;

import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }

        ImageView image = new ImageView(targetImage);
        ImageView image1 = new ImageView(targetImage);
        ImageView image2 = new ImageView(targetImage);
        ImageView image3 = new ImageView(targetImage);
        ImageView image4 = new ImageView(targetImage);

        image1.setScaleX(0.5);
        image1.setScaleY(0.5);
        image2.setScaleX(0.5);
        image2.setScaleY(0.5);
        image3.setScaleX(0.5);
        image3.setScaleY(0.5);
        image4.setScaleX(0.5);
        image4.setScaleY(0.5);
        image1.setTranslateX(-(width / 4));
        image1.setTranslateY(-(height / 4));
        image2.setTranslateX(width / 4);
        image2.setTranslateY(-(height / 4));
        image3.setTranslateX(-(width / 4));
        image3.setTranslateY(height / 4);
        image4.setTranslateX(width / 4);
        image4.setTranslateY(height / 4);


        Pane pane = new Pane();
        pane.getChildren().add(image);
        pane.getChildren().add(image1);
        pane.getChildren().add(image2);
        pane.getChildren().add(image3);
        pane.getChildren().add(image4);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

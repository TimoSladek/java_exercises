package buttonandlabel;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("Button");
        Label textComponent = new Label("text");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(textComponent);
        componentGroup.getChildren().add(button);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }
}

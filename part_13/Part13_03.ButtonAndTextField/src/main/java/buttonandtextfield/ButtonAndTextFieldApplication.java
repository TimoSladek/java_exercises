package buttonandtextfield;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {

    }

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("button");
        TextField text = new TextField("text");

        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(text);

        Scene view = new Scene(components);
        window.setScene(view);
        window.close();
    }
}

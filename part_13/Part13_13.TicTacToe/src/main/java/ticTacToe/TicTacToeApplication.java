package ticTacToe;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {


    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        Label turn = new Label("Turn: X");
        turn.setFont(new Font("Arial", 50));

        GridPane firstView = new GridPane();
        firstView.setAlignment(Pos.CENTER);
        firstView.setVgap(10);
        firstView.setHgap(10);
        firstView.setPadding(new Insets(10, 10, 10, 10));

        Button btn1 = new Button(" ");
        btn1.setFont(Font.font("Monospaced", 40));
        firstView.add(btn1, 0, 0);

        Button btn2 = new Button(" ");
        btn2.setFont(Font.font("Monospaced", 40));
        firstView.add(btn2, 1, 0);

        Button btn3 = new Button(" ");
        btn3.setFont(Font.font("Monospaced", 40));
        firstView.add(btn3, 2, 0);

        Button btn4 = new Button(" ");
        btn4.setFont(Font.font("Monospaced", 40));
        firstView.add(btn4, 0, 1);

        Button btn5 = new Button(" ");
        btn5.setFont(Font.font("Monospaced", 40));
        firstView.add(btn5, 1, 1);

        Button btn6 = new Button(" ");
        btn6.setFont(Font.font("Monospaced", 40));
        firstView.add(btn6, 2, 1);

        Button btn7 = new Button(" ");
        btn7.setFont(Font.font("Monospaced", 40));
        firstView.add(btn7, 0, 2);

        Button btn8 = new Button(" ");
        btn8.setFont(Font.font("Monospaced", 40));
        firstView.add(btn8, 1, 2);

        Button btn9 = new Button(" ");
        btn9.setFont(Font.font("Monospaced", 40));
        firstView.add(btn9, 2, 2);

        btn1.setOnAction(event -> {
            if (btn1.getText().equals("O") || btn1.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn1.setText("X");
                if ((btn2.getText().equals("X") && btn3.getText().equals("X")) || (btn4.getText().equals("X") &&
                        btn7.getText().equals("X")) || (btn5.getText().equals("X") && btn9.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn1.setText("O");
                if ((btn2.getText().equals("O") && btn3.getText().equals("O")) || (btn4.getText().equals("O") &&
                        btn7.getText().equals("O")) || (btn5.getText().equals("O") && btn9.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn2.setOnAction(event -> {
            if (btn2.getText().equals("O") || btn2.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn2.setText("X");
                if ((btn1.getText().equals("X") && btn3.getText().equals("X")) || (btn5.getText().equals("X") &&
                        btn8.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn2.setText("O");
                if ((btn1.getText().equals("O") && btn3.getText().equals("O")) || (btn5.getText().equals("O") &&
                        btn8.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn3.setOnAction(event -> {
            if (btn3.getText().equals("O") || btn3.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn3.setText("X");
                if ((btn1.getText().equals("X") && btn2.getText().equals("X")) || (btn6.getText().equals("X") &&
                        btn9.getText().equals("X")) || (btn5.getText().equals("X") && btn7.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn3.setText("O");
                if ((btn1.getText().equals("O") && btn2.getText().equals("O")) || (btn5.getText().equals("O") &&
                        btn7.getText().equals("O")) || (btn6.getText().equals("O") && btn9.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn4.setOnAction(event -> {
            if (btn4.getText().equals("O") || btn4.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn4.setText("X");
                if ((btn1.getText().equals("X") && btn7.getText().equals("X")) || (btn6.getText().equals("X") &&
                        btn5.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn4.setText("O");
                if ((btn1.getText().equals("O") && btn7.getText().equals("O")) || (btn5.getText().equals("O") &&
                        btn6.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn5.setOnAction(event -> {
            if (btn5.getText().equals("O") || btn5.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn5.setText("X");
                if ((btn2.getText().equals("X") && btn8.getText().equals("X")) || (btn4.getText().equals("X") &&
                        btn6.getText().equals("X")) || (btn3.getText().equals("X") && btn7.getText().equals("X")) ||
                        (btn1.getText().equals("X") && btn9.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn5.setText("O");
                if ((btn2.getText().equals("O") && btn8.getText().equals("O")) || (btn4.getText().equals("O") &&
                        btn6.getText().equals("O")) || (btn3.getText().equals("O") && btn7.getText().equals("O")) ||
                        (btn1.getText().equals("O") && btn9.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn6.setOnAction(event -> {
            if (btn6.getText().equals("O") || btn6.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn6.setText("X");
                if ((btn3.getText().equals("X") && btn9.getText().equals("X")) || (btn5.getText().equals("X") &&
                        btn4.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn6.setText("O");
                if ((btn3.getText().equals("O") && btn9.getText().equals("O")) || (btn5.getText().equals("O") &&
                        btn4.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn7.setOnAction(event -> {
            if (btn7.getText().equals("O") || btn7.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn7.setText("X");
                if ((btn1.getText().equals("X") && btn4.getText().equals("X")) || (btn9.getText().equals("X") &&
                        btn8.getText().equals("X")) || (btn5.getText().equals("X") && btn3.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn7.setText("O");
                if ((btn1.getText().equals("O") && btn4.getText().equals("O")) || (btn9.getText().equals("O") &&
                        btn8.getText().equals("O")) || (btn5.getText().equals("O") && btn3.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn8.setOnAction(event -> {
            if (btn8.getText().equals("O") || btn8.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn8.setText("X");
                if ((btn5.getText().equals("X") && btn2.getText().equals("X")) || (btn7.getText().equals("X") &&
                        btn9.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn8.setText("O");
                if ((btn5.getText().equals("O") && btn2.getText().equals("O")) || (btn7.getText().equals("O") &&
                        btn9.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        btn9.setOnAction(event -> {
            if (btn9.getText().equals("O") || btn9.getText().equals("X")) {
                return;
            } else if (turn.getText().equals("Turn: X")) {
                btn9.setText("X");
                if ((btn1.getText().equals("X") && btn5.getText().equals("X")) || (btn6.getText().equals("X") &&
                        btn3.getText().equals("X")) || (btn8.getText().equals("X") && btn7.getText().equals("X"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: O");
                }
            } else {
                btn9.setText("O");
                if ((btn1.getText().equals("O") && btn5.getText().equals("O")) || (btn6.getText().equals("O") &&
                        btn3.getText().equals("O")) || (btn8.getText().equals("O") && btn7.getText().equals("O"))) {
                    turn.setText("The end!");
                    btn9.setDisable(true);
                    btn8.setDisable(true);
                    btn7.setDisable(true);
                    btn6.setDisable(true);
                    btn5.setDisable(true);
                    btn4.setDisable(true);
                    btn3.setDisable(true);
                    btn2.setDisable(true);
                    btn1.setDisable(true);
                } else {
                    turn.setText("Turn: X");
                }
            }
        });

        layout.setTop(turn);
        layout.setCenter(firstView);

        Scene view = new Scene(layout, 300, 350);

        window.setScene(view);
        window.show();
    }
}
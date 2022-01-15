package com.example.Chat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea area;

    @FXML
    private TextField field;

    @FXML
    private Button button;

    @FXML
    protected void onHelloButtonClick() {
        area.appendText(field.getText() + "\n");
        field.clear();
        field.requestFocus();
    }
}

//some comment
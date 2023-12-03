package com.example.gui_12_1;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    void switchToMenu(MouseEvent event) {
        HelloApplication.switch_Scene("Welcome.fxml");
    }

    @FXML
    void switchToChat(MouseEvent event) {
        HelloApplication.switch_Scene("Chat.fxml");
    }

    @FXML
    void switchToCall(MouseEvent event) {
        HelloApplication.switch_Scene("Calling.fxml");
    }
}
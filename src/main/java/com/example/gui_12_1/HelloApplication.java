package com.example.gui_12_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage primary_stage;
    public static void switch_Scene(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            HelloApplication.primary_stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.primary_stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        HelloApplication.primary_stage.setTitle("Chat GUI");
        HelloApplication.primary_stage.setScene(scene);
        HelloApplication.primary_stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
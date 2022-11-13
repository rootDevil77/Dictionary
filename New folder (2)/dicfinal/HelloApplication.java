package com.example.dicfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
   public static Group root;
    @Override
    public void start(Stage stage) throws IOException {
        root=new Group();
        GamePage game=new GamePage();
        root.getChildren().add(game.root);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("My Dictionary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
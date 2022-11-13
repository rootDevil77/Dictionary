package com.example.dicfinal;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class GamePage {
    public AnchorPane root;
    GamePage() throws IOException{
        root= FXMLLoader.load(getClass().getResource("GamePage.fxml"));

    }
}

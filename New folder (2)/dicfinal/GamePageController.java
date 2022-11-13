package com.example.dicfinal;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class GamePageController {
    wordDictionary newList;
    @FXML
    TextField search;
    @FXML
    TextField word;
    @FXML
    TextField meaning;

    @FXML
    public void newword(MouseEvent event) throws IOException {
        System.out.println("New word Added");
        newList = new wordDictionary();
        newList.deserializemap();
        Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setHeaderText("New word adding");
        newList.addword(word.textProperty().get(), meaning.textProperty().get());
        newList.serializmap();
        infoAlert.setContentText("New word has added");
        infoAlert.showAndWait();
    }

    public void search(MouseEvent event) throws IOException {
        System.out.println("searching....");
        newList = new wordDictionary();
        newList.deserializemap();
        Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setHeaderText("Search Result");
        //for(String i :newList.getWordlist().keySet()){
        // System.out.println(i);
        // }
        if (newList.getWordlist().containsKey(search.textProperty().get())) {
            //  System.out.println(newList.getWordlist().get(search.textProperty().get()));
            infoAlert.setContentText(newList.getWordlist().get(search.textProperty().get()));
        }
        infoAlert.showAndWait();

    }
}

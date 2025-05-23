package com.projectg3.mavenproject1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.Group;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class App extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    //adding a comment to this file to simulate changes in remote
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        
        stage.setScene(scene);
        stage.show();
    }
}
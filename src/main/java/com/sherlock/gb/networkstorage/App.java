package com.sherlock.gb.networkstorage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;



    @Override
    public void start(Stage stage) throws IOException {

        scene = new Scene(loadFXML("login"), 640, 640);
        //stage.setTitle("GB Network Storage Registration");
        stage.setScene(scene);
        stage.show();
    }


    public static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
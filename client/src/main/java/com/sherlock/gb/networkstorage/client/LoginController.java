package com.sherlock.gb.networkstorage.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class LoginController {

    @FXML
    public PasswordField passwordField;
    @FXML
    public TextField loginField;


    @FXML
    protected void onLoginButtonClick() {
        String login = loginField.getText();
        if(login.isEmpty() || login.isBlank()){
            Alert alert = new Alert(Alert.AlertType.WARNING,"Не указан логин", ButtonType.OK);
            alert.showAndWait();
            return;
        }


        /*
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reg.fxml"));
            Parent root = fxmlLoader.load();

            regStage = new Stage();
            regStage.setTitle("Magic chat registration");
            regStage.setScene(new Scene(root, 500, 425));

            regStage.initModality(Modality.APPLICATION_MODAL);
            regStage.initStyle(StageStyle.UTILITY);


            regController = fxmlLoader.getController();
            regController.setController(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }

    public void tryToReg(String login, String password, String nickname) {
        /*
        if (socket == null || socket.isClosed()) {
            connect();
        }
        String msg = String.format("/reg %s %s %s", login, password, nickname);
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }

        */
    }

    public void onRegistrationButtonClick(ActionEvent actionEvent) {

    }
}
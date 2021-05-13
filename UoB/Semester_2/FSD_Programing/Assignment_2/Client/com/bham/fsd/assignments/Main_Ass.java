package com.bham.fsd.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main_Ass extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/bham/fsd/assignments/SignIn.fxml")));

        Scene scene = new Scene(root);
        stage.setTitle("Assignment_2 Client");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

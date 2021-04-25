package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main_Exercise_6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent window = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Exercise_6.fxml")));

        stage.setScene(new Scene(window, 800, 600));
        stage.setTitle("Exercise 6");

        stage.getIcons().add(new Image("file:E:\\MyNutCloud\\Wife\\4e77944d3374beb9.jpg"));
        stage.show();

    }
}

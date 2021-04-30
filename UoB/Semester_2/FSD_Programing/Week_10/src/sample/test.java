package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class test extends Application{

    Image icon = new Image("file:G:\\Entrance\\Coding_Training\\JavaProgram\\Training_and_UoB\\UoB\\Semester_2\\FSD_Programing\\Week_10\\src\\img\\icon.jpg");

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        ImageView imageView = new ImageView();
        imageView.setImage(icon);

        Scene scene= new Scene(root, 1366, 768);
        stage.setScene(scene);
        stage.show();

    }
}

package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<String> list = FXCollections.observableArrayList("OOP", "DSA", "Math / Logistic");

    @FXML
    private Label status;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Label myLabel;
    @FXML
    private Button button_2;
    @FXML
    private ListView<String> listModules;
    @FXML
    private Button back;



    public void login(ActionEvent event) throws IOException {

        Stage stage;

        initialize(null, null);

        status.setFont(Font.font("OCR A Extend"));

        if (username.getText().equals("SDesolator") && password.getText().equals("123456")) {
            status.setText("Login Successful.");

            Stage stage_1 = new Stage();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
            Scene scene = new Scene(root, 600, 400);

            stage_1.setScene(scene);
            stage_1.show();

        } else {
            status.setText("Login Failed.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(list);
        listModules.setItems(list);
        listModules.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public void comboChanged(ActionEvent event) {
        myLabel.setText(comboBox.getValue());
    }

    public void setButton_2(ActionEvent event) {
        comboBox.getItems().addAll("Neural Network", "Linear Algebra", "Grid Search");
        ObservableList<String> modules = listModules.getSelectionModel().getSelectedItems();

        System.out.println(modules);
    }

    public void setBack (ActionEvent event) {
        Stage stage = new Stage();


    }
}

package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_3 implements Initializable {

    final MyNumber num = new MyNumber();

    @FXML
    private Label status;
    @FXML
    private Button button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        num.setNumber(0);
        num.numberProperty().addListener((ChangeListener<Object>) (observableValue, o, t1) -> {
            status.setText(Double.toString(num.getNumber()));
        });
    }

    public void clickButton(ActionEvent event) {
        num.setNumber(num.getNumber() + 1);
    }
}

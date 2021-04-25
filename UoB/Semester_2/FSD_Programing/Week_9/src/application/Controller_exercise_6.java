package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_exercise_6 implements Initializable {

    @FXML
    private ComboBox<String> countries;
    @FXML
    private TableView<Info> table;
    @FXML
    private TableColumn<String, String> City;
    @FXML
    private TableColumn<String, String> Area;
    @FXML
    private TableColumn<String, String> Street;
    @FXML
    private Label label_top;
    @FXML
    private Label label_mid;
    @FXML
    private Label label_bot;
    @FXML
    private Label Error;
    @FXML
    private TextField x;
    @FXML
    private TextField y;
    @FXML
    private TextField operator;
    @FXML
    private Label result;
    @FXML
    private Button compute;

    ObservableList<String> country = FXCollections.observableArrayList(
            "China", "America", "United Kingdom", "Japan", "Canada", "Australia");

    ObservableList<Info> list = FXCollections.observableArrayList(
            new Info("北京", "城区", "街道"),
            new Info("dfgsdfg", "sdfgsd", "sdfasd"),
            new Info("azgedrfgb", "arGBVF", "awererhfaer"),
            new Info("sdFV", "aerg", "e4rfat"),
            new Info("DFGBGredgve", "aergt", "aergt")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        countries.setItems(country);

    }

    public void Country_change() {

        if (countries.getValue().equals("China")) {

            label_top.setText("北京");
            label_mid.setText("上海");
            label_bot.setText("广州");

            City.setCellValueFactory(new PropertyValueFactory<>("City"));
            Area.setCellValueFactory(new PropertyValueFactory<>("Area"));
            Street.setCellValueFactory(new PropertyValueFactory<>("Street"));

            table.setItems(list);

        }
    }

    public void Computation() {

        String operate = operator.getCharacters().toString();

        try {
            SimpleDoubleProperty X = new SimpleDoubleProperty(
                    Double.parseDouble(x.getCharacters().toString()));

            SimpleDoubleProperty Y = new SimpleDoubleProperty(
                    Double.parseDouble(y.getCharacters().toString()));

            SimpleDoubleProperty output = new SimpleDoubleProperty();

            switch (operate) {
                default:
                    Error.setText("????????");
                    break;

                case "+":
                    output.bind(X.add(Y));
                    result.setText(String.valueOf(output.getValue()));
                    break;

                case "-":
                    output.bind(X.subtract(Y));
                    result.setText(String.valueOf(output.getValue()));
                    break;

                case "*":
                    output.bind(X.multiply(Y));
                    result.setText(String.valueOf(output.getValue()));
                    break;

                case "/":
                    output.bind(X.divide(Y));
                    result.setText(String.valueOf(output.getValue()));
                    break;
            }

        } catch (NumberFormatException e) {
            Error.setText("输入错误");
        }
    }
}

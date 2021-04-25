package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_2 implements Initializable {

    @FXML
    private TableView<Student> stuTable;
    @FXML
    TableColumn<Student, Integer> id;
    @FXML
    TableColumn<Student, Integer> name;
    @FXML
    TableColumn<Student, Integer> surname;
    @FXML
    TableColumn<Student, Integer> age;

    public ObservableList<Student> list = FXCollections.observableArrayList(
            new Student(1, "Jane", "asdofjhas", 21),
            new Student(2, "as;dkfjhas", "asldijghdlaiu", 234),
            new Student(3, "aspidufnbaspioufnas;", "asdpofgnaedujogba;eu", 94235634),
            new Student(4, "asdkfjnasdpiagbt", "dfdq[oduifgheiug", 340965)
    );
    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        surname.setCellValueFactory(new PropertyValueFactory<>("surname"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));

        stuTable.setItems(list);

    }
}

package P795_ex5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller_ex5 implements Initializable {

    @FXML
    private final ComboBox<String> comboBox = new ComboBox<>();
    @FXML
    private final ListView<String> show = new ListView<>();
    @FXML
    private final Button addList = new Button();
    @FXML
    private final ListView<String> fileShow = new ListView<>();

    ObservableList<String> list = FXCollections.observableArrayList("Big Bang", "TV Show_2", "GINTAMA", "TV Show_4");

    ObservableList<String> BigBang = FXCollections.observableArrayList("Season: 6", "Time: 40min", "Country: US");

    ObservableList<String> TV2 = FXCollections.observableArrayList("Season: 4", "Time: 20min", "Country: UK");

    ObservableList<String> gintama = FXCollections.observableArrayList("Season: 3", "Time: 24min", "Country: Japan");

    ObservableList<String> Dalisi = FXCollections.observableArrayList(
            "Name: 大理寺日志", "Season: 1", "Time: 10min", "Country: China");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(list);

    }

    public void alter(ActionEvent event) {

        String choice = comboBox.getValue();

        if (choice.equals(list.get(0))) {
            show.setItems(BigBang);

        } else if (choice.equals(list.get(1))) {
            show.setItems(TV2);

        } else if (choice.equals(list.get(2))) {
            show.setItems(gintama);

        } else if (choice.equals(list.get(3))) {
            show.setItems(Dalisi);
        }
    }

    public void addToList(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File("E:\\MyNutCloud\\Wife"));

        List<File> selectFiles = fc.showOpenMultipleDialog(null);

        if (selectFiles != null) {
            for (File i : selectFiles) {
                fileShow.getItems().add(i.getName());
            }
        } else {
            System.out.println("No such file or No file selected.");
        }

    }

}

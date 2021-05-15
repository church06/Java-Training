import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class con_test implements Initializable {

    @FXML
    private Button btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Image image = new Image("file: /icons/like_red.png");
        ImageView view = new ImageView(image);

        btn.setGraphic(view);

    }
}

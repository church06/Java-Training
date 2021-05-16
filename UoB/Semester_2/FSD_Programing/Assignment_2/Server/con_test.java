import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

import javax.security.sasl.SaslClient;
import java.net.URL;
import java.util.ResourceBundle;

public class con_test implements Initializable {

    @FXML
    private Button btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn.setStyle("-fx-background-image: url(/img/icon.jpg)");


        //btn.setStyle("-fx-graphic: url('/img/icon.jpg')");


    }
}

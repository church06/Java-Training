package borderpane;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller_bor implements Initializable {

    @FXML
    private Label user;
    @FXML
    private Button signOut;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void getUser(String user) {
        this.user.setText(user);
    }

    public void signOut(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Pane root;

        try {
            root = loader.load(Objects.requireNonNull(getClass().getResource("/sample/wk_10.fxml")).openStream());

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void menu_closing() {
        Platform.exit();
        System.exit(0);
    }

}

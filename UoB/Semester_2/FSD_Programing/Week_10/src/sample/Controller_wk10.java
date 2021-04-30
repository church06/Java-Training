package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller_wk10 implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private Label label;
    @FXML
    private WebView view;
    private WebEngine engine;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    TreeView<String> treeView;

    public Model login = new Model();

    @FXML
    private Label state;
    @FXML
    private TextField username;
    @FXML
    private TextField passwd;

    Image icon = new Image("file:G:\\Entrance" +
            "\\Coding_Training\\JavaProgram" +
            "\\Training_and_UoB\\UoB" +
            "\\Semester_2\\FSD_Programing" +
            "\\Week_10\\src\\img\\icon.jpg", 25, 25, false, false);

    public void showDate(ActionEvent event) {
        LocalDate date = datePicker.getValue();
        label.setText(date.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        engine = view.getEngine();

        TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
        root.setExpanded(true);

        TreeItem<String> nodeA = new TreeItem<>("node A", new ImageView(icon));
        TreeItem<String> nodeB = new TreeItem<>("node B", new ImageView(icon));
        TreeItem<String> nodeC = new TreeItem<>("node C", new ImageView(icon));
        root.getChildren().addAll(nodeA, nodeB, nodeC);
        nodeA.setExpanded(true);

        TreeItem<String> nodeA1 = new TreeItem<>("node A1", new ImageView(icon));
        TreeItem<String> nodeA2 = new TreeItem<>("node A2", new ImageView(icon));
        TreeItem<String> nodeA3 = new TreeItem<>("node A3", new ImageView(icon));
        nodeA.getChildren().addAll(nodeA1, nodeA2, nodeA3);

        treeView.setRoot(root);

        if (login.isConnected()) {
            state.setText("Connect SuccessFul.");
        } else {
            state.setText("Network Error.");
        }

    }

    public void btn1(ActionEvent event) {
        engine.load("https://www.google.com");
    }

    public void btn2(ActionEvent event) {
        engine.load("https://www.baidu.com");
    }

    public void btn3(ActionEvent event) {
        engine.load("http://cn.bing.com");
    }

    public void btn4(ActionEvent event) {
        engine.load("www.cdsn.com");
    }

    public void mouseClick(MouseEvent event) {
        if (event.getClickCount() == 2) {
            TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }
    }

    public static Connection getConnection() {
        Connection con;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
            System.out.println(con);
            return con;

        } catch (Exception e) {
            return null;
        }
    }

    public void login(ActionEvent event) throws Exception {
        try {
            if (login.isLogin(username.getText(), passwd.getText())) {
                state.setText("Login Successful.");
            } else {
                state.setText("Login Failed. UserName or Password not correct.");
            }

        } catch (Exception e) {

        }
    }

}

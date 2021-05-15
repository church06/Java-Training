package com.bham.fsd.assignments;

import Polymorphism.demo05.Mouse;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class JabberUI {

    @FXML
    private TextField T1;
    @FXML
    private Label E1;
    @FXML
    private Button B1;
    @FXML
    private Button B2;
    @FXML
    private ListView<String> username_timeline;
    @FXML
    private ListView<ImageView> icon;
    @FXML
    private ListView<String> likes_num;


    final Image like_icon = new Image("file:/Client/icons/like_red.png");
    ImageView like = new ImageView(like_icon);

    boolean online = false;

    Controller_Ass_2 controller = new Controller_Ass_2();

    public JabberUI() throws IOException {
    }

    public void showTimeLine(ArrayList<ArrayList<String>> timelineData) {

        ObservableList<ArrayList<String>> timeline = FXCollections.observableArrayList();

        if (timelineData != null) {

            for (ArrayList<String> i : timelineData) {
                ArrayList<String> input = new ArrayList<>();

                input.add(i.get(0) + ": " + i.get(1));
                input.add(i.get(3));

                timeline.add(input);
            }

            System.out.println(timeline);

            for (ArrayList<String> i : timeline) {

                username_timeline.getItems().add(i.get(0));

                likes_num.getItems().add(i.get(i.size() - 1));
            }

        }
    }

    public void Login_func() {

        try {

            if (B1.getText().equals("Sign Out")) {

                controller.signOut();
                ((Stage) (B1.getScene().getWindow())).close();
            }

            if (B1.getText().equals("Sign In")) {
                controller.login(T1.getText());

                login_detect();
                Sign_state();

                Thread.sleep(50);
                ArrayList<ArrayList<String>> timeline = controller.data_respond();
                System.out.println("array timeline: " + timeline + "\n");
                showTimeLine(timeline);

            }

        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void Register_func() {

        try {

            if (B1.getText().equals("Sign In")) {
                controller.register(T1.getText());
                login_detect();
                Sign_state();

            }
        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void Sign_state() {

        if (B1.getText().equals("Sign In") && online) {
            B1.setText("Sign Out");
            B1.setPrefWidth(80);
            B1.setLayoutX(110);

            B2.setVisible(false);
            B2.setManaged(false);

        }
    }

    public void login_detect() throws IOException, ClassNotFoundException, InterruptedException {

        String respond = controller.server_respond();

        if (respond.equals("unknown-user")) {
            E1.setText("Invalid username.");

        } else {
            online = true;
            controller.timeLine();
            controller.server_respond();

            E1.setTextFill(Color.GREEN);
            E1.setText("Login successful.");
        }
    }

    public void refresh() {
        username_timeline.refresh();
        icon.refresh();
        likes_num.refresh();
    }
}

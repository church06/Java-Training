package com.bham.fsd.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class JabberUI implements Initializable {

    // Login ===============================
    @FXML
    private TextField T1;
    @FXML
    private Label E1;
    @FXML
    private Button B1;
    @FXML
    private Button B2;
    // =====================================

    // Button Group ========================
    @FXML
    private Button[] B4;
    @FXML
    private Button[] B5;
    // =====================================

    // Panel 1 -> P1 =======================
    @FXML
    TableView<TimeLine> timelineShow;
    @FXML
    TableColumn<TimeLine, String> line;
    @FXML
    TableColumn<TimeLine, Button> buttons;
    @FXML
    TableColumn<TimeLine, String> count;
    // =====================================

    // Panel 2 -> P2 =======================
    @FXML
    TableView<Users> userFollowShow;
    @FXML
    TableColumn<Users, String> username;
    @FXML
    TableColumn<Users, Button> addButtons;
    // =====================================

    // Post Jab ============================
    @FXML
    private TextField T2;
    @FXML
    private Button B6;
    // ====================================

    // Online state setting
    boolean online = false;

    // button counter
    int button4_amount = 0;
    int button5_amount = 0;

    // for show timeline
    ArrayList<ArrayList<String>> timeline = new ArrayList<>();

    // for show users
    ArrayList<ArrayList<String>> userLine = new ArrayList<>();

    Controller_Ass_2 controller = new Controller_Ass_2();

    public JabberUI() throws IOException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        line.setCellValueFactory(new PropertyValueFactory<>("timeline"));
        buttons.setCellValueFactory(new PropertyValueFactory<>("B4"));
        count.setCellValueFactory(new PropertyValueFactory<>("counter"));

        username.setCellValueFactory(new PropertyValueFactory<>("username"));
        addButtons.setCellValueFactory(new PropertyValueFactory<>("btn"));

    }

    // GUI show & Refresh for timeline and follow users ================================================================
    public synchronized void showTimeLine(ArrayList<ArrayList<String>> timelineData) {

        if (timelineData != null) {
            timeline.clear();

            for (ArrayList<String> i : timelineData) {
                ArrayList<String> input = new ArrayList<>();

                input.add(i.get(0) + ": " + i.get(1));
                input.add(i.get(2));
                input.add(i.get(3));
                timeline.add(input);
            }

            System.out.println("\nTimeline: " + timeline);

            timelineShow.setItems(timeLines(timeline));
        }
    }

    public synchronized void showUserLine(ArrayList<ArrayList<String>> userFollowData) {

        if (userFollowData != null) {
            userLine = userFollowData;
        }

        System.out.println("\nNot Followed Users: " + userLine);
        userFollowShow.setItems(userLines(userLine));
    }

// =====================================================================================================================

    // Button Function =================================================================================================
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
            }

        } catch (InterruptedException e) {
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

// =====================================================================================================================

    // FOR LOGIN STATE EVENT ===========================================================================================
    public void Sign_state() {

        if (B1.getText().equals("Sign In") && online) {
            B1.setText("Sign Out");
            B1.setPrefWidth(80);
            B1.setLayoutX(110);

            B2.setVisible(false);
            B2.setManaged(false);

        }
    }


    public void login_detect() throws InterruptedException {

        String respond = controller.server_respond();

        if (respond.equals("unknown-user")) {
            E1.setText("Invalid username.");

        } else {
            online = true;
            controller.timeLine();
            controller.server_respond();

            Thread.sleep(50);

            ArrayList<ArrayList<String>> temp = controller.data_respond();
            showTimeLine(temp);
            refresh();

            controller.notFollowedUser();
            controller.server_respond();

            Thread.sleep(50);

            ArrayList<ArrayList<String>> follow_temp = controller.data_respond();
            showUserLine(follow_temp);
            refresh();

            E1.setTextFill(Color.GREEN);
            E1.setText("Login successful.");
        }
    }

    public void refresh() {
        timelineShow.refresh();
        userFollowShow.refresh();
    }

// =====================================================================================================================

    // Timeline relevant ===============================================================================================
    public ObservableList<TimeLine> timeLines(ArrayList<ArrayList<String>> input) {
        ObservableList<TimeLine> output = FXCollections.observableArrayList();

        B4 = new Button[input.size()];
        button4_amount = B4.length;

        for (int i = 0; i < B4.length; i++) {
            B4[i] = new Button();
            B4[i].setOnAction(this::likeDefaultHandler);
        }

        for (int i = 0; i < input.size(); i++) {
            output.add(new TimeLine(input.get(i).get(0), B4[i], input.get(i).get(2)));
        }

        return output;
    }

    public void likeDefaultHandler(ActionEvent event) {

        for (int i = 0; i < button4_amount; i++) {

            if (event.getSource() == B4[i]) {

                System.out.println("The amount of Likes are: " + count.getCellObservableValue(i) +
                        " for Button[" + i + "].");

                try {
                    controller.addLike(timeline.get(i).get(1));

                    System.out.println("Protocol: " + controller.server_respond());

                    if (controller.server_respond().equals("posted")) {
                        int added = Integer.parseInt(timeline.get(i).get(2));

                        ++added;

                        timeline.get(i).set(2, String.valueOf(added));
                    }

                    controller.timeLine();

                    if (controller.server_respond().equals("timeline")) {

                        ArrayList<ArrayList<String>> temp = controller.data_respond();
                        System.out.println("B5 Data Update: " + controller.data_respond());
                        showTimeLine(temp);
                    }

                    timelineShow.setItems(timeLines(timeline));

                    Thread.sleep(50);
                    userFollowShow.setItems(userLines(userLine));

                    refresh();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    // =====================================================================================================================
    // Not Follow Related
    public synchronized ObservableList<Users> userLines(ArrayList<ArrayList<String>> input) {
        ObservableList<Users> output = FXCollections.observableArrayList();

        B5 = new Button[input.size()];
        button5_amount = input.size();

        for (int i = 0; i < B5.length; i++) {
            B5[i] = new Button();
            B5[i].setOnAction(this::followEventHandler);
        }

        for (int i = 0; i < input.size(); i++) {
            output.add(new Users(input.get(i).get(0), B5[i]));
        }

        return output;
    }

    public void followEventHandler(ActionEvent event) {

        for (int i = 0; i < button5_amount; i++) {

            if (event.getSource() == B5[i]) {

                System.out.println("B5 is working, and the username is " + username.getCellObservableValue(i));

                try {
                    controller.followButton(userLine.get(i).get(0));
                    System.out.println("Protocol: " + controller.server_respond());

                    if (controller.server_respond().equals("posted")) {
                        userLine.remove(i);
                    }

                    controller.timeLine();

                    if (controller.server_respond().equals("timeline")) {

                        ArrayList<ArrayList<String>> temp = controller.data_respond();
                        System.out.println("B5 Data Update: " + controller.data_respond());
                        showTimeLine(temp);
                    }

                    timelineShow.setItems(timeLines(timeline));

                    Thread.sleep(50);
                    userFollowShow.setItems(userLines(userLine));

                    refresh();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

// =====================================================================================================================

    // Post Jab functions

    public void postJab() {

        if (T2.getText() != null) {

            controller.postTo(T2.getText());

            try {
                if (controller.server_respond().equals("posted")) {
                    controller.timeLine();
                    Thread.sleep(50);

                    if (controller.server_respond().equals("timeline")) {
                        ArrayList<ArrayList<String>> temp = controller.data_respond();
                        System.out.println("B6 Data Update: " + controller.data_respond());
                        showTimeLine(temp);

                    }
                }

                timelineShow.setItems(timeLines(timeline));

                Thread.sleep(50);
                userFollowShow.setItems(userLines(userLine));

                refresh();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

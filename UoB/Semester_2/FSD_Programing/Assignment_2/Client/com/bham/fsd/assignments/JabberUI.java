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

    @FXML
    private TextField T1;
    @FXML
    private Label E1;
    @FXML
    private Button B1;
    @FXML
    private Button B2;

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

    }

    public void showTimeLine(ArrayList<ArrayList<String>> timelineData) {

        if (timelineData != null) {

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
// =====================================================================================================================

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

             timeline = controller.data_respond();
            showTimeLine(timeline);
            refresh();

            controller.notFollowedUser();
            controller.server_respond();

            Thread.sleep(50);

            userLine = controller.data_respond();
            refresh();

            E1.setTextFill(Color.GREEN);
            E1.setText("Login successful.");
        }
    }

    public void refresh() {
        timelineShow.refresh();
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

                    timelineShow.setItems(timeLines(timeline));
                    refresh();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
// =====================================================================================================================

    public void followEventHandler(ActionEvent event) {

        for (int i = 0; i < button5_amount; i++) {

            if (event.getSource() == B5[i]) {

            }
        }
    }


}

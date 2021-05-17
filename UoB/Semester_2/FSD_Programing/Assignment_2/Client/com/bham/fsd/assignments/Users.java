package com.bham.fsd.assignments;


import javafx.scene.control.Button;

public class Users {

    private String username;
    private Button btn;

    public Users(String username, Button btn) {
        this.username = username;
        this.btn = btn;

        btn.setStyle("-fx-background-color: #12C327");

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}

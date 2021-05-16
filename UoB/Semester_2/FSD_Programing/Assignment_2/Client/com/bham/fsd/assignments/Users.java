package com.bham.fsd.assignments;

import java.awt.*;

public class Users {

    private String username;
    private Button btn;

    public Users(String username, Button btn) {
        this.username = username;
        this.btn = btn;
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

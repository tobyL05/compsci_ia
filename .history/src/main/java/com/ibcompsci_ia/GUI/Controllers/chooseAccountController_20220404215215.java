package com.ibcompsci_ia.GUI.Controllers;

import java.io.IOException;

import com.

import javafx.fxml.FXML;

public class chooseAccountController {

    @FXML
    private void switchToPrimary() throws IOException {
        Main.setRoot("mainMenu");
    }
}
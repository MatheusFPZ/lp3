package com.mycompany.puxarselecao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class PrimaryController {

    @FXML
    private Button btn;

    @FXML
    private RadioButton r1;

    @FXML
    private RadioButton r2;

    @FXML
    private RadioButton r3;

    @FXML
    private RadioButton r4;
      @FXML
    private ToggleGroup frutas;

    @FXML
    void clickbtn(ActionEvent event) {
       
    }

    @FXML
    void clickr1(ActionEvent event) {
       btn.setText(((RadioButton) frutas.getSelectedToggle()).getText());
       
    }

    @FXML
    void clickr2(ActionEvent event) {
       btn.setText(((RadioButton) frutas.getSelectedToggle()).getText());

    }

    @FXML
    void clickr3(ActionEvent event) {
       btn.setText(((RadioButton) frutas.getSelectedToggle()).getText());

    }

    @FXML
    void clickr4(ActionEvent event) {
       btn.setText(((RadioButton) frutas.getSelectedToggle()).getText());

    }

}

package com.mycompany.sortear;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML
    private Pane panel1;

    @FXML
    private Pane panel2;

    @FXML
    private Pane panel3;
    
        @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    void sortear(ActionEvent event) {
        
        executar();

    }

    private void executar() {
       Color cor1 = gerarCor(); 
       Color cor2 = gerarCor();
       Color cor3 = gerarCor();
       String convertido = corParaCodigo(cor1);
       String convertido2 = corParaCodigo(cor2);
       String convertido3 = corParaCodigo(cor3);

       panel1.setStyle("-fx-background-color:"+convertido);
       lbl1.setText(convertido);
       panel2.setStyle("-fx-background-color:"+convertido2);
        lbl2.setText(convertido2);
        panel3.setStyle("-fx-background-color:"+convertido3);
        lbl3.setText(convertido3);


    }

    private Color gerarCor() {
        Random rand = new Random();
        double red = rand.nextDouble();
        double green = rand.nextDouble();
        double blue = rand.nextDouble();
        return new Color(red, green, blue, 1.0);
    }
    
     private String corParaCodigo(Color cor) {
        int red = (int) (cor.getRed() * 255);
        int green = (int) (cor.getGreen() * 255);
        int blue = (int) (cor.getBlue() * 255);
        return String.format("#%02X%02X%02X", red, green, blue);
    }

}
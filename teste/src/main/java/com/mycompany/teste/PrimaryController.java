package com.mycompany.teste;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button btn;

    @FXML
    private TextField texto;
    
    @FXML
    private Label lbl;
     @FXML
    private Label lbl2;
      @FXML
    private Label lbl3;
       @FXML
    private Label lbl4;
    

    @FXML
    void areadeTexto(ActionEvent event) {

    }
    

    @FXML
    void connfirmarButton(ActionEvent event) {
       
        String textoo = texto.getText();
        int maiusculo=0;
        int minusculo=0;
        int digito=0;
        int especial=0;
        
        for(int i=0; i<textoo.length(); i++){
            Character umChar = textoo.charAt(i);
            
                if(Character.isUpperCase(umChar)){
                    maiusculo++;
        }else if(Character.isLowerCase(umChar)){
                    minusculo++;
        }else if(Character.isDigit(umChar)){
                    digito++;
        }else if(!Character.isSpaceChar(umChar)&& !Character.isDigit(umChar) && !Character.isAlphabetic(umChar)){
            
                    especial++;
                   
        }
        }
         System.out.println(especial);
        
        String mai = Integer.toString(maiusculo);
        String min = Integer.toString(minusculo);
        String dig = Integer.toString(digito);
        String esp = Integer.toString(especial);

        lbl.setText(mai);
        lbl2.setText(min);
        lbl4.setText(dig);
        lbl3.setText(esp);

       
        
    }

}

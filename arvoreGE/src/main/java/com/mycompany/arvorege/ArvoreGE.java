/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arvorege;

/**
 *
 * @author MICRO23
 */
public class ArvoreGE {

    public static void main(String[] args) {
       
        pessoa jose = new pessoa("Jose", null, null);
        pessoa maria = new pessoa("Maria", null, null);
        pessoa joao = new pessoa("joao", jose, maria);
        
        
        pessoa jose1 = new pessoa("Jose", null, null);
        pessoa maria1 = new pessoa("Maria", null, null);
        pessoa joao1 = new pessoa("joao", jose, maria);
        
        
        if(jose1.ehigual(jose)){
            System.out.println("igual");
        }else{
                        System.out.println("n igual");

        }
        
        if(maria.possivelAnte(joao)){
            System.out.println("é a mae ou pai");
        }
        
    }
}

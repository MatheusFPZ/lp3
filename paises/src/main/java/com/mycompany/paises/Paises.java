/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paises;

/**
 *
 * @author MICRO23
 */
public class Paises {

    public static void main(String[] args) {
        
        
         pais brasil = new pais("BRA", "brasil",2.00,2323222);
        pais argentina = new pais("ARG","Argentina",5.0,222222);
        pais uruguai = new pais("URU", "Uruguai",5.1,121211);
        pais paraguai = new pais("PAR", "Paraguai",15.1,232322);
        pais chile = new pais("CHI", "Chile",30.1,23232322);
        
        brasil.(argentina);
        brasil.addPaisVizinho(uruguai);
        brasil.addPaisVizinho(paraguai);
        
        argentina.addPaisVizinho(brasil);
        argentina.addPaisVizinho(uruguai);
        argentina.addPaisVizinho(chile);
        argentina.addPaisVizinho(paraguai);
        
        uruguai.addPaisVizinho(brasil);
        uruguai.addPaisVizinho(argentina);
        
        paraguai.addPaisVizinho(brasil);
        paraguai.addPaisVizinho(argentina);
        
        chile.addPaisVizinho(argentina);
        
        System.out.println("Brasil x Uruguai: " + brasil.eIgual(uruguai));
        System.out.println("Brasil x Brasil: " + brasil.eIgual(brasil));
        System.out.println("Brasil -> vizinho Uruguai: " + brasil.eLimitrofe(uruguai));
        
        System.out.println("Vizinhos Comuns entre Brasil e Argentina:");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paises;

import java.util.ArrayList;

/**
 *
 * @author MICRO23
 */
public class Continente {
    
    String nome;
    ArrayList<pais> paises = new ArrayList<pais>();

    public Continente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void addPais(pais umPais){
        this.paises.add(umPais);
    }
    
    public Double getDim(){
        Double total =0.0;
        for(pais umPais: this.paises){
             total+=umPais.getExtensao();
            
        }
        return total;
    }
    public int getPop(){
        int total = 0;
        for(pais umPais: this.paises){
            total+=umPais.getPop();
        }
        return total;
    }
    
    public Double getDens(){
        Double total=0.0;
        for(pais umPais: this.paises){
            total+=umPais.densPop();
        }
        return total;
    }
    
    
    
    
    
    
    public pais getMaior(){
        pais maiorPais = paises.get(0);
        for(int i=1;i<paises.size();i++){
            pais umPais = paises.get(i);
            if(umPais.getPop()>maiorPais.getPop()){
                maiorPais=umPais;
            }
        }
        return maiorPais;
    }
    
    public pais getMenor(){
        pais menorPais = paises.get(0);
        for(int i=1; i<paises.size();i++){
        pais umPais = paises.get(i);
        if(umPais.getPop()<menorPais.getPop()){
            menorPais = umPais;
        }
        }
        return menorPais;
    }
    
    public pais getMaiorDim(){
        pais maiorDim = paises.get(0);
        for(int i=0; i<paises.size();i++){
        pais umPais = paises.get(i);
        if(umPais.getExtensao()>maiorDim.getExtensao()){
            maiorDim=umPais;
        }
    }
        return maiorDim;
    }
    public pais getMenorDim(){
        pais menorDim = paises.get(0);
        for(int i=0; i<paises.size();i++){
        pais umPais = paises.get(i);
        if(umPais.getExtensao()<menorDim.getExtensao()){
            menorDim=umPais;
        }
    }
        return menorDim;
    }
    public Integer razao(){
        pais maior = this.getMaiorDim();
        pais menor = this.getMenorDim();
        return maior.getPop()/menor.getPop();
    }
    
}
 
    
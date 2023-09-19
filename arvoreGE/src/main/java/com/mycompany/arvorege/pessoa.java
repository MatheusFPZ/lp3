/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvorege;

import java.util.ArrayList;

/**
 *
 * @author MICRO23
 */
public class pessoa {
    
    String nome;
    private pessoa pai;
    private pessoa mae;

    public pessoa(String nome, pessoa pai, pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public pessoa getPai() {
        return pai;
    }

    public void setPai(pessoa pai) {
        this.pai = pai;
    }

    public pessoa getMae() {
        return mae;
    }

    public void setMae(pessoa mae) {
        this.mae = mae;
    }
    
    public boolean ehigual(pessoa outraPessoa){
        if(this.nome==outraPessoa.getNome()&& this.mae==outraPessoa.getMae()){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean ehIrma(pessoa outraPessoa){
        if(this.getMae()== outraPessoa.getMae()&&this.getPai()==outraPessoa.getPai()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean possivelAnte(pessoa outraPessoa){
        
        return this== outraPessoa.getMae()|| this== outraPessoa.getPai();
    }
    
    
}

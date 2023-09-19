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
public class pais {
    
    String iso;
    String nome;
    Double extensao;
    Integer pop;
    ArrayList<pais> vizinho = new ArrayList<pais>();

    public pais(String iso, String nome, Double extensao, Integer pop) {
        this.iso = iso;
        this.nome = nome;
        this.extensao = extensao;
        this.pop = pop;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getExtensao() {
        return extensao;
    }

    public void setExtensao(Double extensao) {
        this.extensao = extensao;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

   public boolean ehigual(pais outropais){
       if(this.iso==outropais.iso){
           return true;
       }else{
           return false;
       }
       
   }
   
   public boolean ehlimitrofe(pais outropais){
       
       if(this.vizinho.contains(outropais)){
           return true;
       }else{
           return false;
       }
   }
    
   public double densPop(){
       return this.pop/this.extensao;
       
   }
   
   public ArrayList<pais> vizinhosComuns(pais outroPais){
   ArrayList<pais> vizinhosComuns = new ArrayList<pais>();
   for(pais umVizinho: this.vizinho){
       if(outroPais.ehlimitrofe(umVizinho)){
       vizinhosComuns.add(umVizinho);
       
   }
   }
  
    return vizinhosComuns;
}
}
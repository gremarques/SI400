/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicamp.ft.entities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Bruno
 */
public class Pais implements Serializable{
    private String pais;
    private int ano;
    private Map<String,Double>valores;
    
    //Contrutor
    public Pais() {
        valores = new TreeMap();
    }
    //Metodos

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Map<String, Double> getValores() {
        return valores;
    }

    public void setValores(Map<String, Double> valores) {
        this.valores = valores;
    }
    public void adcionarValor(String pais, Double valores){
        this.valores.put(pais, valores);
    }
    
    public Double retornarValor(String pais){
        return this.valores.get(pais);
    }
    
   
}
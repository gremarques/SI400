/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.fertilizante;

import java.io.Serializable;

/**
 *
 * @author Bruno
 */
public class Pais implements Serializable{
    String nome;
    String codigo;
    int valor_Consumo;
    String regiao;
    String grupo_renda;
    
    //Contrutor
    public Pais() {
        this.nome = null;
        this.codigo = null;
        this.valor_Consumo = 0;
        this.regiao = null;
        this.grupo_renda = null;
    }
    
    
    //Metodos
    public String getNome() 
    {
        return nome;
    }

    public boolean setNome(String nome) 
    {
        this.nome = nome;
        return true;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public boolean setCodigo(String codigo) 
    {
        
            this.codigo = codigo;
            return true;
    }

    public int getValor_consumo() 
    {
        return valor_Consumo;
    }

    public boolean setValor_consumo(int valor_Consumo) 
    {
           if (valor_Consumo > 0)
        {
            this.valor_Consumo = valor_Consumo;
            return true;
        }
        else
            return false;
    }

    public String getRegiao() {
        return regiao;
    }

    public boolean setRegiao(String regiao) 
    {
        this.regiao = regiao;
        return true;
    }

    public String getGrupo_renda() {
        return grupo_renda;
    }

    public boolean setGrupo_renda(String grupo_renda) 
    {
        this.grupo_renda = grupo_renda;
        return true;
    }
    
    
    
}

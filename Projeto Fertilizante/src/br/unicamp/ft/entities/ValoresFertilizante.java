package br.unicamp.ft.entities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ValoresFertilizante {

    private final Map<String,Pais> listaPaises;
    private final ProjetoFertilizante paisDadosPersist;
    public final List<String> nomesAnos;


    public ValoresFertilizante() {
    paisDadosPersist = new ProjetoFertilizante();
    listaPaises = paisDadosPersist.lerListaPaisesCSV();
    nomesAnos = paisDadosPersist.obterHeader();
    }

    public int obterNumeroPaises(){
        return this.listaPaises.size();
    }
    public Map<String,Pais> buscarPaises(String paisBuscado){
        Map<String,Pais> paisesBuscado = new TreeMap();
        for(Map.Entry<String,Pais> entry : this.listaPaises.entrySet()){
            String nomePais = entry.getValue().getPais().toLowerCase();
            if(nomePais.contains(nomePais)){
                paisesBuscado.put(entry.getKey(),entry.getValue());
            }
        }
        
        return paisesBuscado;
    }
    
    public Pais buscarUmPais(String pais){
        return listaPaises.get(pais);
    }    
}
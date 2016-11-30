package br.unicamp.ft.entities;

import br.unicamp.ft.dados.PaisesDados;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnosPaises {

    private final Map<String,Pais> listaPaises;
    private final PaisesDados paisDadosPersist;
    public final List<String> nomesAnos;

    //Obter os anos dos paises
    public AnosPaises() {
    paisDadosPersist = new PaisesDados();
    listaPaises = paisDadosPersist.lerListaPaisesCSV();
    nomesAnos = paisDadosPersist.obterHeader();
    }

    public int obterNumeroPaises(){
        return this.listaPaises.size();
    }
    //Buscar o pais no CSV
    public Map<String,Pais> buscarPaises(String paisBuscado){
        Map<String,Pais> paisesBuscado = new TreeMap();
        for(Map.Entry<String,Pais> entry : this.listaPaises.entrySet()){
            String nomePais = entry.getValue().getPais().toLowerCase();
            if(nomePais.contains(paisBuscado)){
                paisesBuscado.put(entry.getKey(),entry.getValue());
            }
        }
        return paisesBuscado;
    }
    
    public Pais buscarUmPais(String pais){
        return listaPaises.get(pais);
    }    
    
    public static void main(String[] args){
        AnosPaises p = new AnosPaises();
        System.out.println(p.buscarPaises("Angola"));
    }
}
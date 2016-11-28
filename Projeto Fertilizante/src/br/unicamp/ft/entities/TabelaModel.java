package br.unicamp.ft.entities;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.table.AbstractTableModel;
import br.unicamp.ft.entities.Pais;
import br.unicamp.ft.entities.ValoresFertilizante;

public class TabelaModel extends AbstractTableModel{
    private final String[] colunas;
    private final String[] linhas;
    Map<String,Pais> listaPaises;
    ValoresFertilizante tblValoresFertilizante;
    
    public TabelaModel(ValoresFertilizante valoresPaises, Pais pais){
        this.tblValoresFertilizante = valoresPaises;
        
        int numeroColunas = tblValoresFertilizante.nomesAnos.size() + 2;
        colunas = new String[numeroColunas];
        
        //Preencher colunas
        colunas[0] = "Pais";
        colunas[1]= "Ano";
        int i = 2;
        for(String nomeAnos : this.tblValoresFertilizante.nomesAnos){
            colunas[i] = nomeAnos;
            i++;
        }
        //obter filas
        this.listaPaises = new TreeMap<>();
        listaPaises.put(pais.getPais(), pais);
        linhas = listaPaises.keySet().toArray(new String[listaPaises.size()]);
    }
    
    public TabelaModel(ValoresFertilizante valoresPaises,Map<String,Pais> listaPaises,String Anos){
        this.tblValoresFertilizante = valoresPaises;
        int numeroColunas;
        
        //Todos os anos
        
        if(Anos.equals("TODAS")){
            numeroColunas = tblValoresFertilizante.nomesAnos.size() + 2;
            colunas = new String[numeroColunas];
            
            colunas[0] = "Pais";
            colunas[1] = "Ano";
            int i = 2;
            for(String nomeAnos : this.tblValoresFertilizante.nomesAnos){
                colunas[i] = nomeAnos;
                i++;
            }
        }
        else{
            numeroColunas = 3;
            colunas = new String[numeroColunas];
            colunas[0] = "Pais";
            colunas[1] = "Ano";
            colunas[2] = Anos;
        }
        
        this.listaPaises = listaPaises;
        linhas = listaPaises.keySet().toArray(new String[listaPaises.size()]);
        
    }

    @Override
    public int getRowCount() {
        return this.linhas.length;
    }
    

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override 
    public String getColumnName(int num){
        return this.colunas[num];
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

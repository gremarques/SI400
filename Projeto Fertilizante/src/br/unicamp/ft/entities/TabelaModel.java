package br.unicamp.ft.entities;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.table.AbstractTableModel;
import br.unicamp.ft.entities.Pais;
import br.unicamp.ft.entities.AnosPaises;

public class TabelaModel extends AbstractTableModel{
    private final String[] colunas;
    private final String[] linhas;
    Map<String,Pais> listaPaises;
    AnosPaises tblValoresFertilizante;
    
    //Criando um modelo da tabela a ser usado
    public TabelaModel(AnosPaises valoresPaises, Pais pais){
        this.tblValoresFertilizante = valoresPaises;
        
        int numeroColunas = tblValoresFertilizante.nomesAnos.size() + 2;
        colunas = new String[numeroColunas];
        
        //Preencher colunas
        colunas[0] = "Pais";
        colunas[1]= "Ano";
        int i = 2;
        //colunas dos anos que sera adicionado
        for(String nomeAnos : this.tblValoresFertilizante.nomesAnos){
            colunas[i] = nomeAnos;
            i++;
        }
        //obter filas
        this.listaPaises = new TreeMap<>();
        listaPaises.put(pais.getPais(), pais);
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
    public Object getValueAt( int rowIndex, int columnIndex) {
        String codigo = this.linhas[rowIndex];
        switch(columnIndex){
            case 0: return this.listaPaises.get(codigo).getPais();
            case 1: return 0;//this.listaPaises.get(codigo).getValores();
        }
       String nomeDisciplinaColuna = this.colunas[columnIndex];
        double nota = this.listaPaises.get(codigo).retornarValor(nomeDisciplinaColuna);            
        return nota;
    }

   
}

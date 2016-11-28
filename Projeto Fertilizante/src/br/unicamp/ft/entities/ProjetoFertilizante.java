package br.unicamp.ft.entities;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjetoFertilizante {
    List<String> anoPaises = new ArrayList();
    
        
        public Map<String,Pais> lerListaPaisesCSV(){
            Map<String,Pais> listaPaises = new TreeMap<>();
            try{        
                CSVReader reader = new CSVReader(new FileReader("API_AG.CON.FERT.ZS_DS2_en_csv_v2.csv"),',');

                String [] nextLine;
                boolean headerFoiLido = false;
                        
                while ((nextLine = reader.readNext()) != null) {
                    Integer ano = 0;
                    Integer valor;
                    if(nextLine!=null){
                    //Ler o Header(ANO)
                        if(!headerFoiLido){
                            preencherAnos(nextLine,ano);
                            headerFoiLido = true;
                            continue;
                        }
                        //Ler os paises e seus valores
                        Pais pais = new Pais();
                        pais.setPais(nextLine[0]);
                        int i = 46;
                        for(String Pais:anoPaises) {
                            if(nextLine[i].equals(""))
                                nextLine[i]="0";
                            else{
                            pais.adcionarValor(Pais, new Double(nextLine[i]));
                            i++;
                            
                            }
                        }
                        listaPaises.put(pais.getPais(), pais);
                    }
                    
                }
            }
            catch(IOException ex){
                Logger.getLogger(ProjetoFertilizante.class.getName()).log(Level.SEVERE, null, ex);
            }
            return listaPaises;
        }
    
    public List<String> obterHeader(){
        return anoPaises;
    }    

    //Recebe a coluna com os valores do ano
    public void preencherAnos(String [] nextLine,Integer ano){
            for(String column: nextLine){
                if(column.equals("2002")||column.equals("2003")||column.equals("2004")||column.equals("2005")||column.equals("2006")||column.equals("2007")||column.equals("2008")||column.equals("2009")||column.equals("2010")||column.equals("2011")||column.equals("2012")||column.equals("2013")){
                    anoPaises.add(column);
                }
            }
    }
    
   
    
    //-----------------------------------------------------------------------------------------------------------
    
   public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        
//        CSVReader reader = new CSVReader(new FileReader("API_AG.CON.FERT.ZS_DS2_en_csv_v2.csv"));
        CSVReader reader = new CSVReader(new FileReader("API_AG.CON.FERT.ZS_DS2_en_csv_v2.csv"), ',');
        String [] nextLine;
        String [] line;
        
        Pais pais;
        //paises = new Pais[300];
        int contador = 0;
        
//        infos.add(new ArrayList<Pais>());
//        infos.add(new ArrayList<String>());

        SortedMap<String, ArrayList> infos = new TreeMap<>(); 
        nextLine = reader.readNext();
        for (int i = 0; i < nextLine.length; i++) {
            if (nextLine[i].equals("2002")) {
             contador = i;   
            }
        }
//        nextLine = reader.readNext();
//        for (int i = 0; i < nextLine.length; i++) {
//            System.out.println((1960+i)+ "-"+nextLine[contador]+"-");
//        }
        double num;
        
        
        while ((nextLine = reader.readNext()) != null) 
        {
            ArrayList<Double> dados = new ArrayList<Double>();
            
            
            pais = new Pais(); // referenciando o array para Pais
            //pais.setNome(nextLine[0]); // set nome de acordo com a linha em questão
            //System.out.println(nextLine[0]);               
            //infos.put(pais, Double.parseDouble(nextLine[contador]));
            
            pais.setPais(nextLine[0]);
            
            
            for (int i = 0; i < 12; i++) {
//               num =  new Double(nextLine[(0)]);
//               dados.add(num);
                if (nextLine[contador+i].equals("")) {
                    dados.add(0.0);
                }else{
                    dados.add(Double.parseDouble(nextLine[contador+i]));
                }
                
            }
            infos.put(pais.getPais(), dados);
            
            //System.out.println("Nome do país " + (contador) + ": " + paises[contador].getNome());
            //System.out.println("NOME: "+ infos.get(0).get(0).);
           
        }
        for(Map.Entry<String,ArrayList> entry : infos.entrySet()){
            System.out.println("PAIS: "+entry.getKey()+" - numero: "+entry.getValue().toString());
        }
        
       
 /*       while ((line = reader.readNext()) != null) 
        {
            for (contador = 0; contador < line.length; contador++){
 //           paises[contador] = new Pais(); // referenciando o array para Pais
   //         paises[contador].setNome(line[0]); // set nome de acordo com a linha em questão
            System.out.print("[" +contador + "-->"+line[contador]+ "] ");               
            //System.out.println("Nome do país " + (contador - 4) + ": " + paises[contador].getNome());
            //contador++;
            }
            System.out.println();
        }
 */       //System.out.println(paises[5].getNome()); // primeiro pais (5° linha !!)
        
        
        //while ((nextLine = reader.readNext()) != null) 
        //{
        //    System.out.println(" -- " + nextLine[0] + " ** ");
        //}
        
  /*      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
*/
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
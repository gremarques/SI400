package br.unicamp.ft.dados;

import br.unicamp.ft.entities.Pais;
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

public class PaisesDados {
    List<String> anoPaises = new ArrayList();
    
        public Map<String,Pais> lerListaPaisesCSV(){
            Map<String,Pais> listaPaises = new TreeMap<>();
            try{        
                CSVReader reader = new CSVReader(new FileReader("API_AG.CON.FERT.ZS_DS2_en_csv_v2.csv"),',');

                String [] nextLine;
                boolean headerFoiLido = false;
                        
                while ((nextLine = reader.readNext()) != null) {
                    if(nextLine!=null){
                    //Ler o Header(ANO)
                        if(!headerFoiLido){
                            preencherAnos(nextLine);
                            headerFoiLido = true;
                            continue;
                        }
                        //Ler os paises e seus valores
                        Pais pais = new Pais();
                        pais.setPais(nextLine[0]);
                        int i = 46;
                        for(String Pais : anoPaises) {
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
                Logger.getLogger(PaisesDados.class.getName()).log(Level.SEVERE, null, ex);
            }
            return listaPaises;
        }
    
    public List<String> obterHeader(){
        return anoPaises;
    }    

    //Recebe a coluna com os valores do ano
    public void preencherAnos(String [] nextLine){
            for(String column: nextLine){
                if(column.equals("2002")||column.equals("2003")||column.equals("2004")||column.equals("2005")||column.equals("2006")||column.equals("2007")||column.equals("2008")||column.equals("2009")||column.equals("2010")||column.equals("2011")||column.equals("2012")||column.equals("2013")){
                    anoPaises.add(column);
                }
            }
    }
    
   
    
    //-----------------------------------------------------------------------------------------------------------
     public static void main (String[] args)throws FileNotFoundException,IOException{
         PaisesDados p = new PaisesDados();
         System.out.println(p.lerListaPaisesCSV());
         
     }
  
  }    
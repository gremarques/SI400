package projeto.fertilizante;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjetoFertilizante {
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        
        //codigo da maneira feito pelo professor. nao deu certo...
        //erro na funcao toString na classe WorldBank (acho)
        /*try{
        WorldBank wb = new WorldBank();
        File arq = new File("/Users/leo/Downloads/arquivo csv/Metadata_Country_API_AG.CON.FERT.ZS_DS2_en_csv_v2");            
        wb.save(arq);
        WorldBank refund = new WorldBank();
        refund.load(arq);
        System.out.println("Obtido localmente" + " "+refund.toString());*/
        
        //Quando forem executar mudar o endereço do arquivo abaixo(/Users/leo ...) para o endereco baixado no seu computador
        CSVReader reader = new CSVReader(new FileReader("/Users/Gregory/Desktop/FT - UNICAMP/4° semestre/POO II/API_AG.CON.FERT.ZS_DS2_en_csv_v2.csv"));
        String [] nextLine;
        
        Pais[] paises;
        paises = new Pais[300];
        int contador = 0;
       
        
        while ((nextLine = reader.readNext()) != null) 
        {
            paises[contador] = new Pais(); // referenciando o array para Pais
            paises[contador].setNome(nextLine[0]); // set nome de acordo com a linha em questão
            //System.out.println(nextLine[0]);               
            System.out.println("Nome do país " + (contador - 4) + ": " + paises[contador].getNome());
            contador++;
        }
        
        //System.out.println(paises[5].getNome()); // primeiro pais (5° linha !!)
        
        
        //while ((nextLine = reader.readNext()) != null) 
        //{
        //    System.out.println(" -- " + nextLine[0] + " ** ");
        //}
        
    }
 
       /* catch(Exception x) {
            Logger.getLogger(ProjetoFertilizante.class.getName()).log(Level.SEVERE, null, x);
        }
    }*/
}

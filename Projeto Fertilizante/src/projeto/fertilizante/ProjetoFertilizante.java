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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
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
        CSVReader reader = new CSVReader(new FileReader("/Users/leo/Downloads/arquivo csv/Metadata_Country_API_AG.CON.FERT.ZS_DS2_en_csv_v2.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
        System.out.println(nextLine[0] + nextLine[1]+nextLine[2]);
     }
        }
 
       /* catch(Exception x) {
            Logger.getLogger(ProjetoFertilizante.class.getName()).log(Level.SEVERE, null, x);
        }
    }*/
}

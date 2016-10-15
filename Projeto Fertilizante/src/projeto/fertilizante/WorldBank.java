package projeto.fertilizante;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

public class WorldBank {
    Collection<Pais> paises;
   
    public WorldBank(){
        paises = new ArrayList<>(); 
    }
    public void load()throws IOException{
        CSVReader reader = new CSVReader(new FileReader("Users/leo/Downloads/arquivo csv/addresses"));
        String[] line;
        while((line = reader.readNext()) != null){
            Pais pais = new Pais();
            pais.setNome(line[0]);
            pais.setCodigo(line[1]);
            pais.setRegiao(line[2]);
            pais.setGrupo_renda(line[3]);
            pais.setValor_consumo(Integer.parseInt(line[1]));
            paises.add(pais);      
        }
        reader.close();
       
        
    }
    public void save(File persist) throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(persist));
        System.out.println("teste save");
        if(paises != null){
            output.writeObject(paises);    
        }
    }
    public void load(File persist)throws IOException ,ClassNotFoundException{
        System.out.println("teste load");
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(persist));
        paises = (Collection) input.readObject();
    }
    @Override
    public String toString(){
        String resposta = "Null";
        if(paises != null){
            resposta = "[ ";
            for(Pais pais : paises){
                resposta = resposta.concat(pais.getCodigo() + " ");
            }
            resposta = resposta.concat("]");
        }
            return resposta;
    }
}
    
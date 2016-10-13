package projeto.fertilizante;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
    public void Load(URL url)throws IOException{
        Reader source = new InputStreamReader(url.openStream());
        CSVReader reader = new CSVReader(source, ';');
        String[] line;
        while((line = reader.readNext()) != null){
            
            Pais pais = new Pais();
            pais.setNome(line[0]);
            pais.setCodigo(line[1]);
            pais.setRegiao(line[2]);
            pais.setGrupo_renda(line[3]);
            pais.Integer.toString(setValor_consumo);
            
            paises.add(pais);      
            
        }
        reader.close();
        source.close();
        
    }
    public void save(File persist) throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(persist));
        if(paises != null)
            output.writeObject(paises);        
    }
    public void load(File persist)throws IOException ,ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(persist));
        paises = (Collection) input.readObject();
    }
    
    public String toString(){
        String resposta = "Null";
        if(paises != null){
            resposta = "[ ";
            for(Pais pais : paises){
                resposta = resposta.concat(pais.getNome() + " ");
            }
            resposta = resposta.concat("]");
        }
            return resposta;
    }
}
    
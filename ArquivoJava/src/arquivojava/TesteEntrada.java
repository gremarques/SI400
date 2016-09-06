package arquivojava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


    
    public class TesteEntrada {
        
    public static void main (String[] args) {
       String s;
       
       //Criando uma pasta 
       File file = new File("/Users/leo/Desktop/Java/Novo Diretorio");
       file.mkdir();
       
       //Criando um arquivo txt na pasta selecionada
       File arquivo = new File("/Users/leo/Desktop/Java/Novo Diretorio/Arquivo.txt");
       
        try {
            arquivo.createNewFile();      
            //Escrever algo no arquivo
            System.out.println("Digite algo no arquivo...");
            Scanner scan = new Scanner(System.in);
            s = scan.nextLine();
            
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter escrever = new BufferedWriter(fileWriter);
            escrever.write(s);
            
            escrever.close();
            fileWriter.close();
            
            //lendo um arquivo
            FileReader ler = new FileReader(arquivo); 
            BufferedReader lerb = new BufferedReader(ler);
            
            String linha = lerb.readLine();
            
            while(linha != null){
                System.out.println(linha);
                linha = lerb.readLine();
               
                
            }
            
            //File file = new File("");
        } catch (IOException ex) {
            Logger.getLogger(TesteEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
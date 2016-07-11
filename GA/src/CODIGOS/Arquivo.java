/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael Ribeiro
 */
public class Arquivo {
    
    public static int qtdLinha;
    public static String[] inf;
    
    public static void ler() throws IOException{
      try {
            File dir = new File("C:\\GA");
            File arq = new File(dir,"CONFIG.txt");
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            /*CONTA A QUANTIDADE DE LINHAS DO ARQUIVO TXT*/
            LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arq));
              linhaLeitura.skip(arq.length());
              qtdLinha = linhaLeitura.getLineNumber();
              inf = new String[(qtdLinha+1)];
            ////////////////////////////////////////////////////////////////////
            
            try {
                
                for(int i=0; i < inf.length; i++){
                    inf[i] = bufferedReader.readLine();
                } 
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
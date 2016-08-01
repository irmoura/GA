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
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael Ribeiro
 */
public class Arquivo {
    
    public static String linha;
    public static String[] linhas;
    public static String[] PSL1;//Palavras separadas linha 1
    public static String[] PSL2;//Palavras separadas linha 2
    public static String[] PSL3;//Palavras separadas linha 3
    public static String[] PSL4;//Palavras separadas linha 4
    public static String[] PSL5;//Palavras separadas linha 5
    public static String[] PSL6;//Palavras separadas linha 6
    
    public static FileWriter informacoes;
    
    public static int qtdLinha;
    
    public static void ler(String arquivo){
      try {
            File dir = new File("C:\\GA");
            File arq = new File(dir,arquivo+".txt");
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            /*CONTA A QUANTIDADE DE LINHAS DO ARQUIVO TXT*/
            LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arq));
          try {
              linhaLeitura.skip(arq.length());
          } catch (IOException ex) {
              Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
          }
              qtdLinha = linhaLeitura.getLineNumber();
              linhas = new String[(qtdLinha+1)];
            ////////////////////////////////////////////////////////////////////
            
            try {
                
                for(int i=0; i < linhas.length; i++){
                    linhas[i] = bufferedReader.readLine();
                } 
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[0];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                PSL1 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    PSL1[j] = s[j];
                }
        }
      /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[1];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                PSL2 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    PSL2[j] = s[j];
                }
        }
        /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[2];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                PSL3 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    PSL3[j] = s[j];
                }
        }
        /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[3];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                PSL4 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    PSL4[j] = s[j];
                }
        }
        /////////////////
        /*CASO USAR PARA 5 TECNICOS*/
        if(linhas.length == 7){
            for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[4];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                PSL5 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    PSL5[j] = s[j];
                }
        }
        /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[5];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                PSL6 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    PSL6[j] = s[j];
                }
        }
        }///////////
        /////////////////
        /*CASO USAR PARA 4 TECNICOS*/
        if(linhas.length == 6){
            for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[4];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                PSL5 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    PSL5[j] = s[j];
                }
        }
        /////////////////
        
        }///////////
        
      
    }
}
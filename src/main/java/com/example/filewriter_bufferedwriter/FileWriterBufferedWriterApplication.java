package com.example.filewriter_bufferedwriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class FileWriterBufferedWriterApplication {

    public static void main(String[] args) {
        //instanciando um vetor diretamente.
        String[] lines = new String [] { "Good morning" , "Good afternoon", "Good nigth"};

        String path = "c:\\temp\\in.txt";
        //caso não existir o arquivo, será criado automaticamente, desse modo vai sobrescrever
        //colocando (path,true), apenas vai adicionar ao final do arquivo.
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines) {
                //escrever a linha no arquivo
                bw.write(line);
                //quebra de linha
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}

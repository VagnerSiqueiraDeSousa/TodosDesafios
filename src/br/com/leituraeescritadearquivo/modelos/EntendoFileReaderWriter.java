package br.com.leituraeescritadearquivo.modelos;

import java.io.*;

public class EntendoFileReaderWriter {
    public EntendoFileReaderWriter() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\meuArquivo.txt");
        FileReader reader = new FileReader(file);

        int data = reader.read();
        while(data != -1){
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();

    }
}

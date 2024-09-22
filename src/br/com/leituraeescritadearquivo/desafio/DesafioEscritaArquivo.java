package br.com.leituraeescritadearquivo.desafio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DesafioEscritaArquivo {
    public static void main(String[] args) throws IOException {

        String data = "Conteúdo a ser gravado no arquivo.  atualizado.... ";

        try{
            File file = new File("C:\\Users\\vagne\\Documents\\arquivos.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            System.out.println("Dados gravado com sucesso");
            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}

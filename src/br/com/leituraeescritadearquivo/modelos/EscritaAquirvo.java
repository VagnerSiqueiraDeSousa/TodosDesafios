package br.com.leituraeescritadearquivo.modelos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaAquirvo {
    public static void main(String[] args) throws IOException {

    File file = new File("C:\\Users\\vagne\\Documents\\saida.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Olá, mundo! ");
        writer.write("{ Este arquivo foi criado para fins de didatico");
        writer.write( " Subindo no git ");
        writer.close();

    }
}

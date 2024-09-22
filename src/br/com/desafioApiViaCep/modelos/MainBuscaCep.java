package br.com.desafioApiViaCep.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBuscaCep {
    public static void main(String[] args) {

           Scanner leitura = new Scanner(System.in);
           System.out.println("Digite o CEP para Busca: ");
           var busca = leitura.nextLine();

           Gson gson = new GsonBuilder()
                   .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                   .setPrettyPrinting()
                   .create();

           String endereco = "https://viacep.com.br/ws/" + busca + "/json/";

        try{
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create(endereco))
                   .build();

           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
           System.out.println(json);

           leitura.close();
       } catch (IllegalArgumentException e){
           System.out.println("Erro: requisição invalida, verifique o endereço ");
           System.out.println(e.getMessage());
       } catch (IOException | InterruptedException e){
           System.out.println("Ocorreu um erro de requisição: tente novamente mais tarde!");
           System.out.println(e.getMessage());
       }

    }
}

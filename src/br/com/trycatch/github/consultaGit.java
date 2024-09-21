package br.com.trycatch.github;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class consultaGit {
    public static void main(String[] args){

        Scanner busca = new Scanner(System.in);
        System.out.println("Digite o nome do usuário para busca: ");
        String usuario = busca.nextLine();

        String endereco = "https://api.github.com/users/" + usuario;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado!");
            }
            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e){
            System.out.println("Ocorreu um erro durante a consulta.");
            System.out.println("Erro de API: ");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }

    }
}

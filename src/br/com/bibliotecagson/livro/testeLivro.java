package br.com.bibliotecagson.livro;

import com.google.gson.Gson;

public class testeLivro {
    public static void main(String[] args) {

        //JSON REPRESENTANDO UM LIVRO
        String json = "{\"titulo\":\"Aprendendo Java\",\"autor\": \"Hiruzen Sarutobi\"," +
                "\"editora\": { \"nome\": \"Editora Shueisha\", \"cidade\": \"Aldeia da folha\" } }";

        // Criar um objeto Gson
        Gson gson = new Gson();

        //convertendo o json em um objeto livro
        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);
    }
}

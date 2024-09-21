package br.com.bibliotecagson.modelo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class main {
    public static void main(String[] args) {

        String jsonPessoa= "{\"nome\":\"João\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Objeto " + pessoa);

    }

}

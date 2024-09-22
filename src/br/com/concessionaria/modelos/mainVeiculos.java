package br.com.concessionaria.modelos;

import com.google.gson.Gson;

public class mainVeiculos {
    public static void main(String[] args) {
        Veiculos veiculoHonda = new Veiculos("Civic", 2024, "Honda");
        Veiculos veiculoToyota = new Veiculos("Corola ", 2024, "Toyota");
        Gson gson = new Gson();
        String json = gson.toJson(veiculoHonda);
        String json1 = gson.toJson(veiculoToyota);
        System.out.println(json);
        System.out.println(json1);

    }
}

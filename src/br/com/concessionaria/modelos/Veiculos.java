package br.com.concessionaria.modelos;

public class Veiculos {
    private String modelo;
    private int ano;
    private String marca;

    public Veiculos(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }
}

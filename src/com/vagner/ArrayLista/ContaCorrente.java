package com.vagner.ArrayLista;

public class ContaCorrente {
    private String nome;
    private double saldo;
    private double depositar;
    private double sacar;

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Deposito de  " + valor + "realizado.Saldo atual: " + saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
}

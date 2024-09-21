package br.com.trycatch.modelos;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a senha");
        String senha = leitura.nextLine();

        try{
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    private static void validarSenha(String senha) {
        if(senha.length() < 8){
            throw new SenhaInvalidaException("A senha deve conter no minimo 8 caracteres");
        }
    }


}

package br.com.trycatch.modelos;

import java.util.Scanner;

public class ExeciciosDivisao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("informe o numerador");
        int numerador = leitura.nextInt();

        System.out.println("informe o denominador");
        int demoninador = leitura.nextInt();

        try{
            int resultado = numerador / demoninador;
            System.out.println("Resultado é: "+ resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: divisão por zero não permitida. " );

        }

    }
}

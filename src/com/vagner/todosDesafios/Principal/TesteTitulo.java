package com.vagner.todosDesafios.Principal;

import com.vagner.todosDesafios.Titulo.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class TesteTitulo {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new  ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));

        Collections.sort(listaTitulos);

        for(Titulo titulo: listaTitulos){
            System.out.println(titulo.getNome());
        }

    }
}

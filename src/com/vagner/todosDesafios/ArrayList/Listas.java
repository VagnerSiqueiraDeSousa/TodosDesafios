package com.vagner.todosDesafios.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

//        List<String> listaArrayList = new ArrayList<>();
//        listaArrayList.add("Elemento 1");
//        listaArrayList.add("Elemento 2");
//
//        List<String> listaLinkedList = new LinkedList<>();
//        listaLinkedList.add("Elemento A");
//        listaLinkedList.add("Elemento B");
//
//        System.out.println("ArrayList: " + listaArrayList);
//        System.out.println("LinkedList: " + listaLinkedList);
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList " + listaPolimorfica);

    }
}

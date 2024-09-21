package com.vagner.ArrayLista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List lista = new ArrayList();

        lista.add("Manoel");
        lista.add("Joaquim");
        lista.add("Maria");


        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(100);

        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(300);

        ContaCorrente c3 = new ContaCorrente();
        c3.depositar(200);

        List contas1 = new ArrayList();
        contas1.add(c1);
        contas1.add(c2);
        contas1.add(c3);
        //System.out.println(contas.size());

//        for(int i = 0; i < contas.size(); i++){
//            contas.get(i);
//        }
//        System.out.println(contas);

//        for (int i = 0; i< contas1.size(); i++){
//            ContaCorrente cc = (ContaCorrente) contas1.get(i);// uso de casting
//            System.out.println(cc.getSaldo());
//        }
//
//        List lista1 = new ArrayList();
//        lista1.add("uma String");
//        lista1.add(cc);


        List<ContaCorrente>contas = new ArrayList<ContaCorrente>();
        contas.add(c1);
        contas.add(c3);
        contas.add(c2);


        for(int i = 0; i < contas.size(); i++){
            ContaCorrente cc = contas.get(i);
            System.out.println(cc.getSaldo());
        }




    }
}

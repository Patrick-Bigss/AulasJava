package aulasJAVA.encapsulamento.principal;

import aulasJAVA.encapsulamento.modelo.ContaBancaria;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Patrick Leal");
        ContaBancaria conta2 = new ContaBancaria("Rosangela");
        ContaBancaria conta3 = new ContaBancaria("João");

        //conta1.depositar(500);
        //conta2.depositar(300);
        //conta3.depositar(2000);
        //conta2.sacar(100);

        System.out.println("a pessoa:"+ conta1.getTitular()+ "depositou:");
        conta1.depositar(500);

        System.out.println("a pessoa:"+ conta2.getTitular()+ "depositou");
        conta2.depositar(300);

        System.out.println("a pessoa:"+ conta3.getTitular()+ "depositou");
        conta3.depositar(2000);

        System.out.println("a pessoa:"+ conta2.getTitular()+ "sacou");
        conta2.sacar(100);



        //System.out.println(conta1);
        //System.out.println(conta2);
        //System.out.println(conta3);
    }

}



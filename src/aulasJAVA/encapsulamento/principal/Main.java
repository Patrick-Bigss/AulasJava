package aulasJAVA.encapsulamento.principal;

import aulasJAVA.encapsulamento.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria MinhaConta = new ContaBancaria("Patrick Leal");
        System.out.println(MinhaConta.getTitular());
    }
    ContaBancaria conta1 = new ContaBancaria("Patrick");
    ContaBancaria conta2 = new ContaBancaria("João");
    ContaBancaria conta3 = new ContaBancaria("Rosangela");


}

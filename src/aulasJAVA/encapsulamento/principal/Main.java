package aulasJAVA.encapsulamento.principal;

import aulasJAVA.encapsulamento.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria MinhaConta = new ContaBancaria("Patrick Leal",123456);
        //MinhaConta.setTitular("Felipe");
        //System.out.println(MinhaConta.getTitular());

        MinhaConta.depositar(100);
    }
}

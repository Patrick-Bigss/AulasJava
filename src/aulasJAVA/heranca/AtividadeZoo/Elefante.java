package aulasJAVA.heranca.AtividadeZoo;

public class Elefante extends Animal {
    //private String Nome;
    //private double Peso;
    //private int setorNoZoo;
    private int altura;

@Override
public void emitirSom() {
    System.out.println("O Elefante esta bufando para outro");
}

@Override
public void comer() {
    System.out.println("O Elefante esta comendo alface");
}

public void tromba(){
        System.out.println("O Elefante esta tomando banho com a tromba");
    }

    }



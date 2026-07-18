package aulasJAVA;

import aulasJAVA.objeto.Pessoa;

public class SextaAula {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome ="Patrick";
        pessoa1.anoNascimento = 1994;
        pessoa1.genero = 'M';
        pessoa1.cor = "Pardo";


        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome ="Grace";
        pessoa2.anoNascimento = 1991;
        pessoa2.genero = 'F';
        pessoa2.cor = "Branca";

        System.out.println(pessoa1);
        System.out.println(pessoa2);


    }

}

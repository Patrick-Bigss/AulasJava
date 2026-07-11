package atividade2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //stem.out.print("Qual sua nota?:\n");

        double nota1= 5.5;
        double nota2= 8.8;
        double nota3= 5.0;

        double media = (nota1 + nota2 + nota3) /3;

        System.out.println("Média=" +media);

        if (media >= 7.0) {
            System.out.println("Aprovado");

        } else if (media >= 5.0) {
            System.out.println("Em Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}



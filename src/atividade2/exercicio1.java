package atividade2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual sua idade?:\n");
        int idade = entrada.nextInt();
        ;

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade >= 16 || idade <= 17) {
            System.out.println("Voto facultativo.");

        } else if (idade >= 70) {
            System.out.println("Voto facultativo.");

        } else {
            System.out.println("Voto obrigatório." );
        }
    }
}


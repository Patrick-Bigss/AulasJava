package atividade2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    int numero = 15;


        if (numero % 2 == 0) {
            System.out.println("o número é par.");

        }else {
            System.out.println("o número é impar.");

        } if (numero > 0) {
            System.out.println("o numero é positivo.");

        } else if (numero <0 ){
            System.out.println("O número é negativo." );
        } else
            System.out.println("O número é zero." );
    }
}




package atividade4;

import java.util.Scanner;


public class exercicio2 {
    public static void desenharEscada(int degraus, char simbolo) {

        for (int i = 1; i <= degraus; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int degraus = entrada.nextInt();

        System.out.print("Digite o símbolo: ");
        char simbolo = entrada.next().charAt(0);

        desenharEscada(degraus, simbolo);

    }
}

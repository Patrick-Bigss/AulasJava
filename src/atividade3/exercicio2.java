package atividade3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");


        int numero = entrada.nextInt();
        int dobro = calcularDobro(numero);

        System.out.println("O dobro do número é: " + dobro);

    }

    public static int calcularDobro(int numero) {
        return numero * 2;
    }

}

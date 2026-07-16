package atividade3;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = entrada.nextInt();

        imprimirResultado(subtrairNumeros(x, y));

    }
    public static int subtrairNumeros(int x, int y) {
        return x - y;
    }

    public static void imprimirResultado(int resultado) {
        System.out.println("O resultado da operação é: " + resultado);
    }
}

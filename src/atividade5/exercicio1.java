package atividade5;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int resultado = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            resultado = resultado + vetor[i];
        }
        System.out.println("Valores preenchidos: "+ Arrays.toString(vetor));
        System.out.println("Soma de todos os valores digitados: "+resultado);
    }
}
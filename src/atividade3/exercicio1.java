package atividade3;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        imprimirSaudacao(nome);

    }

    public static void imprimirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo(a) à nossa aula de métodos.");

    }

}


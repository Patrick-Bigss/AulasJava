package aulasJAVA;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String [] args){
        String nome;
        int idade;
        double altura;
        String cargo;
        String periodo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        idade = entrada.nextInt();

        System.out.println("Qual sua altura?");
        altura= entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Qual seu cargo no SENAI?");
        cargo = entrada.nextLine();

        System.out.println("Qual o período que você estuda?");
        periodo = entrada.nextLine();

        System.out.print("Nome:" + nome + ", Idade:" + idade +", Altura:" + altura + ", Cargo:" + cargo +", Período:" + periodo);


    }
}

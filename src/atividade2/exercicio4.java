package atividade2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura;
        double peso;
        double IMC;

        System.out.print("Digite seu peso: ");
        peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();

        IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é: \n"+ IMC);


        if (IMC < 18.5) {
            System.out.println("Abaixo do peso.");

        } else if (IMC <= 24.9) {
            System.out.println("Peso Normal.");

        } else if (IMC <30) {
            System.out.println("Sobrepeso.");

        }else {
            System.out.println("obesidade.");

        }

    }
}

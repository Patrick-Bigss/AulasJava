package aulasJAVA;

import java.util.Scanner;

public class SegundaAula {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        int valor =scanner.nextInt();

        if(valor < 10){
            System.out.println("Menor do que 10");
        } else {
            System.out.println("Maior do que 10");
        }

        switch (valor){
            case 1:
                System.out.println("Escolheu 1");
                break;
            default:
                System.out.println("Não escolher uma das opções");
                break;
        }
    }
}

package atividade4;

import java.util.Scanner;

public class exercicio1 {
    public static void abrirCofre() {
        Scanner entrada = new Scanner(System.in);

        int codigo ;
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.print("Digite o código do cofre: ");
            codigo = entrada.nextInt();

            if (codigo == 9999) {
                System.out.println("Cofre Aberto!");
                break;
            } else {
                System.out.println("Código errado!");
                tentativas--;
            }

            if (tentativas > 0) {
                System.out.println("Código Errado. Restam " + tentativas + " tentativa(s).");
            } else {
                System.out.println("Cofre Bloqueado!");
            }
        }
    }

    public static void main(String[] args) {

        abrirCofre();

    }
    }


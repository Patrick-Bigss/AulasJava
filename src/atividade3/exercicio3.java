package atividade3;

import java.util.Scanner;

public class exercicio3 {

        public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);

                System.out.print("Digite sua idade: ");
                int idade = entrada.nextInt();

                boolean maiorIdade = verificarMaioridade(idade);

                if (maiorIdade) {
                    System.out.println("Acesso Liberado");
                } else {
                    System.out.println("Acesso Negado");
                }
            }

    public static boolean verificarMaioridade(int idade) {

        if (idade >= 18) {
            return true;
        } else {
            return false;
        }

    }
}
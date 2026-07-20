package atividade6;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MelhoriaDeTarefas {
    static ArrayList<String> tarefas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            System.out.println("Esolher uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Imprimir todas tarefas");
            System.out.println("3. Finalizar programa");
            int opcaoSwitch = entrada.nextInt();
            entrada.nextLine();

            switch (opcaoSwitch) {
                case 1:
                    System.out.print("Digite uma tarefa: ");
                    tarefas.add(entrada.nextLine());
                    break;
                case 2:
                    System.out.println("Total de tarefas registradas: " + tarefas.size());
                    Collections.sort(tarefas);

                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    break;
                case 3:
                    removerFIFO();
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção incorreta...");
                    executando = false;
                    break;
            }
        }
    }

    public static void removerFIFO(){
        tarefas.remove(0);
    }
}

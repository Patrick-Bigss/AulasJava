package atividade4;

public class CodigoCorrigido3 {

        public static void main(String[] args) {

            // (nome corrigido)
            int valor = 10;

            // (faltou o ";")
            int contador = 5;

            // Chamada do método com os dois parâmetros necessários
            exibirMensagens("Bem-Vindo ao sistema",3);

            // Laço de repetição
            while (contador > 0) {

                System.out.println("Iniciando em: " + contador);

                // evitando o loop infinito
                contador--;
            }
            System.out.println("Valor: " + valor);
        }

        public static void exibirMensagens(String texto, int repeticoes) {
            for (int i = 0; i < repeticoes; i++) {

                System.out.println(texto);
            }
        }
    }

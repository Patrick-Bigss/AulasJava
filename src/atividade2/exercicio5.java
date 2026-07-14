package atividade2;

public class exercicio5 {
    public static void main(String[] args) {

        double valorCompra = 350.00;
        double desconto = 0;
        double valorFinal;

        if (valorCompra < 100) {
            desconto = 0;
        } else if (valorCompra < 300) {
            desconto = valorCompra * 0.10;
        } else {
            desconto = valorCompra * 0.20;
        }

        valorFinal = valorCompra - desconto;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}

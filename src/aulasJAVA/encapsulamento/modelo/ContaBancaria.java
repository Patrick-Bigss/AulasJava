package aulasJAVA.encapsulamento.modelo;

public class ContaBancaria {

    //Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;

    //Construtor dessa classe
    public ContaBancaria(String titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    //é um metodo para pegar o valor dentro da instancia da classe
    public String getTitular() {
        return titular;
    }
    //
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //mudando o valor do objeto e não da classe - Só quando for estanciando (no objeto)
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor+ "foi depositado");
        } else {
            System.out.println("Erro: Valor Inválido");
        }
    }

    //metodo para sacar o valor do .saldo do objeto
    public void sacar(double valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            System.out.println(valor+" foi retirado da conta");
        }
    }
    //metodo privados também so podem ser acessados dentro da classe que foram criados
}


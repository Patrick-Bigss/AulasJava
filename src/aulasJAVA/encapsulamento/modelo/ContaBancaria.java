package aulasJAVA.encapsulamento.modelo;

public class ContaBancaria {

    //Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;
    private static int NovoNumeroDaConta  = 100020;

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\''+
                ",numeroDaConta="+ numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }

    //metodo Construtor dessa classe
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.numeroDaConta = NovoNumeroDaConta;
        NovoNumeroDaConta++;
        this.saldo= 0;
    }


    // é um metodo para pegar o valor dentro da instância da classe (no objeto)
    public String getTitular() {
        return titular;
    }

    public int getNumeroDaConta () {
        return numeroDaConta;
    }

    // é um metodo para modificar o valor dentro da instância da classe (no objeto) - setTitular
    //public String setTitular() {
        //return titular;

    // um metodo criado para modificar o valor do saldo de um objeto

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor+ ".Confirmado");
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


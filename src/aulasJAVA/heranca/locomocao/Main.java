package aulasJAVA.heranca.locomocao;

public class Main {
    public static void main(String[] args) {
        //Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Moto moto = new MotoEletrica();


        carro.NomeVeiculo = "Celtinha";
        carro.ligar();
        carro.ligarArCondicionado();

        moto.cor = "Preto";
        moto.puxarPezinho();
    }
}

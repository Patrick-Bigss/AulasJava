package aulasJAVA.heranca.AtividadeZoo;

public class Main {
    public static void main(String[] args) {
        LoboGuara lobo = new LoboGuara();
        AraraAzul arara = new AraraAzul();
        Elefante elefante = new Elefante();

    lobo.setNome("Josival");
    lobo.setPeso(4.5);
    lobo.setSetorNoZoo(2);

    arara.setNome("Cleonice");
    arara.setPeso(2.0);
    arara.setSetorNoZoo(3);

    elefante.setNome("Jorge");
    elefante.setPeso(1000);
    elefante.setSetorNoZoo(1);

        System.out.println(lobo.getNome());
        lobo.emitirSom();
        lobo.comer();
        lobo.correndo();

        System.out.println();


        System.out.println(arara.getNome());
        arara.emitirSom();
        arara.comer();
        arara.voar();

        System.out.println();


        System.out.println(elefante.getNome());
        elefante.emitirSom();
        elefante.comer();
        elefante.tromba();



    }
}

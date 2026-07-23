package aulasJAVA.heranca.AtividadeZoo;

public class LoboGuara extends Animal{
        //private String Nome;
        //private double Peso;
        //private int setorNoZoo;
        private String Cor;

@Override
public void emitirSom() {
        System.out.println("O Lobo Guará está uivando no cerrado!");
}

@Override
public void comer(){
        System.out.println("O Lobo Guará esta comendo sua carne");
}

public void correndo(){
        System.out.println("O Lobo Guará esta correndo por ai");
}

}

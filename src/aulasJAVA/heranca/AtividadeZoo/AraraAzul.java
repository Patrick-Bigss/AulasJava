package aulasJAVA.heranca.AtividadeZoo;

public class  AraraAzul extends Animal {
    //private String nome;
    //private double peso;
    //private int setorNoZoo;
    private String sexo;

@Override
public void emitirSom() {
    System.out.println("A Arara Azul esta cantando");
}
@Override
public void comer(){
    System.out.println("A Arara Azul esta comendo sementes");
    }

public void voar(){
        System.out.println("A Arara Azul esta voando");
}
}

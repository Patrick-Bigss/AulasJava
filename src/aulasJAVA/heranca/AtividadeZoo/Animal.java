package aulasJAVA.heranca.AtividadeZoo;

public class Animal {
    private String Nome;
    private double Peso;
    private int setorNoZoo;

    public void emitirSom() {
        System.out.println("O " + Nome + " está emitindo um som");
    }

    public void comer() {
        System.out.println("O " + Nome + " está comendo");

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public int getSetorNoZoo() {
        return setorNoZoo;
    }

    public void setSetorNoZoo(int setorNoZoo) {
        this.setorNoZoo = setorNoZoo;
    }
}


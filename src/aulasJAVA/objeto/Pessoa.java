package aulasJAVA.objeto;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public char genero;
    public String cor;


    @Override
    public String toString() {
        return nome+","+
                anoNascimento+","+
                genero+","+
                cor;

    }
}

package Desafio02;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando móveis");
    }

    public static void main(String[] args) {
        Gato meuGato = new Gato();

        meuGato.emitirSom();
        meuGato.arranharMoveis();
    }
}
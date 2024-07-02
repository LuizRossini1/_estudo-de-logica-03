package Desafio02;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }

    public void abanarRabo() {
        System.out.println("Abandando o rabo");
    }

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();

        meuCachorro.emitirSom();
        meuCachorro.abanarRabo();
    }
}
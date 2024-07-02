package Desafio01;

public class ModeloCarro extends Carro{
    public ModeloCarro(String marca, String modelo, int precoAno2022, int precoAno2023, int precoAno2024) {
        super(marca, modelo, precoAno2022, precoAno2023, precoAno2024);
    }

    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro("Jeep", "Wrangler",
                429990, 456992, 500000);

        meuCarro.fichaTecnica();
        meuCarro.mediaPreco();
        meuCarro.verificacaoPreco();
    }

}
/* 1 - Crie uma classe Estudo.Carro com métodos para representar um modelo específico ao longo de três anos.
Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e
calcular e exibir o menor e o maior preço.
Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir
preços e mostrar informações. */
package Estudo;

public class Carro {
    private String marca;
    private String modelo;
    private int precoAno2022;
    private int precoAno2023;
    private int precoAno2024;

    //Construtor
    public Carro(String marca, String modelo, int precoAno2022, int precoAno2023, int precoAno2024) {
        this.marca = marca;
        this.modelo = modelo;
        this.precoAno2022 = precoAno2022;
        this.precoAno2023 = precoAno2023;
        this.precoAno2024 = precoAno2024;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecoAno2022() {
        return precoAno2022;
    }

    public int getPrecoAno2023() {
        return precoAno2023;
    }

    public int getPrecoAno2024() {
        return precoAno2024;
    }

    public void fichaTecnica() {
        System.out.println("Marca: " +getMarca()+ "Modelo: " +getModelo());
        System.out.println("Media de preços: ");
    }

    public int mediaPreco() {
        int mediaPrecoAnual = (precoAno2022 + precoAno2023 + precoAno2024) / 3;
        return mediaPrecoAnual;
    }

    public void verificacaoPreco() {
        int maior;
        int menor;

        //Verificação do maior preço
        if (precoAno2022 >= precoAno2023 && precoAno2022 >= precoAno2024) {
            maior = precoAno2022;
            System.out.println(precoAno2022);
        } else if (precoAno2023 >= precoAno2022 && precoAno2023 >= precoAno2024) {
            maior = precoAno2023;
            System.out.println(precoAno2023);
        } else {
            maior = precoAno2024;
            System.out.println(precoAno2024);
        }

        //Verificação do menor preço
        if (precoAno2022 <= precoAno2023 && precoAno2022 <= precoAno2024) {
            menor = precoAno2022;
            System.out.println(precoAno2022);
        } else if (precoAno2023 <= precoAno2022 && precoAno2023 <= precoAno2024) {
            menor = precoAno2023;
            System.out.println(precoAno2023);
        } else {
            menor = precoAno2024;
            System.out.println(precoAno2024);
        }
    }
}
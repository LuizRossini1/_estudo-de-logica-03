/* 3 - Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar()
e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(),
que desconta uma tarifa mensal da conta corrente. */
package Desafio03;

public class ContaBancaria {
    //Variáveis
    private int saldo = 2100;

    //Getters
    public int getSaldo() {
        return saldo;
    }

    //Métodos
    public void depositar(int valor) {
        this.saldo += valor;
        System.out.println("Saldo atualizado: " +getSaldo());
    }

    public void sacar(int valor) {
        this.saldo -= valor;
        System.out.println("Saldo atualizado: " +getSaldo());
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " +getSaldo());
    }

    protected void diminuirSaldo(int valor) {
        this.saldo -= valor;
    }
}
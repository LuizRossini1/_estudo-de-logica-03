package Desafio03;

public class ContaCorrente extends ContaBancaria {
    //Método específico
    public void cobrarTarifa() {
        int taxa = 25;
        diminuirSaldo(taxa);
        System.out.println(getSaldo());
    }

    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();

        minhaConta.consultarSaldo();
        minhaConta.depositar(900);
        minhaConta.sacar(2000);
        minhaConta.cobrarTarifa();
    }
}
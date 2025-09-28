public class Conta {

    int agencia;
    int numero;
    String titular;
    double saldo;

    void depositar(double valor){
        saldo += valor;
    }
}


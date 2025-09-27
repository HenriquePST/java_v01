public class Main {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.agencia = 200;
        primeiraConta.numero = 100;
        primeiraConta.titular = "Pedro Henrique";

        System.out.println("o titular da primeira conta é " + primeiraConta.titular);
        System.out.println("Agencia : " + primeiraConta.agencia);
        System.out.println("Saldo : " + primeiraConta.saldo);


    }
}
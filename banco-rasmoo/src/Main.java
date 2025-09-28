public class Main {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1002;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 2000;

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(primeiraConta.titular);
    }
}
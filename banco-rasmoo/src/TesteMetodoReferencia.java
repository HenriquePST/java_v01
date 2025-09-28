public class TesteMetodoReferencia {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(500);

        primeiraConta.transferir(200, segundaConta);
        primeiraConta.transferir(200, segundaConta);

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);


    }
}

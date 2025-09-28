public class TestaMetodo {
    public static void main(String[] args) {
       Conta conta = new Conta();
        conta.depositar(300);
        conta.depositar(300);
        conta.depositar(50.40);


        System.out.println(conta.saldo);

    }
}

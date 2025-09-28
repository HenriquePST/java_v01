public class TestaMetodo {
    public static void main(String[] args) {
       Conta conta = new Conta();
        conta.depositar(300);
        conta.depositar(300);
        conta.depositar(50.40);

        boolean Saque = conta.sacar(100);
        if ( Saque){
            System.out.println("Saque com sucesso");
        } else{
            System.out.println("não foi possivel ");
        }
        System.out.println(conta.saldo) ;


    }
}

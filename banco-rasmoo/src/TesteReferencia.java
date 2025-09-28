public class TesteReferencia {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //Conta@2c7b84de

        System.out.println(primeiraConta);

        Conta segundaConta = primeiraConta;

        primeiraConta.saldo = 1000;

        System.out.println(segundaConta.saldo);

        segundaConta.saldo = 450;

        System.out.println(primeiraConta.saldo);

        if ( primeiraConta == segundaConta) {
            System.out.println("As duas variaveis apontam para ao mesmo local ");
        } else {
            System.out.println("São diferentes ");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

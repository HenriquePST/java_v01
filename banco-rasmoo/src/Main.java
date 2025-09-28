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

        /* Quando você declara atributos de uma classe, eles recebem valores padrão automaticamente:

        Tipo de dado	Valor padrão
        int, byte =	0
        double, float = 0.0
        boolean	= false
        char = \u0000
        Objetos (String, etc) =	null  */
    }
}
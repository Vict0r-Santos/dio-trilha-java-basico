import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome;
        int numero;
        String agencia;
        double saldo;

        System.out.println("Por favor, digite seu nome completo !");
        nome = sc.next();

        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o codigo da Agência !");
        agencia = sc.next();

        System.out.println("Por favor, digite quanto deseja depositar !");
        saldo = sc.nextDouble();

        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        // System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nome, agencia, numero, saldo);



        sc.close();
    }
}

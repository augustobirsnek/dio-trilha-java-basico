import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;
 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        numero = teclado.nextInt();
        
        System.out.println("Por favor, digite o número da Agencia:");
        agencia = teclado.next();
        
        System.out.println("Por favor, digite o seu nome:");
        nome = teclado.next();
        
        System.out.println("Por favor, digite o saldo:");
        saldo = teclado.nextDouble();
        
        teclado.close();
        
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        
    }
}
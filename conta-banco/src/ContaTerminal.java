import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        String nomeCliente = "Daiana Odorizzi";
        double saldoConta = 237.48;

        System.out.println("Por favor, digite o o número da sua conta!");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o o número da sua agencia!");
        Double agenciaConta = scanner.nextDouble();
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta +", conta " + numeroConta +" e seu saldo " + saldoConta +" já está disponível para saque");
        scanner.close();

        
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        Integer accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o nome da agência: ");
        String branchName = scanner.next();
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String clientName = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        Double accountBalance = scanner.nextDouble();

        String message = String.format(
                "\nOlá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo é %.2f já está disponível para saque",
                clientName, branchName, accountNumber, accountBalance);

        System.out.println(message);

        scanner.close();
    }
}

import java.util.Scanner;

public class BankDemoTest {
    
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount to deposit: ");
        account.Deposit(input.nextDouble());
        System.out.println(account.getBalance());

        System.out.println("Enter amount to withdraw: ");
        double withdrawalAmt = input.nextDouble();
        try {
            account.CheckWithdraw(withdrawalAmt);
            account.Withdraw(withdrawalAmt);
            System.out.println("The balance after withdraw is: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}

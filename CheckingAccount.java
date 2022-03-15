import java.io.*;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount) { 
        super("Sorry but your account is short by: $" + amount);
        this.amount = amount;
    }
    public double getAmount() { return amount; }
}

public class CheckingAccount{

    protected double balance;
    protected double accountNo;

    public CheckingAccount()
    {
        balance = 0;
        accountNo = 1;
    }

    public void Deposit( double depositAmt)
    {
        balance += depositAmt;
    }

    public void Withdraw(double withdrawAmt)
    {
        balance -= withdrawAmt;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getNumber()
    {
        return accountNo;
    }

    public boolean CheckWithdraw(double amount) throws InsufficientFundsException
    {
        if(amount > balance) throw new InsufficientFundsException(amount - balance);
        return true;
    }
}

import java.util.*;

public class Account2 
{
    private String name;
    private double balance;

    public Account2(String name, double initialBalance)
    {
        this.name = name;
        this.balance = initialBalance;
    }
    public static void main(String[] args) 
    {
        Account2 account1 = new Account2("account1", 150.00);
        Account2 account2 = new Account2("account2", 500.53);

        display(account1.balance);
        display(account2.balance);

        debit(account1.balance);
        display(account1.balance);
        display(account2.balance);

        debit(account2.balance);
        display(account1.balance);
        display(account2.balance);


    }
    public String getName(String name)
    {
        return name;
    }

    static void debit(double balance)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter withdrawal amount for account1: ");
            double withdrawAmount = input.nextDouble();

        if (withdrawAmount > balance)
        {
            System.out.println("Debit amount exceeded account balance.");
        }
        
        else
        {
            balance -= withdrawAmount;
            System.out.println("Subtracting "+withdrawAmount+" from account balance");
        }
        input.close();
    }

    static void display(double balance)
    {
        System.out.println("account1 balance: "+balance);
        System.out.println("account2 balance: "+balance);
    }
}

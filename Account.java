import java.util.*;

public class Account 
{
    private String name;
    private double balance;
    
    static Scanner input = new Scanner(System.in);

    //Constructor
    public Account(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    //Getters and Setters
    public String getName()
    {
        return name;
    }

    public double getBalance()
    {   
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    //Methods
    void displayBalance()
    {
        System.out.printf("%s balance: $%.2f\n", getName(), getBalance());
    }

    void debit(double balance)
    {
        System.out.printf("\nEnter withdrawal amount for %s: ", getName());
            double withdrawAmount = input.nextDouble();
        
        System.out.println("\nSubtracting "+withdrawAmount+" from "+getName()+" balance.");
        if (withdrawAmount > balance)
        {
            System.out.println("Debit amount exceeded account balance."); 
        }
        else
        {
            balance -= withdrawAmount;
            setBalance(balance);
        }
    }
}
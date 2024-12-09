public class AccountRun 
{

    //Main Method
    public static void main(String[] args) 
    {
        //Instantiate Objects, Values Based on Sample Output
        Account account1 = new Account("account1", 150.00);
        Account account2 = new Account("account2", 500.53);

        account1.displayBalance();
        account2.displayBalance();

        account1.debit(account1.getBalance());

        account1.displayBalance();
        account2.displayBalance();

        account2.debit(account2.getBalance());

        account1.displayBalance();
        account2.displayBalance();
    }

}

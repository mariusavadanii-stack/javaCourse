package D;

public class BankAccount {

        /*incapsulated properties and restricted manipulation access*/
        /*properties proivate -> public methods to modify those properties -> changing the state of the object*/
        /*application consistency*/
    private String name;
    private String accountId;
    private double balance =0;

    public BankAccount(String name, String accountId) {
        this.name = name;
        this.accountId = accountId;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("we have successfully deposited $" + amount + ". The balance is now " + balance);
    }
    public void withdraw(double amount) {
        if (balance - amount <= 0) {
            System.out.println("can't withdraw that amount. Your balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("we have successfully withdraw $: " + amount + ". the balance is now" + balance);
        }
    }
    public void showState() {
            System.out.println("the account with ID " + accountId + " belonging to the customer " + name + "has balance of $" + balance);
        }


}/*class end*/

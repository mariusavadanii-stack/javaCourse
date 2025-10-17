package E;

public class Account {

    private String name;
    private String accountId;
    private double balance =0;

    public Account(String name, String accountId) {
        this.name = name;
        this.accountId = accountId;
    }

    public void deposit(double amount) {
        balance +=amount;
        System.out.println("we have sccussfully deposited $" + amount + ".The balance is now " + balance);
    }
    public void withdraw(double amount){
        if(balance-amount <=0){

        }else {
            balance -= amount;
            System.out.println("we have successfully withdrawn $" + amount + ".The balance is now" + balance);
        }

    }

    public void showState() {
        System.out.println("the account with ID " + accountId + " belonging to the customer " + name + "has balance of $" + balance);
    }




}/*end class*/

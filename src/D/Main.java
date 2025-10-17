package D;

public class Main {

static void main(String[] args) {

        BankAccount firstAccount = new BankAccount("John Smith", "123abd");
        firstAccount.showState();
        firstAccount.withdraw(500);
        firstAccount.deposit(2000);
        firstAccount.showState();
        firstAccount.withdraw(500);


}
}

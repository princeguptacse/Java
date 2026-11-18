class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }


    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }


    void displayDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

   
        BankAccount b1 = new BankAccount(101, "Rahul", 5000);
        BankAccount b2 = new BankAccount(102, "Priya", 8000);

       
        System.out.println("----- Account 1 -----");
        b1.deposit(2000);
        b1.withdraw(1000);
        b1.checkBalance();
        b1.displayDetails();

       
        System.out.println("\n----- Account 2 -----");
        b2.deposit(3000);
        b2.withdraw(2000);
        b2.checkBalance();
        b2.displayDetails();
    }
}
package oops;

// Encapsulation Example
class BankAccount {

    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance = balance + amount;
            System.out.println("Amount Deposited : "+ amount);
            System.out.println("Balance : "+ balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw : "+amount);
        } else {
            System.out.println("Invalid amount or Insufficient Balance");
        }
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456);
        bankAccount.deposit(-100);
        bankAccount.withdraw(20);

        bankAccount.deposit(200);
        bankAccount.withdraw(50);

        System.out.println("Balance : "+bankAccount.getBalance());
    }
}

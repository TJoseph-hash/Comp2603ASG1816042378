package org.example;

public class BankAccount {
    private final String AccountNumber;
    private double Balance;
    private final String DateOpened;

    public BankAccount(String AccountNumber, double Balance, String DateOpened) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.DateOpened = DateOpened;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public String getDateOpened() {
        return DateOpened;
    }

    public void deposit(double Amount) {
        if (Amount > 0.00) {
            this.Balance += Amount;
        }
    }


    public boolean withdraw(double Amount) {
        double balance_ = getBalance();
        if (Amount > 0.00) {
            balance_ -= Amount;
            System.out.println("Withdraw Successful");
            return true;
        }
        System.out.println("Withdraw Failed: insufficient funds");
        return false;
    }

    public boolean equals(BankAccount account ) {
        return getAccountNumber().equals(account.getAccountNumber());
    }

    public String toString() { return "Account Number : " + getAccountNumber() + "  Account Balance : " + getBalance() + "  Opened : " + getDateOpened();}
}


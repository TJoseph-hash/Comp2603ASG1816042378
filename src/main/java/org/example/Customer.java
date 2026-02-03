package org.example;

public class Customer {
    private String customerId;
    private String customerName;
    private String customerEmail;
    private BankAccount bankAccount;

    public CustomerInfo(String customerId, String cusName, String email) {
        this.customerId = customerId;
        this.customerName = cusName;
        this.customerEmail = email;
        this.bankAccount = null;
    }

    public CustomerInfo(String customerId, String cusName, String email, BankAccount bankAccount) {
        this.customerId = customerId;
        this.customerName = cusName;
        this.customerEmail = email;
        this.bankAccount = bankAccount;

    }

    public String getCustomerId(){
        return customerId;
    }

    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public BankAccount getBankAccount(){
        return bankAccount;
    }

    public void setAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    public boolean hasAccount(BankAccount bankAccount) {
        return getBankAccount().hasAccount(bankAccount.getAccountNumber());
    }

}

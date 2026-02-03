package org.example;

    public class Customer {
    private  final String customerId;
    private final String customerName;
    private  final String customerEmail;
    private BankAccount bankAccount;

    public Customer(String customerId, String cusName, String email) {
        this.customerId = customerId;
        this.customerName = cusName;
        this.customerEmail = email;
        this.bankAccount = null;
    }

    public  Customer(String customerId, String cusName, String email, BankAccount bankAccount) {
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

    public boolean hasAccount() {return getBankAccount() != null ;}

    public double getTotalBalance(Customer bankAccount){
        if(bankAccount.hasAccount()){
            return getBankAccount().getBalance();
        }
         return 0.00;
    }
    public String toString(){
        return "|Customer Name: " + getCustomerName() + " | CustomerId: " + getCustomerId() + " | Customer Email: " + getCustomerEmail();
    }
}

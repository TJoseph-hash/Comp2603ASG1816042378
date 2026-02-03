package org.example;

public class BankDriver {
    public static void main (){
     //Create BankAccount objects
         BankAccount account1 = new BankAccount("ACC001",1000.00, "10/24/2014");
         BankAccount account2 = new BankAccount("ACC002",5000.00,"9/12/2020");
         BankAccount account3 = new BankAccount("ACC003",10000.00,"12/10/2021");

        // Create Customer objects
        Customer customer1 = new Customer("C001", "Alice Smith", "alice@email.com");
        Customer customer2 = new Customer("C002", "Bob Johnson", "bob@email.com", account2);

        // Assign account to customer1
        customer1.setAccount(account1);

        // Check if customers have accounts
        System.out.println("Customer 1 has account: " + customer1.hasAccount());
        System.out.println("Customer 2 has account: " + customer2.hasAccount());

        // Demonstrate deposit operations
        System.out.println("\n--- Deposit Operations ---");
        System.out.println("Account 1 balance before deposit: " + account1.getBalance());
        account1.deposit(250.00);
        System.out.println("Account 1 balance after depositing $250: " + account1.getBalance());

        // Demonstrate withdrawal operations
        System.out.println("\n--- Withdrawal Operations ---");
        System.out.println("Account 2 balance before withdrawal: " + account2.getBalance());
        account2.withdraw(150.00);
        System.out.println("Account 2 balance after withdrawing $150: " + account2.getBalance());

        // Test equals method
        System.out.println("\n--- Testing equals Method ---");
        System.out.println("account1 equals account2: " + account1.equals(account2));
        System.out.println("account1 equals account3: " + account1.equals(account3));

        // Print details using toString
        System.out.println("\n--- Customer and Account Details ---");
        System.out.println(customer1);
        System.out.println(customer2);
    }
}

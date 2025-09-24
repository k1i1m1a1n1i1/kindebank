package com.kindebank.accounts;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String id, double balance) {
        super(id, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " | New Balance: " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -100) { // overdraft limit -100
            balance -= amount;
            System.out.println("Withdrew " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Insufficient funds.");
        }
    }
}


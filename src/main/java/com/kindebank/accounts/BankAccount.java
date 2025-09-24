package com.kindebank.accounts;

public abstract class BankAccount {
    protected String id;
    protected double balance;

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public String getAccountType() {
        return this.getClass().getSimpleName();
    }
}


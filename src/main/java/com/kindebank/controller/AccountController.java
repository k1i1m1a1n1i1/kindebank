package com.kindebank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class AccountController {

    private List<Account> accounts = new ArrayList<>();

    public AccountController() {
        accounts.add(new Account(1, "John Doe", 500.0));
        accounts.add(new Account(2, "Jane Smith", 1200.0));
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accounts;
    }

    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable int id) {
        return accounts.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    static class Account {
        private int id;
        private String name;
        private double balance;

        public Account(int id, String name, double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getBalance() { return balance; }
    }
}

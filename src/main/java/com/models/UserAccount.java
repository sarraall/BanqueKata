package com.models;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class UserAccount {
    private String userName;
    private int accountNumber;
    private BigDecimal balance;
    private Currency currency;
    private List<Operation> operations;

    public UserAccount(){
        operations = new ArrayList<>();
        balance = new BigDecimal(0);
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}

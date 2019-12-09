package com.models;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String userName;
    private int accountNumber;
    private BigDecimal balance;
    private List<Operation> operations;

    public UserAccount(){
        operations = new ArrayList<>();
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

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}

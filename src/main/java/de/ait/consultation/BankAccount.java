package de.ait.consultation;

import java.io.Serializable;

public class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    private String accountNumber;
    private double balance;
    private String holderName;
    private transient int pinCode;

    public BankAccount(String accountNumber, double balance, String holderName, int pinCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
        this.pinCode = pinCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", balance=" + balance + ", holderName=" + holderName + ", pinCode=" + pinCode + '}';
    }
}

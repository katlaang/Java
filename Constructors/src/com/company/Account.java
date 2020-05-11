package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.awt.image.PackedColorModel;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //create constructors

    public Account(){
        //calling another constructor within a constructor. We can call this a default values constructor
        this("56789", 2.50, "Default name", "Default address","Default phone");
        System.out.println("Empty constructor called");
    }
    public Account(String accountNumber, double balance, String customerName, String customerEmail,String customerPhoneNumber ){
        System.out.println("Account constructor with parameters called");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //We can create a third constructor (use Intellij code--> generate -->constructors)


    public Account(String customerName, String customerEmail, String customerPhoneNumber) { // this constructor still calls the major constructor where all the initialization has been done
        this("9999", 100.55, customerName, customerEmail, customerPhoneNumber);

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposited amount: " + depositAmount + ". New balance: " + this.balance);
    }
    public void withdrawal ( double withdrawalAmount){
       if( this.balance - withdrawalAmount <0) {
           System.out.println("Current account balance is: "+this.balance + ". Request not processed");
       }
       else {
           this.balance -= withdrawalAmount;
           System.out.println("Amount withdrawn: " + withdrawalAmount + " processed. Remaining balance: " + this.balance);
       }
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

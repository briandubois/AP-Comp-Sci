package me.briandubois;

public class BankAccount1 {
    private double Balance; //instance variables, instance fields

    //constructors

    public BankAccount1() {
        Balance = 0;
    }

    public BankAccount1(double a) {
        Balance = a;
    }

    //methods

    //getter
    public double getBalance() {
        return Balance;
    }

    //setter
    public void Deposit(double a) {
        Balance += a;
    }

    //setter
    public void Withdrawal(double a) {
        Balance -= a;
    }
}
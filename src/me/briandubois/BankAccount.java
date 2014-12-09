package me.briandubois;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount1 a1 = new BankAccount1();
        BankAccount1 a2 = new BankAccount1(100);

        a1.Deposit(35);
        a2.Withdrawal(40);

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}
package com.christycatlin.day3;

class InsufficientFundException extends Exception{
    public InsufficientFundException(String message){
        System.out.println(message);
    }
    public InsufficientFundException(){
        System.out.println("Insufficient Funds");

    }
}
class BankAccount{
    private int balance = 0;
    private int accountNumber;
    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount Credited: "+ amount + " New Balance: "+balance);
    }

    public void withdraw (int amount) throws InsufficientFundException {
        if (amount <= balance){
            balance-=amount;
            System.out.println("Amount Debited: "+ amount + " New Balance: "+balance);
        }else{
            throw new InsufficientFundException();
        }
    }
    public int getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
}

public class Demo20 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456);
        System.out.println(account.getBalance());
        account.deposit(5000);
        try {
            account.withdraw(20000);
            //if error occurs here it stops and won't run
            // the rest when using throw in method
            // but the rest of the program continues
            // when using the try catch surround
        } catch (InsufficientFundException e) {
            e.printStackTrace();
        }
        account.deposit(1000);
        try {
            account.withdraw(1000);
        } catch (InsufficientFundException e) {
            e.printStackTrace();
        }
    }
}

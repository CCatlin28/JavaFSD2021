package com.christycatlin.day2;

class Bank{
    public int getRateofInterest(){
        return 0;
    }
}

class BankA extends Bank{

    public int getRateofInterest() {
        return 7;
    }
}

class BankB extends Bank{

    public int getRateofInterest() {
        return 8;
    }
}

class BankC extends Bank{
    @Override // helpful notation not necisary for functionality
    public int getRateofInterest(){
        return 8;
    }
}
public class Demo10 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB= new BankB();

        System.out.println(bankA.getRateofInterest());
        System.out.println(bankB.getRateofInterest());
    }
}

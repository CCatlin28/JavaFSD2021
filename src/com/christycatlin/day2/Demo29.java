package com.christycatlin.day2;

class Company{
    public void test1(){
        System.out.println("test 1");
    }
    private void test2(){
        System.out.println("test 2");
    }
    protected void test3(){
        System.out.println("test 3");
    }
    void test4(){
        System.out.println("test 4");
    }
}

class subCompany extends Company{
    public void test5(){

    }

}
public class Demo29 {
    public static void main(String[] args) {
        Company company = new Company();
        company.test1();
        company.test3();
        company.test4();

        subCompany subCompany = new subCompany();
        subCompany.test1();
        subCompany.test3();
        subCompany.test4();
        subCompany.test5();

        //only within company is there access to test2 as it is private
    }
}

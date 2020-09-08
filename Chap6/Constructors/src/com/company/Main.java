package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount myAccount = new BankAccount("12345", 0.00, "Bob Brown",
//                "myemail@bob.com", "123456789");
//
//        System.out.println(myAccount.getAccountNumber());
//        System.out.println(myAccount.getBalance());
//
//        myAccount.withdrawal(100.0);
//
//        myAccount.deposit(50.0);
//        myAccount.withdrawal(100.0);
//
//        myAccount.deposit(51.0);
//        myAccount.withdrawal(100.0);

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(customer3.getName());

    }
}

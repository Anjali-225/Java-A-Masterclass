package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Nedbank");

        if (bank.addBranch("Rivonia")){
            System.out.println("Rivonia branch created");
        }

	    bank.addBranch("Rivonia");
	    bank.addCustomer("Rivonia", "Tim", 174.34);
        bank.addCustomer("Rivonia", "Mike", 50.50);
        bank.addCustomer("Rivonia", "Percy", 220.12);

        bank.addBranch("Secunda");
        bank.addCustomer("Secunda", "Bob", 15.12);

        bank.addCustomerTransaction("Rivonia", "Tim", 44.22);
        bank.addCustomerTransaction("Rivonia", "Tim", 12.44);
        bank.addCustomerTransaction("Rivonia", "Mike", 1.65);

        bank.listCustomers("Rivonia", true);
        bank.listCustomers("Secunda", true);

        bank.addBranch("Woodmead");

        if (!bank.addCustomer("Woodmead", "Brown", 5.33)){
            System.out.println("Error branch does not exist");
        }

        if (!bank.addBranch("Rivonia")){
            System.out.println("Rivonia branch already exists");
        }

        if (!bank.addCustomerTransaction("Rivonia", "Fergus", 52.33)){
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Rivonia", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}

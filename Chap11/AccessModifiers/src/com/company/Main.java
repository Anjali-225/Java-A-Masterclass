package com.company;

public class Main {

    public static void main(String[] args) {
	    Account anjisAccount = new Account("Anji");
	    anjisAccount.deposit(1000);
	    anjisAccount.withdraw(500);
	    anjisAccount.withdraw(-200);
	    anjisAccount.deposit(-20);
	    anjisAccount.calculateBalance();
//	    anjisAccount.balance = 5000;

        System.out.println("Balance on account is " + anjisAccount.getBalance());
//        anjisAccount.transactions.add(4500);
        anjisAccount.calculateBalance();
    }
}

package com.company;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Not very good in that, can I go for a swim instead?");
    }
}

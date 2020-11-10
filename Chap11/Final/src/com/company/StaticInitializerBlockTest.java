package com.company;

public class StaticInitializerBlockTest {
    public static final String owner;

    static {
        owner = "anjali";
        System.out.println("SIBTest static initialization block called");
    }

    public StaticInitializerBlockTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}

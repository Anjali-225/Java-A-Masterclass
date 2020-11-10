package com.company._static;

public class StaticTest {
    private static int numInstance = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstance++;
    }

    public String getName() {
        return name;
    }

    public static int getNumInstance() {
        return numInstance;
    }
}

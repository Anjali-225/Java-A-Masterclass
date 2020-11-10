package com.company._static;

public class Password {
    private static final int key = 123456789;
    private final int encyptedPassword;

    public Password(int password) {
        this.encyptedPassword = encyptedDecrypt(password);
    }

    private int encyptedDecrypt(int password){
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving Password as " + this.encyptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encyptedDecrypt(password) == this.encyptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you can't come in");
            return false;
        }
    }
}

package com.company._static;

public class Main {

    public static void main(String[] args) {
	    SomeClass one = new SomeClass("one");
	    SomeClass two = new SomeClass("two");
	    SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4;
        System.out.println(Math.PI);
//        Math m = new Math(); // won't work because it is already marked as private
        // prevents instances of it being created

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(234546);
        password.letMeIn(674312);
    }
}

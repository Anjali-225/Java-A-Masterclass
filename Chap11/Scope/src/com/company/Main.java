package com.company;

public class Main {

    public static void main(String[] args) {
	    String varFour = "this is private to main()";

	    ScopeCheck scopeInstance = new ScopeCheck();
	    scopeInstance.useInner();

	    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("var3 is not accessible here " + innerClass.var3); // won't work because var3 is private
//        System.out.println("scopeInstance var1 is " + scopeInstance.getVar1());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//        System.out.println("********************************************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }
}

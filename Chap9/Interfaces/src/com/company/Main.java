package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone anjisPhone;
	    anjisPhone = new DeskPhone((123456));
	    anjisPhone.powerOn();
	    anjisPhone.callPhone(123456);
	    anjisPhone.answer();
    }
}

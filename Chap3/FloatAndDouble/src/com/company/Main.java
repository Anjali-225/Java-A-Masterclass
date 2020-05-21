package com.company;

public class Main {

    public static void main(String[] args) {
        //Video 28
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value  = " + myMinFloatValue);
        System.out.println("Float maximum value  = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value  = " + myMinDoubleValue);
        System.out.println("Double maximum value  = " + myMaxDoubleValue);

//        int myIntValue = 5;
//        //float myFloatValue = 5f;
//        //double myDoubleValue = 5d;
//        float myFloatValue = (float) 5.25;
//        double myDoubleValue = 5.25;

        //Video 29
        int myIntValue = 5 / 3;
        //float myFloatValue = (float) 5.25;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);

        //v29 Challenge
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds *0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

    }
}

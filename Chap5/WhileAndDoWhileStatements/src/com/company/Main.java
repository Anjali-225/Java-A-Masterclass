package com.company;

public class Main {

    public static void main(String[] args) {
        //video 67

//	    int count = 0;
//	    while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("************************");
//
//	    for(count =1; count != 6; count++){
//            System.out.println("Count value is " + count);
//        }
//
//        System.out.println("************************");

//	    count = 1;
//	    while(true){
//	        if (count == 6 ){
//	            break;
//            }
//            System.out.println("Count value is " + count);
//	        count++;
//        }
//
//        System.out.println("************************");

//	    do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

//        System.out.println(isEvenNumber(54));
//        System.out.println(isEvenNumber(23));

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count == 7) {
                break;
            }
        }
        System.out.println("Total even numbers found: " + count);

    }

    public static boolean isEvenNumber(int number){
        if ((number % 2) == 0){
            return true;
        } else {
            return false;
        }

    }
}

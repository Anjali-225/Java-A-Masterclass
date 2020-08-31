public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,99,34));
        System.out.println(hasTeen(13,17,33));

        System.out.println(isTeen(9));
        System.out.println(isTeen(12));
        System.out.println(isTeen(25));
        System.out.println(isTeen(19));


    }

    public static boolean hasTeen (int num1, int num2, int num3) {

        if (((num1 >= 13) && (num1 <= 19)) || ((num2 >= 13) && (num2 <= 19)) || ((num3 >= 13) && (num3 <= 19))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int age) {
        if ((age >= 13) && (age <= 19)) {
            return true;
        } else {
            return false;
        }

    }

}

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces (double decimal1, double decimal2) {

        if ( ((decimal1 - decimal2) >= 0.0009) || ((decimal2 - decimal1) >= 0.0009)) {
            return false;
        } else {
            return true;
        }
    }
}

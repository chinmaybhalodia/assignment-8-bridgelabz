public class MinMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Min-Max program.");

        // testing UC3 for TC1 - TC3
        System.out.println(getMaxString("str", "str-str", "str-str-str"));
        System.out.println(getMaxString("str-str-str", "str-str", "str"));
        System.out.println(getMaxString("str", "str-str-str", "str-str"));
    }

    // UC1: method compare 3 integers
    public static int getMaxInt(int a, int b, int c) {
        return a > (b > c ? b : c) ? a : (b > c ? b : c);
    }

    // UC2: method to compare 3 double
    public static double getMaxDouble(double a, double b, double c) {
        return a > (b > c ? b : c) ? a : (b > c ? b : c);
    }

    // UC3: method to compare 3 Strings
    public static String getMaxString(String a, String b, String c) {
        return a.length() > (b.length() > c.length() ? b.length() : c.length()) ? a : (b.length() > c.length() ? b : c);
    }
}
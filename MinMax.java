public class MinMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Min-Max program.");

        // testing UC2 for TC1 - TC3
        System.out.println(getMaxDouble(8.6, 5.2, 4.3));
        System.out.println(getMaxDouble(5.3, 6.9, 7.1));
        System.out.println(getMaxDouble(1.5, 4.3, 2.8));
    }

    // UC1: method compare 3 integers
    public static int getMaxInt(int a, int b, int c) {
        return a > (b > c ? b : c) ? a : (b > c ? b : c);
    }

    // UC2: method to compare 3 double
    public static double getMaxDouble(double a, double b, double c) {
        return a > (b > c ? b : c) ? a : (b > c ? b : c);
    }
}
public class MinMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Min-Max program.");

        // testing UC1 for TC1 - TC3
        System.out.println(getMaxInt(8, 7, 6));
        System.out.println(getMaxInt(5, 6, 7));
        System.out.println(getMaxInt(1, 4, 2));
    }

    // UC1: method compare 3 integers
    public static int getMaxInt(int a, int b, int c) {
        return a > (b > c ? b : c) ? a : (b > c ? b : c);
    }
}
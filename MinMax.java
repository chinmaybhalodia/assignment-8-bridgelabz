public class MinMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Min-Max program.");

        // checking UC4 for different data types
        System.out.println(getMax(8, 5, 4));
        System.out.println(getMax(5.3, 6.9, 7.1));
        System.out.println(getMax("str", "str-str-str", "str-str"));
    }

    // UC4: method to compare 3 objects using generics
    public static <T extends Comparable<T>> T getMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
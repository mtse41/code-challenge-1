package code.challenge.divide;

public class MathUtil2 {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0 ? true : false;
    }
}

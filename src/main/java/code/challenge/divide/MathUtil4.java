package code.challenge.divide;

public class MathUtil4 {
    public static boolean isDivisible(long n, long x, long y) {
        if (x > n || y > n) {
            return false;
        }

        if (n % x == 0 && n % y == 0) {
            return true;
        } else
            return false;
    }
}

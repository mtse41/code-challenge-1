package code.challenge.divide;

public class MathUtil1 {
    public static boolean isDivisible(long n, long x, long y) {
        if (((n % x) == 0) && ((n % y) == 0)) {
            return true;
        } else {
            return false;
        }
    }
}


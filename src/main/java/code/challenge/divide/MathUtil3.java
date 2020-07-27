package code.challenge.divide;

import java.util.Arrays;

public class MathUtil3 {
    public static Boolean isDivisible(long n, long x, long y) {
        return Arrays.asList(x, y).stream().allMatch(i -> n % i == 0);
    }
}

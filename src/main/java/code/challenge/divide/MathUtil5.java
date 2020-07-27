package code.challenge.divide;

@FunctionalInterface
interface ICalculatorService {
    boolean divide(long n, long x, long y);
}

public class MathUtil5 {
    private static final ICalculatorService calculatorService = (long n, long x, long y) -> (n % x) == 0 && (n % y) == 0;

    public static Boolean isDivisible(long n, long x, long y) {
        return calculatorService.divide(12, 4, 3);
    }

    public static Boolean isDivisble(ICalculatorService service, long n, long x, long y) {
        return service.divide(n, x, y);
    }
}

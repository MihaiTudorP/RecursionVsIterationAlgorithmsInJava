package basicmath;

public class FactorialCalculator {

    public static long calculateFactorialIteratively(int n) {
        if (n == 0 || n == 1) { return 1; }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static long calculateFactorialRecursively(int n) {
        return n == 0 || n== 1 ? 1 : n * calculateFactorialRecursively(n - 1);
    }

    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            n =0;
        }

        System.out.printf("Factorial of %d calculated iteratively is %d%n", n, calculateFactorialIteratively(n));
        System.out.printf("Factorial of %d calculated recursively is %d%n", n, calculateFactorialRecursively(n));
    }
}

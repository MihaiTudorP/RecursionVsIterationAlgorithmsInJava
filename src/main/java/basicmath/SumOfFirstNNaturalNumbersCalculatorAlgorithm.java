package basicmath;

public class SumOfFirstNNaturalNumbersCalculatorAlgorithm {

    public static int sumNumbersIteratively(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int sumNumbersRecursively(int n) {
        int sum = 0;

        if (n == 0) {
            return sum;
        }

        return n == 1 ? 1 : n + sumNumbersRecursively(n - 1);
    }

    public static int sumNumbersFormula(int n) {
        return n * (n+1) / 2;
    }

    public static void main(String[] args) {
        int n;
        if (args.length < 1) { n = 0; }
        else {
            try{
            n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + args[0]);
                return;
            }
        }
        System.out.printf("Sum calculated iteratively: %d%n",
                sumNumbersIteratively(n));
        System.out.printf("Sum calculated recursively: %d%n",
                sumNumbersRecursively(n));
        System.out.printf("Sum calculated with formula: %d%n",
                sumNumbersFormula(n));


    }
}

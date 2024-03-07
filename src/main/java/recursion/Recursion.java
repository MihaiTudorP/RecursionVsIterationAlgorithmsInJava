package recursion;

public class Recursion {
    public void head(int n) {
        //base case
        if (n == 0) return;

        // call method recurively
        head(n - 1);

        // do operations
        System.out.println(n);
    }

    public void tail(int n) {
        //base case
        if (n == 0) return;

        // do operations
        System.out.println(n);

        // call method recurively
        tail(n - 1);
    }


    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException|ArrayIndexOutOfBoundsException e) {
            n = 0;
        }
        Recursion r = new Recursion();
        System.out.println("Head recursion:");
        r.head(n);
        System.out.println("Tail recursion:");
        r.tail(n);
    }
}

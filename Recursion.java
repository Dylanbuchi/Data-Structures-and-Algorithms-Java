package app;

/**
 * Recursion
 */
public class Recursion {

    public static void main(String[] args) {

        System.out.println(firstFactorial(7));

        System.out.println(recursiveFirstFactorial(7));

    }

    // iterative way to do it
    public static int firstFactorial(int num) {
        int total = 1;

        // 0 factorial is 1
        if (num == 0) {
            return 1;
        }

        for (int i = 1; i <= num; i++) {
            total *= i;

        }

        return total;

    }

    // Recursive way to do it
    public static int recursiveFirstFactorial(int num) {

        // 0 factorial is 1
        if (num == 0) {
            return 1;
        }

        return num * recursiveFirstFactorial(num - 1);

    }
}
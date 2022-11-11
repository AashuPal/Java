package Recursion;

public class PrintPattern {
    /*
     * *
     * **
     * ***
     * ****
     * *****
     */
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        if (n == 0) {
            return;
        }
        printPattern(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

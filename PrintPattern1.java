package Recursion;

public class PrintPattern1 {
    /*
     * *****
     * ****
     * ***
     * **
     * *
     */
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printPattern(n - 1);
    }
}

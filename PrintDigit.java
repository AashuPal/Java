package Recursion;

public class PrintDigit {
    public static void main(String[] args) {
        printDigit(12345);
    }

    public static void printDigit(int n) {
        if (n == 0) {
            return;
        }
        printDigit(n / 10);
        System.out.println(n % 10);
    }
}

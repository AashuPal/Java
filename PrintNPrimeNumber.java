package Recursion;

public class PrintNPrimeNumber {
    public static void main(String[] args) {
        printNPrimeNumber(1, 500);
    }

    public static void printNPrimeNumber(int n, int limit) {
        if (n > limit) {
            return;
        }
        if (isPrime(n)) {
            System.out.println(n);
        }
        printNPrimeNumber(n + 1, limit);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        return isPrime(n, n / 2);
    }

    public static boolean isPrime(int n, int i) {
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i - 1);
    }
}

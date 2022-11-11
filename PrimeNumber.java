package Recursion;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
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

package Recursion;

public class PrintNArmstrongNumber {
    public static void main(String[] args) {
        printNArmstrongNumber(1, 1000);
    }

    public static void printNArmstrongNumber(int n, int limit) {
        if (n > limit) {
            return;
        }
        if (isArmstrong(n)) {
            System.out.println(n);
        }
        printNArmstrongNumber(n + 1, limit);
    }

    public static boolean isArmstrong(int n) {
        if (n == 0) {
            return false;
        }
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit * lastDigit * lastDigit;
            temp /= 10;
        }
        return sum == n;
    }
}

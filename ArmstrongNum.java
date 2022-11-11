package Recursion;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
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

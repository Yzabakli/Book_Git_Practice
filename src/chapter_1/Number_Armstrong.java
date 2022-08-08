package chapter_1;

public class Number_Armstrong {

    /*
    Write a method that can check if a number is Armstrong number
     */

    public static void main(String[] args) {

        System.out.println(isArmStrongNumber(132));
    }
    public static boolean isArmStrongNumber(int num) {
        int a, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return c == b;
    }

}

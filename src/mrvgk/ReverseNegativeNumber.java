package mrvgk;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-285));
        System.out.println(reverse(-641));
        System.out.println(reverse(-36));
    }

    public static int reverse(int n) {
       int result = 0;
       while (n != 0) {
           result = result * 10 + n % 10;
           n /= 10;
       }
       return result;
    }



}

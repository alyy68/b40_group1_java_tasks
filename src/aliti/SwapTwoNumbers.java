package aliti;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("Before a = " + a);
        System.out.println("Before b = " + b);
        b = 5 + 3; // b = 8
        a = b - a; // a = 3
        b = b - a; // b = 5

        System.out.println("After a = " + a);
        System.out.println("After b = " + b);
    }
}

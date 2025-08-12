package merveB;

public class Task3_swapTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; // a becomes sum of a and b
        b = a - b; // b becomes original a
        a = a - b; // a becomes original b

        System.out.println("After swap:  a = " + a + ", b = " + b);
    }
}

//Swap two variables' values without using a third variable
package mrvgk;

public class task03_swapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);


    }
}
//Swap two variables' values without using a third variable
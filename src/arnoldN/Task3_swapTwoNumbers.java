package arnoldN;

public class Task3_swapTwoNumbers {
    public static void main(String[] args) {


        //Swap two variables' values without using a third variable


        swapValues(8,9);



    }
    public static void swapValues(int num1, int num2){
        System.out.println("Before swap");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println();
        System.out.println("After swap");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

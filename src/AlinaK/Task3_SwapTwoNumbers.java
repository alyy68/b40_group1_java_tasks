package AlinaK;

public class Task3_SwapTwoNumbers {
    public static void main(String[] args) {
         //Swap two variables' values without using a third variable

        int num1=5;
        int num2=10;

        System.out.println("num1 before swaз = " + num1);
        System.out.println("num2 before swap = " + num2);


        num1=num1+num2; // 5+10=15
        num2=num1-num2; // 15-10=5
        num1=num1-num2; //15-5=10

        System.out.println("num1 after swap = " + num1);
        System.out.println("num2 after swap = " + num2);








    }
}

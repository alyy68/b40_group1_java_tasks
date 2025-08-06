package AlinaK;

public class Odd_Or_Even_Task {
    public static void main(String[] args) {
        oddOrEven(10);
    }


    public static void oddOrEven (int number){
        if (number%2!=0){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }
    }
}

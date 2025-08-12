package AlinaK;

public class Task1_OddOrEven {
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

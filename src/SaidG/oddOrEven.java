package SaidG;

public class oddOrEven {

    public static void main(String[] args) {


        int a = 8;
        oddOrEven(a);

    }

    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }
}

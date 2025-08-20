package aliti;

public class OddOrEven {
    public static void main(String[] args) {
        //Write a method which can identifies given number is even or odd
        System.out.println(oddOrEven(8));
    }

    public static String oddOrEven(int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }


}
package mrvgk;

public class reverseNegativeNum {

    public static int reverseNegative(int num) {
       if (num >= 0) {
           System.out.println("Enter a negative number");
           return num;
       }
       int n =-num;
       int reversed = 0;
       while (n > 0) {
           int digit = n % 10;
           reversed = reversed * 10 + digit;
           n = n / 10;
       }
       return -reversed;
    }
    public static void main(String[] args) {
        int input = -35;
        int output = reverseNegative(input);
        System.out.println("input" + input);
        System.out.println("output" + output);

    }

}

/*
   * ReverseNegativeNumber
   * Write a return method that can reverse digits of a negative number and return it as int
   * input: -35  output: -53
 */
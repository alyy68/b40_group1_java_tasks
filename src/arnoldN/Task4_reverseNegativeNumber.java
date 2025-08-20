package arnoldN;

public class Task4_reverseNegativeNumber {

    // reverseNegativeNumber
    // Write a return method that can reverse digits of a negative number and return it as int
    // input: -35  output: -53

    public static void main(String[] args) {
        reverseNegativeNumber(-932);
        reverseNegativeNumber(-123456789);
        reverseNegativeNumber(-22);
        reverseNegativeNumber(32);

    }

    public static void reverseNegativeNumber(int number) {
        if (number >= 0) {
            System.out.println("The number is not negative: " + number);
        } else {
            StringBuilder sbNumber = new StringBuilder();
            sbNumber.append(Math.abs(number));
            sbNumber.reverse();
            int reversedNumber = -Integer.parseInt(sbNumber.toString());
            System.out.println("Input number: " + number);
            System.out.println("Reversed number: " + reversedNumber);
        }

    }

}

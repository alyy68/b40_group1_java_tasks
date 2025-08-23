package aliti;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {

        System.out.println(reverseNumbers(539));
        System.out.println(reverseNumbers(-539));
        System.out.println(reverseNumbers(-53));
        System.out.println(reverseNumbers(53));
        System.out.println(reverseNumbers(0));
        System.out.println(reverseNumbers(-3));
        System.out.println(reverseNumbers(3));
    }

    /*
    public static int reverseNumbers(int number) {

        if (number < 0 && number > -10) {
            return number;
        } else if (number < 0) {
            int firstDigit = number % 10;
            number = number / 10;
            int result = firstDigit * 10 + number;
            return result;
        } else {
            return number;
        }

    }

     */

    public static int reverseNumbers(int number) {
        int result = 0;
        if (number < 0) {
            while (number != 0) {
                int digit = number % 10;
                number /= 10;
                result = result * 10 + digit;
            }
            return result;
        } else {
            return number;
        }
    }
}

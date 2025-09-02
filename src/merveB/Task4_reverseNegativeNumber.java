package merveB;

public class Task4_reverseNegativeNumber {

    public static void main(String[] args) {
        int input = -35;
        int output = reverseNegativeNumber(input);
        System.out.println("input: " + input + "  output: " + output);
    }

    public static int reverseNegativeNumber(int number) {
        int n = Math.abs(number);   // remove the minus sign
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;          // take the last digit
            reversed = reversed * 10 + digit;  // build the reversed number
            n = n / 10;                  // remove the last digit
        }

        return -reversed; // add negative sign back
    }
}



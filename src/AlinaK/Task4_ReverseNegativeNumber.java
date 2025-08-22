package AlinaK;

public class Task4_ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumbers(-35));
        System.out.println(reverseNumbers(-345));
        System.out.println(reverseNumbers(-7));
        System.out.println(reverseNumbers(-856));

    }


    /*  public static int  reversedNegativeNumber(int  num){
        int result=0;

        if (num>0){
            System.out.println("number must be negative");
        }

        if(num<0){
            int digit =0;
            digit=num%10;
            num=num/10;
            result=10*digit+num;
        }
        return result;
    }*/


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
package AlinaK;

public class Task4_ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reversedNegativeNumber(-35));

    }


    public static int  reversedNegativeNumber(int  num){
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
    }
}
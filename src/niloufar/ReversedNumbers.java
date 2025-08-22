package niloufar;

public class ReversedNumbers {
    public static void main(String[] args) {
        System.out.println(revNums(-987));
        System.out.println(revNums(-45783));
        System.out.println(revNums(-703));
        System.out.println(revNums(-23));

    }

    public static int revNums (int num){

        if (num > 0){
            System.out.println("Number can't be positive");
        }
        int a = Math.abs(num);
        int result =0 ;
        while (a !=0){
            int digit = a % 10;
            a = a /10;
            result = result *10 + digit;
        }
        return -result;

    }
}

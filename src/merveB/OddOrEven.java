package merveB;

public class OddOrEven {

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        identify(5); // 5 is Odd
        identify(6); // 6 is Even
    }
}
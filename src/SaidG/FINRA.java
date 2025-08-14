package SaidG;

public class FINRA {
    public static void main(String[] args) {

        int x = 15;

        boolean by3 = x % 3 == 0;
        boolean by5 = x % 5 == 0;

        if (by3 && by5) {
            System.out.println("FINRA");
        } else if (by3) {
            System.out.println("FIN");
        } else if (by5) {
            System.out.println("RA");
        } else {
            System.out.println(x);
        }


    }
}

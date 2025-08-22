package niloufar;

public class T2_Finra {


    public static void main(String[] args) {
        FINRA();
    }

    public static void FINRA() {
        for (int i = 0; i < 31 ; i++) {
            if (i % 3 ==0 && i % 5 ==0) {
                System.out.println("FINRA");
            }else if (i % 3 == 0){
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else{
                System.out.println("Number is not multiple by 3 or 5: " + i);
        }
        }

    }
}

package weekly_tasks_from_david;

public class oddOrEven {
    public static void main(String[] args) {
        //Write a method which can identifies given number is even or odd
        EvenOrOdd(198);
        EvenOrOdd(171);



    }

    public static void EvenOrOdd (int a){
        if(a% 2 == 0){
            System.out.println(a + " is an even number");

        }else
            System.out.println(a + " is an odd number");

    }
}
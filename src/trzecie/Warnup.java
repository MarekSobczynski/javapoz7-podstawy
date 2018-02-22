package trzecie;

import java.util.Scanner;

public class Warnup {
    public static void main(String[] args) {
        //zad 1
        // wczytac liczbe
        //zapytac n razy o liczbe
        //podzielna przez 2,3,6 i poinformowac

        //zad 2
        //zdefiniowac n nie musi byc od
        //pobierac n liczb podać czy liczba jest wieksza mniejsza od poprzedniej

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number n ");
        int n = scanner.nextInt();

        for (int i=0 ; i<n ; i++ ){
            System.out.println("insert next number");
            int number = scanner.nextInt();
            if (number % 6 == 0){
                System.out.println(" Value i divvisible by 6");
            } else if (number % 3 == 0){
                System.out.println("Your number is ... 3");
            } else if ( number % 2 == 0 ){
                System.out.println(" Your number is ... 2");
            }else{
                System.out.println("value is not divisble by 6, 3, or 2");
            }


        }

        int previousValue = 0;
        for (int i=0 ; i<n ; i++){

            System.out.println("add next value ");
            int value = scanner.nextInt();
            if(value > previousValue){
                System.out.println("new value is bigger than previous one");
            } else if (value == previousValue){
                System.out.println("value is equall");
            }else{
                System.out.println("new value is smaller than previous");
            }

            previousValue = value;




        }
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            if ( i % 2 == 0 && i % 3 != 0){
               // sum = sum + 1;
                sum += i;

            }
        }
        System.out.println("sum = " + sum);

        int factorial = 1;
        for (int i = 1; i<n ; i++ ){
            factorial*=i;
        }
        System.out.println("");




    }
}

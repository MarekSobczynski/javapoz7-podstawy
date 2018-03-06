package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        int n = scanner2.nextInt();

        for (int i = 0 ; i<n ; i++){
            System.out.println(i);
        }
        for (int i = 0 ; i<n ; i++){
            System.out.println( (i + 1) * 2 ); //kolejne liczby 2,4,6,8...
        }
        for (int i = 1 ; i <= 2* n ; i+=2){
            System.out.println(i);

        }
        for (int i = 0 ; i<n ; i++){
            if (i % 2 ==0)
            System.out.println(i);
        }
        for (int i = 0 ; i<n ; i++){
            System.out.println(i+1); }

        for (int i = 0 ; i<n ; i++){
        }

        //1. wyswietlic kolejnych n liczb * 2 (2, 4, 6, 8)
        for (int i = 0; i < n; i++) {
            System.out.println(2 * (i + 1));
        }

        for (int i = 0; i < 2 * n; i+=2) {
            System.out.println(i + 2);
        }

        for (int i = 2; i <= 2 * n; i+=2) {
            System.out.println(i);
        }

        //2. wyswietlic tylko parzyste liczby od 1 do n
        System.out.println();
        System.out.println("Parzystosc liczb");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + 2);
            }
        }

        System.out.println();

        for (int i = 1; i <= n + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        for (int i = 2; i <= n; i+=2) {
            System.out.println(i);
        }

        //3. wyswietlic tylko liczby podzielne przez 3 do n
        System.out.println();
        System.out.println("Podzielne przez 3");
        for (int i = 0 ; i < n ; i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
        //4. wyswielic n liter "a"
        for (int i = 0 ; i < n ; i++) {
            System.out.print("a ");
        }
        System.out.println();
        //5. wyswietlic kwadraty kolejnych liczb
        for (int i = 0; i < n; i++) {
            System.out.println(i * i);
        }
        //*. obliczyc kolejne sumy n liczb (1 + 2 + 3 + 4 + ..
        for ( int i = 0 ; i < n ; i++){
            System.out.println(i + i++);
        }




    }

    private static void forLoopExample() {
        System.out.println("hello world");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();

        for (int i = 0 ; i<n ; i++) {            // i = i + np1
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {

                System.out.println((i + 1) + ". pow" + number + " = " + (number * number));
            } else {
                System.out.println("number no supported. upgrade to full version");
            }

            System.out.println("end of program");
        }
    }
}

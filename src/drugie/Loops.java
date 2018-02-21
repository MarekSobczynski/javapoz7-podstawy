package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
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

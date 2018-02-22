package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        whilem(scanner);
        //wczytujemy liczby tak długo az nie bedzie podzilna przez 15

        int number = 1;
        while (number % 15 !=0) {
            number = scanner.nextInt();
            }
        System.out.println("number" + number);



        // az ktos nie poda 0
        boolean result = true;
        int sum = 0;
        while (result){
            int value = scanner.nextInt();
            sum += value;     //sum=sum+value 0+0(ilosc razy )
            if(value == 0){
                result = false;
            }
            System.out.println("sum = "+ sum);
        }


    }

    private static void whilem(Scanner scanner) {
        int sum = 10;
        int tmp = 0;
        int i = 0;
        while (tmp < sum){
            int value = scanner.nextInt();
            i++;
            tmp += value;
        }
        System.out.println("inserted" + i +" number" );
    }
}

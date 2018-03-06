import java.util.Scanner;

public class warmup3 {
    public static void main(String[] args) {
        //napisac petle ktora odwraca liczby 12345 -> 54321 1200 bedzie 21 pomnizoyc 10

        int number = 12345;
        int reversedNumber = 0;
        while(number != 0){
            int digit = number % 10;
            reversedNumber *= 10;
            reversedNumber += digit;
            number /= 10;

            }
        System.out.println("reversed number = " + reversedNumber);

        //wczytujemy n liczb, i sumujemy cyfry 123, 456 -> 1+2+3+4+5+6 (for i while)
        int n = 4;
        int sum = 0;
        for( int i = 0 ; i <  n ; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Instert number");
            int value = scanner.nextInt();
            //sumowanie
            while (value != 0){
                int digit = value % 10;
                sum += digit;
                value /= 10;

            }
            System.out.println(" sum = " + sum);
        }
        //pozbyc sie zer
        int numberWithZeros = 12002;
        int numberWithoutZeros = 0;
        int multiplier = 1;
        while (numberWithZeros != 0 ){
           int digit = numberWithZeros % 10;
            if(digit != 0 ){
                numberWithoutZeros += digit * multiplier;
                multiplier *=10;
            }
            numberWithZeros /= 10; // redukowanie liczby dzielac przez 10

        }
        System.out.println("Number without zeros = " + numberWithoutZeros);

    }
}

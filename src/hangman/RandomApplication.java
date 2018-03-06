package hangman;

import java.util.Random;
import java.util.Scanner;

public class RandomApplication {
    public static void main(String[] args) {

        evenNumber();


        randomArrayFromUser();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        int[] array = randomArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "." + array[i]);
        }


        Scanner scanner = new Scanner(System.in);


    }


    // nowa tablica n elementowa złozona z losowych liczb
    public static int[] randomArray() {
        int n = 10;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    //nowa tablica o wielkosci zdefiniwanej przez usera elementowa złozona z losowych liczb
    //z zakresu podanego przez usera

    public static void randomArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("specify size");
        int size = scanner.nextInt();
        System.out.println("specify Bound");
        int bound = scanner.nextInt();
        System.out.println("Specify offset");
        int offset = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[size];                          //tworzy randowmowe liczby
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(bound) + offset;
            array[i] = number;

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }


}


    // napisac jeszcze raz generowanie liczb

    public static void sum(){
        int[] array = randomArray();
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }


        // suma losowych elemenów
        // metoda symulujaca rzut kostka do gry
    // wygenerowac 10 losowych liczb parzystych z zakresu 0-10 czyli od zer do 5 * 2 5włacznie czyli i = 6

    public static void evenNumber(){
        int n = 10;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i <array.length  ; i++) {
            array[i] = random.nextInt((n/2)+1)*2;

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Random even number from 0 to 10 = " + array[i]);

        }




    }
    
}

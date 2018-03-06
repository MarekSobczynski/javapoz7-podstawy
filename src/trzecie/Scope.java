package trzecie;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Scope {                          //zakresy zmiennych
    public static void main(String[] args) {
        int n = 25;
        char a = (char)97;
        for(int i=0 ; i<= n ; i++){
            a += i;
            System.out.print( (char)(a + i) );
        }
        //bedzie pokazywac male litery ktore sa odzwierciedleniem z tablicy

        for (int i = 97 ; i <= 122; i++) {
            System.out.println((char) i);

        }



//TABLICA


       String message = "Hello World";
        char[] messageAsCharArray = message.toCharArray();
        int length = messageAsCharArray.length;
        System.out.println(messageAsCharArray[0]);
        System.out.println(messageAsCharArray[1]);
        System.out.println(messageAsCharArray[2]);
        System.out.println(messageAsCharArray[3]);
        System.out.println(messageAsCharArray[4]);


        int[] array = {1,2,3,4,5,6};    //elementy w tablicy
        int size = 10;
        int [] emptyArray = new int [10];
        int [] emptyArray2 = new int[size];
        array[6]=3;
        for (int i = 0 ; i < array.length; i++){
            System.out.println(array [i]);
        }

        String[] names = {"Jan", "Anna", "Marek"};
        for (int i = 0 ; i < names.length; i++){
            System.out.println(names[i]);
        }
        //zdefiniowac tablice z liczbami i obliczyc sume
        int [] arrays = {1,2,3,4,5,6};
        int sum = 0;
        for(int i=0 ; i < arrays.length;i++){
            sum += arrays[i];
        }
        System.out.println(sum);


        //                                 obliczyc srednia

        //                                 obliczyc max i min
        int min = array[0];
        int max = array[0];

        for(int i = 0 ; i< array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
            System.out.println("min = " + min);
            System.out.println("max = " + max);

        }

        //                                 zliczyc ilosc elementow do wystąpienia liczby ujemnej
        int[] arrayWithVAlue = {1,4,6,7,-4,2};
        int counter = 0;
        int y = 0;
        while( counter < arrayWithVAlue.length && arrayWithVAlue[counter] >= 0 ){
            counter++;
        }
        System.out.println("counter of positive numbers =" + counter);


        // podwoic wartosci w tablicy
        int[] arrayToBeDoubled = {1,2,3,4,5,6};
        for (int i = 0; i <arrayToBeDoubled.length ; i++) {
            arrayToBeDoubled[i] *= 2 ;
        }
        System.out.println(Arrays.toString(arrayToBeDoubled));

        //
        //utworzyc tablice n elementów z kolejnych liczb (np 4 1,2,3,4)

        int[] newArray = new int [4];
        for (int i = 0; i < newArray.length ; i++) {
            newArray[i] = i + 1;

        }
        System.out.println(Arrays.toString(newArray));

        //utworzyc tablice n elementów z tylko  parzystych liczb np 4 2,4,6,8

        int [] arrayOfEvenNUmbers = new int[n];
        for (int i = 0; i < arrayOfEvenNUmbers.length ; i++) {
            arrayOfEvenNUmbers[i] = (1+1)*2;

        }
        System.out.println(Arrays.toString(arrayOfEvenNUmbers));


        //zapytac usera o rozmiar i utworzyc tablice z liczbami np. 5 5,4,3,2,1

        int size2 = 5;
        int[] descendingNumber = new int[size2];
        for (int i = 0; i < size ; i++) {
            descendingNumber[i] = descendingNumber.length - i;

        }
        System.out.println(Arrays.toString(descendingNumber));

        //zapyatc usera o rozmiar i umożliwic mu wstawienie elementów i obliczyc średnia
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert sieze of array");
        int sizeOfUsers = scanner.nextInt();
        int[] userArray = new int [sizeOfUsers];
        int sumOfUSerArray = 0;
        for (int i = 0; i < userArray.length ; i++) {
            System.out.println("insert next Value");
            userArray[i] = scanner.nextInt();
            sumOfUSerArray += userArray[i];

        }
        System.out.println("Avg = "+ ((double)sumOfUSerArray / userArray.length));


        //mamy posortowana tablice rosnąco. ile jest elementow mniejszych od liczby
        int serchingNumber = 6;
        int[] sortedArray = {1,3,5,6,7,8,9};
        int counterForSerching = 0;
        while(counterForSerching < sortedArray.length && sortedArray[counterForSerching] != serchingNumber){
            counterForSerching++;
        }
        System.out.println("we have" + counterForSerching + "number smailer than" + serchingNumber);








 //       char znak = 'a';

// zamiana na kod binarny
        int number = 21;
        int multiplier = 1;
        int binaryCode = 0;

        while ( number != 0){
            int bit = number % 2;
            binaryCode += bit * multiplier;
            multiplier *= 10;
            number /= 2;


        }
        System.out.println("binaryCode = " + binaryCode);

        //kodowanie i odkodowanie szyfru cezara!!!

        int offset = 1;
        String secretMessage = "ala ma kotZa z";
        String expectedMessage = "bmb nb lpuAb a";
        //String jest to tablica znaków

        char[] chars = secretMessage.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
       //     if (chars[i] == 32);
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'z') ){
                //sprawdzenie czy litera z nie wyszła poz zakres z tabli jakis krzak
                if ((chars [i] + offset) > 'Z' && (chars [i] + offset)< 'a'){
                    chars[i] =(char) (chars[i]- 26 + offset);
                }else if ((chars [i] + offset) > 'z') {
                    chars[i] =(char) (chars[i]- 26 + offset);
                }else {
                    chars[i] += offset;
                }
            }

        }
        System.out.println(" expected = "+ expectedMessage);
        System.out.println("Actual" + String.valueOf(chars));
        System.out.println("Correct = " + expectedMessage.equals(String.valueOf(chars)));


        //odkodowanie



        //tablica liczb. definiujemy liczbe 3 tworzymy 2 tablice z elemantami

        int[] numbers = {1,2,3,4,6,7,8};
        int serchingNumber2 = 4;

        int i = 0;
        while(i < numbers.length && numbers[i] != serchingNumber) {
            i++;

        }
        if (i < numbers.length){
           int[] smallerNumberArray = new int[i+1];
           int[] biggerNumberArray = new int [numbers.length - (i+1)];

            for (int j = 0; j < smallerNumberArray.length ; j++) {
                smallerNumberArray[j] = numbers[j];
            }
            for (int j = 0; j <biggerNumberArray.length ; j++) {
                biggerNumberArray[j] = numbers[j + i + 1 ];
            }


            System.out.println(Arrays.toString(smallerNumberArray));
            System.out.println(Arrays.toString(biggerNumberArray)); //na nazwie alt+enter
        }else{
            System.out.println("number"  );
        }


//        for (int i = 0; i < numbers.length ; i++) {
//
//        }

        int[] smallerNubersArray;
        int[] biggerNubersArray;




        //int number = 1500000000; // około 2miliardy
        // System.out.println(" max value = " + Long.MAX_VALUE);
       // System.out.println(" min value = " + Long.MIN_VALUE );
    }
}

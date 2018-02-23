package trzecie;

import java.util.Scanner;

public class whilleloop {
    public static void main(String[] args) {
        //1 podajemy tak dlugo AZ NIE ZOSTANIE PODANE 0 wpisujemy najwieksza liczbe dzielimy przez 10 redukujemy ilosc cyfr
        //2 dzielimy przez 10 redukujemy ilosc cyfr sprawdzanie ilosci cyfr
        //3 suma cyfr liczby
        //4 program liczący ilosc zadnej cyfry w liczbie
        //5 wypisac dzielniki liczby
        //6 sprawdzanie czy liczba jest pierwsza
        //7 menu
        Scanner scanner = new Scanner(System.in);

        //1
        boolean result = true;
        int maxValue = 0;
        int valuen = 1;
        while (result) {
            int value = scanner.nextInt();
            if (value == 0) {
                result = false;
            }
            if (valuen > maxValue) {
                maxValue = valuen;
            }
            System.out.println("maxVAlue = " + maxValue);

            //2  rdukcja licz i liczni ilosci uzytyc nalzy dzilic przez 10
            int n = 1576525983;
            int numberOfDigit = 0;
            if (n == 0) {
                numberOfDigit++;
            }
            while (n != 0) {
                numberOfDigit++;
                //n = n/10;
                n /= 10;

            }
            System.out.println("number of digits" + numberOfDigit);

            //3
            int n1 = scanner.nextInt();
            int sum = 0;
            while (n1 != 0) {
                sum += n1 % 10;
                n1 /= 10;
            }
            System.out.println("sum of digits = " + sum);

            //4 ilosc zadanj cyfry w liczbi w przykladzi jst liczba 2
            int b = scanner.nextInt();
            int serchForNumber = 2;
            int counter = 0;
            while (b != 0) {
                int nextNumber = b % 10;
                if (nextNumber == serchForNumber) {
                    counter++;
                }
                b /= 10;

            }
            System.out.println(" serch number  =" + counter);

            //5 dzielniki jaka jst liczba dzilnikow
            int numberToGetDividers = 8;
            for (int i = 0; i <= numberToGetDividers / 2; i++) {
                if (numberToGetDividers % i == 0) {
                    System.out.println("Divider" + i);
                }
            }

            //6 czy liczba jest pierwsza
            int primaryNumberCAndidate = 13;
            int i = 2;
            boolean isPrimary = true;
            while (isPrimary && i <= primaryNumberCAndidate / 2) {
                if (primaryNumberCAndidate % i == 0) {
                    isPrimary = false;
                }
                i++;

            }
            if (isPrimary == true) {
                System.out.println("Number is Primary");
            } else {
                System.out.println("Number is not primary");
            }

            //menu




        }

    }
}

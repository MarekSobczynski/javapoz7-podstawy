package szóste;


import piąte.Methods;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Methods2 {
    public static void main(String[] args) {
        int[] aaray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Factorial of 6 = " + facorial(6));
        System.out.println("divisible by 2 and not for 3 = " + countDivisibleBy2andNot3(aaray));
        System.out.println("Switched text = " + switchChars("ala ma kota", 'a', 'b'));
        System.out.println("\"123\" is number " + sisNumber("123"));
        System.out.println("\"2a3\" is number " + sisNumber("2a3"));
        System.out.println("1kajak1 is palindrom = " + isPalindromen("1kajak1"));
        System.out.println("anna is palindrom = " + isPalindromen("anna"));
        System.out.println("kabcdef is palindrom = " + isPalindromen("abcedef"));
        System.out.println("a;b;c 0 = + " + getNthIndexOf(';', "a;b;c", 0));
        System.out.println("a;b;c 1 = + " + getNthIndexOf(';', "a;b;c", 1));
        System.out.println("a;b;c 2 = + " + getNthIndexOf(';', "a;b;c", 2));
        System.out.println("a;b;c 5 = + " + getNthIndexOf(';', "a;b;c", 5));
        System.out.println("Ala ma Kota - split = " + Arrays.toString(split("Ala ma kota", ' ')));
        System.out.println("Ab;cd;ef - split = " + Arrays.toString(split("Ab;cd;ef", ';')));
        System.out.println("Ab;;cd;ef - split = " + Arrays.toString(split("Ab;;cd;ef", ';')));
        System.out.println("Ala ma Kota - spli2t = " + Arrays.toString(split("Ala ma kota", ' ')));
        System.out.println("Ab;cd;ef - split2 = " + Arrays.toString(split("Ab;cd;ef", ';')));
        System.out.println("Ab;;cd;ef; - split2 = " + Arrays.toString(split("Ab;;cd;ef;", ';')));
        System.out.println("fibonacii of 15 = " + fibonaciNumber(15));
        System.out.println("fibonacii of 8 = " + fibonaciNumber(8));
        System.out.println("fibonacii of 6 = " + fibonaciNumber(6));
        System.out.println("fiboncci array (8) = " + Arrays.toString(fibonacciArray(8)));
        System.out.println("reverse of abcdef = " + reverse("abcdef") );
        System.out.println("reverse of abcdefg = " + reverse("abcdefg") );
        System.out.println("(a+m)" + isValidStatment("(a+b())"));
        System.out.println("reversed array {1,2,3,4,5,6} = " + Arrays.toString(reversArray(new int[]{1,2,3,4,5,6}))); //new int odwolanie do nowej
        System.out.println("tree of height 5 = \n" + tree(5) );
        System.out.println("copare 123 , 55  =  " + compare("123", "55"));
        System.out.println("copare 123 , 155 = " + compare("123", "155"));
        System.out.println("copare 123 , 123 =  " + compare("123", "123"));
        System.out.println("Primary numbers of 67 = " + primaryNumbersOf(67));
        System.out.println("Primary numbers of 59 = " + primaryNumbersOf(59));
        System.out.println("Primary numbers of 46 = " + primaryNumbersOf(46));
        System.out.println("Primary numbers of 23 = " + primaryNumbersOf(23));



    }
    //silnia (factorial) -> long

    public static long facorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    //zliczanie liczb podzielnych przez 2, ale nie podzielnych przez 3

    public static int countDivisibleBy2andNot3(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                counter++;
            }

        }
        return counter;

    }

    //zmiana jednego znaku na drugi w danym stringu

    public static String switchChars(String text, char from, char to) {
        char[] textAsChars = text.toCharArray();
        for (int i = 0; i < textAsChars.length; i++) {
            if (textAsChars[i] == from) {
                textAsChars[i] = to;
            }

        }
        return String.valueOf(textAsChars);

    }

    //sprawdzenie czy string jest liczba

    public static boolean sisNumber(String numberCandidate) {
        char[] chars = numberCandidate.toCharArray();
        int i = 0;
        while (i < chars.length && (chars[i] >= '0' && chars[i] <= '9')) {
            i++;
        }
        return i == chars.length; //zwraca prawde i fasłsz
    }

    // czy text jest palindromem np. kajak = true, anna = true abc = false

    public static boolean isPalindromen(String text) {
        char[] textAsChars = text.toCharArray();
        int i = 0;
        while (i < textAsChars.length / 2 && (textAsChars[i] == textAsChars[textAsChars.length - i - 1])) {
            i++;
        }
        return i == textAsChars.length / 2;        //zwraca true or false


//        for (int i = 0; i < textAsChars.length / 2 ; i++) {
//            if (textAsChars [i] == textAsChars[textAsChars.length - i - 1]){
//                result = false;
//            }
//        }
//        return result;

    }


    //nowa metoda zamieniajaca znaki z malych ma duze i odwrotnie

//    public static String switchCase (String text){
//       char[] chars =  text.toCharArray();
//        for (int i = 0; i < chars.length ; i++) {
//            chars [i] = switchCase(chars.[i]);
//
//            }
//            return String.valueOf(chars);


    public static char switchcase(char c) {
        char switchedChar = c;
        if (c >= 'a' && c <= 'Z') {
            switchedChar -= 32;
        } else if (c >= 'A' && c <= 'Z') {
            switchedChar += 32;
        }
        return switchedChar;

    }

    //split -> 123;abc;dd-> ["123", "abc", "dd"}
    //          dd;ac;cc -> {"dd", "ac", "cc"}


    public static String[] split(String message, char c) {
        int size = Methods.lettersCounter(message, c) + 1; //rozmiar tablicy
        String[] resultArray = new String[size];
        String textToPut = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != c) {
                textToPut += message.charAt(i);
                if (i == message.length() - 1) {
                    resultArray[j] = textToPut;
                }
            } else {
                resultArray[j] = textToPut;
                j++;
                textToPut = "";
            }

        }
        return resultArray;
    }


    public static String[] split2(String message, char c) {
        int size = Methods.lettersCounter(message, c) + 1;
        String[] resultArray = new String[size];
        int start = 0;
        int end;
        for (int i = 0; i < resultArray.length; i++) {
            String textToPut = " ";
            end = getNthIndexOf(c, message, (i + 1));
            for (int j = start; j < end; j++) {
                textToPut += message.charAt(j);
            }

            resultArray[i] = textToPut;
            start = end + 1;
        }
        return resultArray;

    }

    public static int getNthIndexOf(char c, String text, int index) {
        char[] chars = text.toCharArray();
        int i = -1;
        while (i < chars.length && index > 0) {
            i++;
            if (i < chars.length && c == chars[i]) {
                index--;
            }
        }
        return i;
    }


    //fibonacci

    public static int fibonaciNumber(int n) {
        if (n <= 0) return n;
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;

    }


    public static int[] fibonacciArray(int toIndex) {
        int[] array = new int[toIndex];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    //odwracanie stringa test->tset abcde->edcba


    public static String reverse (String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length/2  ; i++) {
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return String.valueOf(array);
    }


    //sprawdzanie nawiasów w stringu

    public static boolean isValidStatment (String statment){
        char[] array = statment.toCharArray();
        int counter=0;
        int i = 0;
        while ( i < array.length && counter >= 0){
            if(array[i]== '('){
                counter++;
            }else if (array[i] == ')'){
                counter--;
            }

            i++;
        }
        return counter == 0;

    }

    //metoda zwracajaca nowa tablice która jest odwrócona

    public static int[] reversArray (int[] array ){
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            reverseArray[i] = array[array.length - 1 - i];

        }
        return reverseArray;
    }
    //drzewko


    public static String tree (int height){
        StringBuilder treeBuilder = new StringBuilder();
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j <height - 1 - i ; j++) {
                treeBuilder.append( " ");
            }
            for (int j = 0; j <2*i + 1 ; j++) {
                treeBuilder.append("*"); // dopisanie
            }
            treeBuilder.append("\n"); //\n nowa linia po wykonaniu petli
        }
        return treeBuilder.toString();
    }

    //metoda do porównania dwóch stringów które są liczbami

    public static int compare ( String text1, String text2){
        int result =0;
        if(text1.length() > text2.length()){
            result = 1;
        }else if(text1.length() < text2.length() ){
            result = -1;
        }else {
            int i = 0;
            while(i<text1.length() && result ==0){
                if(text1.charAt(i) > text2.charAt(i)){
                    result = 1;
                }else if(text1.charAt(i) < text2.charAt(i)){
                    result = -1;
                }
                i++;
            }
        }
        return result;


    }

    //metoda wyswietlajaca sume liczb pierwszych w danej liczbie(1,2,3,5,7,11) np.
    //                          liczba 29 = 11+11+7
    //                          liczba 31 = 11+11+7+2

    public static String primaryNumbersOf (int number) {
        StringBuilder primaryBuilder = new StringBuilder();
        int[] primaryNumbers = {1, 2, 3, 5, 7, 11, 13};
        for (int i = primaryNumbers.length - 1; i >= 0; i--) {
            while (number >= primaryNumbers[i]) {
                number -= primaryNumbers[i];
                primaryBuilder.append(primaryNumbers[i]);
                primaryBuilder.append(" + ");
            }

        }return primaryBuilder.substring(0,primaryBuilder.length()-2);
    }


//        int[] divider = {1,2,3,5,7,11};
//        int i = 0;
//        while(i < number){
//            if(number - divider[5] > 11 ){
//                primaryBuilder.append("11 + ");
//            }
//            if(number - divider[4] > 7 ){
//                primaryBuilder.append("7 + ");
//            }
//            if(number - divider[3] > 5 ){
//                primaryBuilder.append("5 + ");
//            }
//            if(number - divider[2] > 3 ){
//                primaryBuilder.append("3 + ");
//            }
//            if(number - divider[1] > 2 ){
//                primaryBuilder.append("2 + ");
//            }
//            if(number - divider[0] > 1 ){
//                primaryBuilder.append("1 + ");
//            }
//            i++;
//        }





}

package piąte;

public class Methods {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, 5, 6, 7, 8};



        printArray(array);
        int sum = sumOfArray(array);
        double avg = avg(array);

        System.out.println("sum = " + sumOfArray(array));
        System.out.println("Avg = " + avg(array));
        System.out.println("min = " + min(array));
        System.out.println("max = " + max(array));
        System.out.println("spreed = " + spreed(array));
        printArray(statsOfOccurences(array));
        System.out.println("moda = " + moda(array));
        printArray(sortByCounting(array));
       // System.out.println("Womens name = " + womanNameCounter(names));



        int[] newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }


    }
    // STATYSTKI
    //metoda ktora zwraca wartosc najmniejszege elemntu
    public static int min (int[]array){
        int min = array[0];

        for (int i = 1; i <array.length ; i++) {
            if (min > array[i]){
                min = array[i];
            }

        }
        return min;
    }

    //metoda ktora zwraca wartosc najwiekszege elemnetu
    public static int max (int[]array){
        int max = array[0];

        for (int i = 1; i <array.length ; i++) {
            if (max < array[i]){
                max = array[i];
            }

        }
        return max;
    }
    //mediana
    public static int indexOfmax(int[] array){
        int iMax = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[iMax] < array [i]){
                iMax = i;
            }
        }
        return iMax;
    }

    public static int moda (int[] array){
        int[] stats = statsOfOccurences(array);
        int  idexOfMAximumValue = indexOfmax(stats);
        return idexOfMAximumValue + min(array);
    }
    //rozpietosc

    public static int spreed (int[]array){
        return max(array) - min(array) + 1;
    }
    //informacje o wystąpieniach liczb

    public static int[] statsOfOccurences (int[]array){
        int[] statsArray = new int[spreed(array)];
        int min = min(array);
        for (int i = 0; i <array.length ; i++) {
            statsArray[array[i] - min]++;
        }
        return statsArray;
    }


    //metoda która liczy srednia z tablicy  void metoda nie zwraca


    //* na podsatwie poprzednich metod wypisac posortowana tablice

    public static int [] sortByCounting(int[] array){
        int [] sortedArray = new int[array.length];
        int[] stats = statsOfOccurences(array);
        int k = 0;
        for (int i = 0; i < stats.length ; i++) {
            for (int j = 0; j < stats[i] ; j++) {
                sortedArray[k] = i + min(array);
                k++;
            }
        }
        return sortedArray;
    }

    public static double avg(int[] array) {
        int sum = sumOfArray(array);
        return (double) sum /array.length;
        }

        //napisac funkcej która przyjmuje tablice liczb i wypisuje ich sume

        public static int sumOfArray ( int[] array){
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
            }
    //metoda przyjmujaca tablice stringów z imionami, zliczamy w petli ile jest zenskich imion endsWith()a
    public static int womanNameCounter (String[] names) {
        int counter = 0;
        for (int i = 0; i < names.length ; i++) {
//            if(names[i].endsWith("a")){
//                counter++;
//            }


        }
        return counter;
    }


        //metoda
        public static void printArray ( int[] array){
//                  //    int[] array = {1,2,3,4,5,6,7,8};
//
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");


            }

        }


    public static int lettersCounter(String text, char c) {
        char[] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);
        for (int i = chars.length - 1; i >= 0; i--) {
            if (capitalize(chars[i]) == capitalizedChar) {
                counter++;
            }
        }
        return counter;
    }

//        public static int lrttersCounter(String[] messages, char c){
//        int counter = 0;
//            for (int i = 0; i < messeges.lenght[i] ; c) {
//                counter+= lettersCounter(messages[i]; c);
//
//            }
//        } return counter;


        public static char capitalize (char c){
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c; // operator trojargumentowy dla prostych obliczen

//        if (c >= 'a' && c <= 'z'){
//            c= (char) (c - 32);     //zamiana na duza litere prostrzy zapis na gorze
//        }
//        return c;
//        }




    //zliczmy wystąpienie litery (niezaleznie od tego czy jest to mała, czy wielka litera) w stringu np. "Ala ma kota


//    public static boolean endsWith(String text, String serchingValue){
//       if (serchingValue.length() <= text.length()){
//           boolean result = false;
//           int i = serchingValue.length() - 1;
//           char[] textAsCharArray = text.toCharArray();
//           char[] serchingValueAsCharArray = serchingValue.toCharArray();
//
//           int aLength = textAsCharArray.length;
//           int bLength = serchingValueAsCharArray.length;
//           while(i >= 0 && serchingValueAsCharArray[i] == textAsCharArray[aLength + i - bLength]){
//               i--;
//           }
//           return i== -1;
//       }return result;



    }}

    //zliczamy wystąpienie litery(niezaleznie od tego czy jest to masła, czy wielka litera) w tabliczy stringów





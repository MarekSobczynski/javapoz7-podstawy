import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("TicTacToe");
        //int firstValue = 5;
        //int secondValue = 10;

        Scanner reader = new Scanner(System.in);                //skanner
        //int someValue =  reader.nextInt();                 //wpisywanie w konsoli
        //System.out.println(someValue);

        System.out.println("insert first value");
        int firstValue = reader.nextInt();
        System.out.println("insert second value");
        int secondValue = reader.nextInt();

        int suma = firstValue + secondValue;
        int minus = firstValue - secondValue;
        int minus2 = secondValue - firstValue;
        int multiplication = firstValue * secondValue;
        double devide = 0;
        if (secondValue !=0){
         devide = (double)firstValue / secondValue;
        }
        if (firstValue !=0){
            devide = (double)secondValue / firstValue;
        }




        System.out.println( "add = " + suma);
        System.out.println("minus = " + minus);
        System.out.println("minus = " + minus2);
        System.out.println("multiply = " + multiplication);
        System.out.println("divide = " + devide );


        System.out.println("sum = "  + (firstValue + secondValue));


        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue+secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue-secondValue));
        if (secondValue !=0){
        System.out.println(firstValue + " / " + secondValue + " = " +  ((double) firstValue/secondValue));}
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue*secondValue));


        if (firstValue == secondValue){
            System.out.println("Values are egual");
        } else{
            System.out.println("Values are not equal");
        }

        if (firstValue > secondValue){
            System.out.println("First value is bigger than second");
        }else if (firstValue < secondValue){
            System.out.println("Second value is bigger than fisrt");
        }

        if(firstValue % secondValue !=0){
            System.out.println("Liczby podzielne z resztą");
        }else{
            System.out.println("Liczby podzielne bez reszty");
        }
        if(firstValue % 2 == 0){
            System.out.println("First value is even");
        }else{
            System.out.println("Second value is odd");
        }
        if (secondValue % 2== 0){
            System.out.println("second value is even");
        }else{
            System.out.println("Second value is odd");
        }






    }
}

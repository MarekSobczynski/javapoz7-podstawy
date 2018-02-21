import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        //pobrali liczbe jego wiek
        //jezeli wiek <6 ponienes isc do przedszkola
        //jezeli wiek <12 powinienes isc do podstawówki
        //jeżeli wiek <16 gimnazjum
        //<20 srednia//uczelnia

        Scanner agescanner = new Scanner(System.in); // alt+enter
        System.out.println("Podaj wiek mlodziku");
        int age = agescanner.nextInt();

        if (age < 6 ) {
            System.out.println("powinienes isć do przedszk");
        }else if (age > 12 ) {
            System.out.println("powinienes isc do podstawówki");
        }else if ((age> 20){
            System.out.println("gimnazjum");
        }
        if (age >= 20 && age <30){         //oba warunki muszą byc spełnione
            System.out.println("");
        }
        if (age < 18 || age >= 65){       //wystarczy ze jeden warunek jest prawdziwy
            System.out.println("");
        }
        if(age>=0 && (age < 18 || age >= 65)){
            System.out.println("");
        }

        //wyswietlic wiadomosc a jezeli wiek jest wiekszy od 30 i podzilny 3 %musia dac 0
        //wyswietlic wiadomosc b jezeli wiek jest mniejszy od 15 lub wieksdzy od 60 i wiek/ 5 ma reszte 2

        if(age > 30 && age % 3 == 0){
            System.out.println("massage a");
        }
        if ((age < 15 || age > 60) && age % 5 == 2){
            System.out.println("massage b");
        }




    }
}

package hangman.HangmanApplication;

import java.util.Random;
import java.util.Scanner;

public class HamgmannApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer;

        do {
            System.out.println("1. START");
            System.out.println("2. Results");
            System.out.println("0. End Game");
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    showHighScores();
                    break;

            }

        } while (answer != 0);


    }

    public static void startGame(Scanner scanner){
        System.out.println("Wlogika ");
        Random random = new Random();

    }

    public static void showHighScores (){
        System.out.println("bedzie wyswietlanie wyników");

    }



}


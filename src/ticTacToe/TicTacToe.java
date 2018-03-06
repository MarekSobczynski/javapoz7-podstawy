package ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer;
        do {
            TicTAcToeVievs.menuView();
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
            }

        } while (answer != 0);


    }



    public static void startGame(Scanner scanner){
        char cross = 'x';
        char circle = 'o';
        char currentSign = cross;
        char[] board = "123456789".toCharArray();
        int i =0;
        do{
            TicTAcToeVievs.boardViev(board);
            int position = scanner.nextInt();
            mark(currentSign, board, position);
            currentSign = currentSign == 'x'? circle : cross;

        }while(i<9 && !gameFinisch(board));
        TicTAcToeVievs.boardViev(board);
        System.out.println("end of game");
        if(!gameFinisch(board)){
            System.out.println("Draw");
        }else{
            System.out.println("Loser is " + currentSign);
        }

    }

    private static boolean gameFinisch(char[] board) {

        return isFirstDiagonalequal(board) ||
                isSecondDiagonalEqual(board) ||
                isAnyVeritcalEqual(board) ||
                isAnyHorizontalEqual(board);
    }

    private static boolean isAnyHorizontalEqual(char[] board) {
        int i = 0;
        boolean result = false;
        while(!result && i < 3){
            result = equals(board, i*3, i*3+1, i*3+2);
        }

        return false;
    }

    private static boolean isAnyVeritcalEqual(char[] board) {
        int i = 0;
        boolean result = false;
        while(!result && i < 3){
            result = equals(board, i, i+3, i+6);
        }

        return false;
    }

    private static boolean isSecondDiagonalEqual(char[] board) {
        return equals(board, 0,4,8);
    }

    private static boolean isFirstDiagonalequal(char[] board) {
        return equals(board, 2,4,6);
    }


    private static void mark(char currentSign, char[] board, int position) {
        board[position - 1] = currentSign;
    }


    private static boolean equals(char [] board, int i1, int i2, int i3){
        return board[i1] == board[i2] && board [i1] == board [i3];
    }


    public static int askForPosition(Scanner scanner, char[] board){
        int position;
        do{
            position = scanner.nextInt();
            if(!isValidPosition(position, board)){
                System.out.println("invalid value try again");
            }
        }while(!isValidPosition(position, board));
        return position - 1;

    }


    private static boolean isValidPosition(int position, char[] board) {
        return(position >=1 && position <=9) && board[position -1] != 'x' &&  board[position -1] != 'o';


    }


}

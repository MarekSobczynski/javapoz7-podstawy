package ticTacToe;

public class TicTAcToeVievs {
    public static void menuView () {
        char[] board = "123456789".toCharArray();
        boardViev(board);
        board[4] = 'x';
        boardViev(board);

        System.out.println("1. Start");
        System.out.println("0. Wyjdz");
    }

    public static void boardViev(char[] gameStatus){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <gameStatus.length ; i++) {
            stringBuilder.append(gameStatus[i]);
            if(i != gameStatus.length-1 && (i+1) %3 == 0){
                stringBuilder.append("\n");
                stringBuilder.append("-----");
                stringBuilder.append("\n");
            }else if (i != gameStatus.length-1) {
                stringBuilder.append("|");
            }
        }
        System.out.println(stringBuilder.toString());
    }


}

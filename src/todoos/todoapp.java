package todoos;


import java.io.InputStream;
import java.util.Scanner;

public class todoapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer;
        String[] board = new String [10];
        int index=0;
        do {
            toDoappVievs.menuViev();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer){
                case 1:
                    if(index == board.length){
                        toDoappVievs.noSpaceToWArning();

                    }else{
                    adToDo(scanner, board, index);
                    index++;
                    break;}
                case  2:
                    vievsAll(board, index);
                    toDoappVievs.waitForUser(scanner);

                    break;
            }
        }while(answer !=0);
    }

    private static void vievsAll(String[] board, int todosToDispaly) {
        if(todosToDispaly == 0){
            toDoappVievs.noSpacetoDisplay();
        }
        for (int i = 0; i <todosToDispaly ; i++) {
            System.out.println(i + ". " + board[i]);
        }
    }

    public static void adToDo(Scanner scanner, String[] board, int index){
        toDoappVievs.newToDos();
        String todo = scanner.nextLine();
        board[index] = todo; //wstawianie do tablicy




    }

}

package todoos;

import java.util.Scanner;

public class toDoappVievs {

    public static void menuViev(){
        System.out.println("1. to Do :");
        System.out.println("2. Viev all to does:");
        System.out.println("3. EXIT");

    }


    public static void noSpaceToWArning() {
        System.out.println("No space for new toto");
        System.out.println("press anny key to continue");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void waitForUser(Scanner scanner) {
        System.out.println("press anny key to continue");
        scanner.nextLine();
    }

    public static void newToDos() {
        System.out.println("add next to do");
    }

    public static void noSpacetoDisplay() {
        System.out.println("---------------------");
        System.out.println("no todos to display");
        System.out.println("---------------------");
    }
}

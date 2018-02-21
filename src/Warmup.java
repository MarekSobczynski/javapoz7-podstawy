import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Add triaangle sides");

        System.out.println("Add A ");
        int aSide = scanner.nextInt();

        System.out.println(" Add B ");
        int bSide = scanner.nextInt();

        System.out.println("Add C");
        int cSide = scanner.nextInt();

        int result = aSide + bSide + cSide;
        System.out.println(" Triaangle side sum = " + result);

        if ((aSide + bSide > cSide && aSide + cSide > bSide && bSide + cSide > aSide) &&
                ((aSide*aSide + bSide * bSide) == cSide*cSide)){
            System.out.println("Your Triangle  is quartet");
        }else{
            System.out.println("triangle is not quartet");
        }


        double area = 0.5 * aSide * bSide;
        System.out.println("trangle area = " + area);

        double srarea = (aSide+bSide+cSide) / 3;
        System.out.println("avg side = " + srarea);







    }
}

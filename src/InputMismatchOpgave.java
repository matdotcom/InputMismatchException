import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchOpgave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println(" Indtast det første tal ");
            int tal1 = input.nextInt();
            System.out.println(" Indtast det andet tal ");
            int tal2 = input.nextInt();

            System.out.println(tal1 + tal2);


        }
        catch(InputMismatchException ex) {
            System.out.println(" Du kan ikke taste kommatal LOL ");
        }
    }
}

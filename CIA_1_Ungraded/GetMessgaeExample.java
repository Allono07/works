package CIA_1_Ungraded;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

 class GetMessageExample {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n;

         do {
             try {
                 System.out.println("Enter an integer: ");
                 n = scanner.nextInt();
             } catch (InputMismatchException e) {
                 System.out.println("Invalid input. Please enter an integer.");
             }
         } while (n != 0);

         System.out.println("You entered: " + n);
     }
}
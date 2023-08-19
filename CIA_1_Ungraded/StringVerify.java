package CIA_1_Ungraded;

import java.util.Scanner;

public class StringVerify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        String output = CheckInput(input);
        System.out.println("The entered stirng is "+ output);

    }
    public static String CheckInput (String userInput){
        if (userInput.matches("\\d+")) {
            return "Numerical";
        } else if (userInput.matches("[a-zA-Z0-9]+")) { // https://stackoverflow.com/questions/12831719/fastest-way-to-check-a-string-is-alphanumeric-in-java
            return "Alphanumeric";
        } else {
            return "Neither numerical nor alphanumeric";
        }
    }
}

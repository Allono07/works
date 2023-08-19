package CIA_1_Ungraded;


import java.util.Scanner;

public class ArithematicOperation {

    public static void main(String[] args) {
        String operator;
        float n1=0,n2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator ");
        operator = sc.next();
        System.out.println("Enter the first number");
        n1 = sc.nextFloat();
        System.out.println("Enter the second number");
        n2 =sc.nextFloat();
        switch(operator) {
            case ("+"):
                System.out.println(n1 + n2);
                break;
            case ("-"):
                System.out.println(n1 - n2);
                break;
            case("*"):
                System.out.println(n1*n2);
                break;
            default:
                System.out.println("No input have been provided");
        }
    }

}

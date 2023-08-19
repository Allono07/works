package CIA_1_Ungraded;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UniqueStrings {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto 5 strings");
        for ( int i=1;i<=5;i++){
            input = sc.nextLine();
            strings.add(input);
        }
        for(String string: strings){
            System.out.println(string);
        }


    }
}

package probelm6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class PrintStarts {
    public static void main(String[] args) throws IOException{
//        System.out.println("enter the number of rows and column");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try{
//            int rows= Integer.parseInt(reader.readLine());
//            int col=Integer.parseInt(reader.readLine());
//
//        } catch (InputMismatchException e){
//            System.out.println(main(String rows););
//        }
//
//    }
        pattern();

    }
    public static void pattern() throws IOException{
        System.out.println("enter the number of rows and column");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int rows= Integer.parseInt(reader.readLine());
            int col=Integer.parseInt(reader.readLine());

        } catch (InputMismatchException e){
            pattern();
        }

    }
}

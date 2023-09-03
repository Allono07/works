import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws IOException{
        pattern();
    }
    public static void pattern() throws IOException{
        System.out.println("enter the number of rows and column");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int rows= Integer.parseInt(reader.readLine());
            int col=Integer.parseInt(reader.readLine());
            for (int i=0;i<rows;i++){
                for (int j=0;j<col;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (InputMismatchException e){
            pattern();
        }

    }
}

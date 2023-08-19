package CIA_1_Ungraded;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args){
        int n =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}

package actions;

public class BinaryConversion {


    public void performDecimalToBinary(int x){
        int rem = 2;
        int quotient = 3;
        String binary = "";
        if(x>=2) {
            while (quotient >= 2) {
                rem = x % 2;
                quotient = x/2;
                binary= binary + rem;
                x = quotient;
                if(quotient==1){
                    binary = binary+1;
                }
            }
        } else if(x==0){
            binary = "0";
        } else if(x==1){
            binary = "1";
        }
        else {
            System.out.println("Enter a valid input ");
        }
        System.out.print("binary value = "+ (new StringBuilder(binary).reverse()));
    }
}

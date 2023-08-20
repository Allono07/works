public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
      /*  PrintAtoZ printAtoZ = new PrintAtoZ();
        printAtoZ.start();
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.start();*/
        PrintEven even = new PrintEven();
        Thread PrintEven = new Thread(even);
        PrintEven.start();
        PrintOdd odd = new PrintOdd();
        odd.start();

    }

}
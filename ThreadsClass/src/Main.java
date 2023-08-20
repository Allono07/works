public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        PrintAtoZ printAtoZ = new PrintAtoZ();
        printAtoZ.start();
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.start();
    }
    public void printNumbers(){
        for(int i=0;i<=9;i++){
            System.out.print(i);
        }
        System.out.println();
    }
    public void printAtoZ(){
        for(char i='a';i<='z';i++){
            System.out.print(i);
        }
    }
}
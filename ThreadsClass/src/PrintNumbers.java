public class PrintNumbers extends Thread {
public void run(){
   // Main main = new Main();
    //main.printNumbers();
    try{
        printToN(10);
    } catch (InterruptedException e){
        throw new RuntimeException(e);
    }
}
public void printToN(int n) throws InterruptedException{
    for(int i=0;i<n;i++){
        System.out.print(i);
        Thread.sleep(1000);
    }
    System.out.println();
}
}

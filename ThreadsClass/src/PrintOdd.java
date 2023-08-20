public class PrintOdd extends Thread {
    public void run(){
        try {
            printOdd();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    public void printOdd() throws InterruptedException{
        for(int i=1;i<=100;i=i+2){
            System.out.print(i);
            Thread.sleep(1000);
        }
    }
}

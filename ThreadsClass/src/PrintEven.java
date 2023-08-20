public class PrintEven implements Runnable{
    public void run(){
        try {
            printEven();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    public void printEven() throws InterruptedException{
        for(int i=0;i<=100;i=i+2){
            System.out.print(i);
            Thread.sleep(1000);
        }
    }
}

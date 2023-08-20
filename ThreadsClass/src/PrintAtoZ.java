public class PrintAtoZ extends Thread {
   @Override
    public  void run() {
        try{
            printAtoZ();
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    /*{
        Main main = new Main();
        main.printAtoZ();
    }*/
    public void printAtoZ() throws InterruptedException{
        for(char i='a';i<='z';i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}



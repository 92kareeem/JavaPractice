public class Main_runnable {
    public static void main(String args[]){
        new NewThread("one");
        new NewThread("two");
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

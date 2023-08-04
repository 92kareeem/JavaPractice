public class Main_Multithread{
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
           MultiThread obj = new MultiThread();
           obj.start();
        }
    }
}
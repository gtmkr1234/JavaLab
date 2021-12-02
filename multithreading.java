class Thread1 extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1");
        }
        System.out.println(10/0);
    }
}
class Thread2 extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2");
        }
        System.out.println();
    }
}
public class Problem1 {
}

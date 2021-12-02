class myThread extends Thread {
    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("MyThread "+i);
//        }
        System.out.println(10/0);
    }
}
class Test56{
    public static void main(String[] args) {
        Thread obj = new myThread();
        // or
        // myThread obj  = new myThread ;
        obj.start();
        // we can also override the start method but we dont use it
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread "+1);
        }
    }
}
public class NewThread {

}

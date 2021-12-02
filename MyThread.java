/*
MultiThreaded application
Runnable interface
*/
//public class MyThread implements Runnable {
//
//    @Override
//    public void run() {
//        Thread.currentThread().setName("E custom");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//}

class Test45{
    public static void main(String[] args) {
        Thread obj1 = new Thread(() -> {
            Thread.currentThread().setName("E custom");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
        );

        obj1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

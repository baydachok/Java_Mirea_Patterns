package test;

public class Main{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("It's Main broooooo");


        // Integer myPrint = new Integer(123);
        // System.out.println(Integer.class.getName()); java.lang.Integer
        // System.out.println(myPrint.getClass().getName()); java.lang.Integer
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; ++i){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

    }
}
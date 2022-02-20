package threads;

/**
 * 1. Use this file to write your first thread program using Runnable interface
 * 2. When you are done convert the same program by extending the Thread class
 * */
public class FirstThread extends Thread{



  public static void main(String[] args) {
    Runnable runnable = new FirstThread();


    Thread t1 = new Thread(runnable,"mythread-t1");
    t1.start();

    Thread t2 = new Thread(runnable,"mythread-t2");
    t2.start();


  }
}

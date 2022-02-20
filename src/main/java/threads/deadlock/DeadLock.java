package threads.deadlock;

public class DeadLock {

  public static void main(String[] args) throws InterruptedException {
    SimpleSync call = new SimpleSync();

    /**
     * TODO: Create two runnable and thread. Call the first method inside first runnable
     * TODO: and second method inside the second runnable. Start both the threads and join
     */

    Runnable runnable1 = new Runnable() {
      @Override
      public void run() {
        call.first();
      }
    };

    Runnable runnable2 = new Runnable() {
      @Override
      public void run() {
        call.second();
      }
    };

    Thread t1 = new Thread(runnable1);
    Thread t2 = new Thread(runnable2);
    t1.start();
    t2.start();

    t1.join();
    t2.join();
  }
}
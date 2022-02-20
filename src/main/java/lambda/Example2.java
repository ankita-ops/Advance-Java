package lambda;

public class Example2 {

  public static void main(String[] args) {
    Runnable r = () -> {
      int i = 0;
      while (i++ < 10) {
        System.out.println("It works!");
      }
    };

    new Thread(r).start();
  }
}

package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadDemo5 {
  public static void main(String[] args) {
    Runnable task = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("안녕");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
        }
      }
    };
    //Executor exec = Executors.newCachedThreadPool();
    Executor exec = Executors.newFixedThreadPool(4);
    exec.execute(task);
    for (int i = 0; i < 5; i++) {
      System.out.println("안녕");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }
}

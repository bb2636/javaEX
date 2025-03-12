package thread;

public class InterruptDemo2 {
  public static void main(String[] args) {
    Runnable task = () -> {
      while (!Thread.currentThread().isInterrupted()) {
        System.out.println("실행중");
        try {
          Thread.sleep(1);
        } catch (InterruptedException e) {}
      }
      System.out.println("정상종료");
    };

    Thread thread = new Thread(task, "thread");
    thread.start();
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) { }
    thread.interrupt();
  }
}

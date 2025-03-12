package thread;

public class InterruptDemo1 {
  public static void main(String[] args) {
    StopThread stopThread = new StopThread();
    stopThread.start();

    try {
      Thread.sleep(30);
    } catch (InterruptedException e) {}
    stopThread.stop = true;
  }
}

class StopThread extends Thread{
  public boolean stop;
  @Override
  public void run() {
    while (!stop) {
      System.out.println("실행 중");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {}

    }
    System.out.println("정상종료");
  }
}

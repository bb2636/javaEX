package thread;

public class ThreadDemo {
  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start(); //run 찍기

    for (int i = 0; i < 5; i++) {
      System.out.println("안녕");
      try {
        Thread.sleep(500); //0.5초 동안 딜레이 주기
      } catch (InterruptedException e) {}
    }
  }
}

class MyRunnable implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("잘 가");
      try {
        Thread.sleep(500); //0.5초 동안 딜레이 주기
      } catch (InterruptedException e) {

      }
    }
  }
}

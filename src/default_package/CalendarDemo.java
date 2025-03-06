package default_package;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    int d = cal.get(Calendar.DATE);
    System.out.println("오늘 일 :" +d);
    int m = cal.get(Calendar.MONTH);
    System.out.println("오늘 월 :"+ m);
  }
}

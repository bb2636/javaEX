package exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
  public static void main(String[] args) throws IOException, NullPointerException {
    FileInputStream is = null;
    try {
      is = new FileInputStream("test.txt");
    } catch (FileNotFoundException e ) {
      e.getMessage();
    } finally {
      is.close();
    }
  }
}

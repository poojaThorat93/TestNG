package iretryListenerTest;

import org.testng.annotations.Test;

public class TestListener1 {
  @Test
  public void Login() {
	  System.out.println("This is IRetry Listener ");
	  int value = 10/0 ;
	  System.out.println(value);
  }
}

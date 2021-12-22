package ParallerExecutionTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class LogIn {
  @Test
  public void EnterUsername() {
	  System.out.println(Thread.currentThread()+"------------------------------------------");
	  System.out.println(" enter Username ");
  }
  
  @Test
  public void EnterPassword() {
	  System.out.println(Thread.currentThread()+"------------------------------------------");
	  System.out.println(" enter Password ");
  }
  
  @Test
  public void ClickLogin() {
	  System.out.println(Thread.currentThread()+"------------------------------------------");
	  System.out.println(" Click on login Button ");
  }
}

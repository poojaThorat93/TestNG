package ParallerExecutionTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LogOutTest {
  @Test(groups= {"smoke"})
  public void Logout() {
	  System.out.println(Thread.currentThread()+"------------------------------------------");
	  System.out.println(" click on logout button");
  }
  
  @Test
  public void closeWindo() {
	  System.out.println(" close Window");
  }
}

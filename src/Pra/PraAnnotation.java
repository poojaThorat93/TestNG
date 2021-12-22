package Pra;

import org.testng.annotations.Test;

public class PraAnnotation {
	
  @Test(priority =1)
  public void logIn() {
	  System.out.println(" this is logIn");
  }
  
  @Test(priority = 2)
  public void openPage() {
	  System.out.println(" open page ");
  }
  
  @Test(enabled = false)
  public void searchMail() {
	  System.out.println(" Search mail ");
  }
  
  @Test(invocationCount = 2)
  public void logOut() {
	  System.out.println(" log out ");
  }
  
 /* @Test(groups = "smoke")
  public void smoke1() {
	  System.out.println(" this is smoke1 method ");
  }*/
  
  @Test(groups = "regression" )
  public void regression1 () {
	  System.out.println(" This is regression method ");
  }
  
  
  
}

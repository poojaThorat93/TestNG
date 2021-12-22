package Pra;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PraAll {
	
	@BeforeMethod
	public void ClearCookes() {
	System.out.println("ClearCookes-- Before Method");}
	
  @BeforeTest
  public void EnterUrl() {
	  System.out.println("enter Url -- Before Test");}
  
  @Test(priority=1, groups= {"SmokeTest"})
  public void Login() {
	  System.out.println(" Login ");  }
 
  @Test(priority = 2, groups = {"SmokeTest"})
  public void Inbox() {
	  System.out.println(" Inbox ");}
  
  @Test(enabled=false)// it will not run 
  public void LogOut() {
	  System.out.println(" LogOut ");
  }
  
  @Test(groups= {"SmokeTest"}, priority= 3)
  public void CloseWindow() {
	  System.out.println(" Close Window ");
  }
  
  
  
  
}

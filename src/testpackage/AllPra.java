package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllPra {
	/*
  @Test(priority = 1)
  public void Login() {
	  System.out.println("this is login");
  }
    
  @Test(invocationCount = 2)
  public void Inbox() {
	  System.out.println("this is Inbox");
  }
  
  @Test()
  public void CheckMail() {
	  System.out.println("this is CheckMail");
	  int value = 10/0;
  }
    
  @Test(dependsOnMethods = "CheckMail" )
  public void Logout() {
	  System.out.println("this is Logout");
  }
  
  @Test
  @Parameters({"Username","Password"})
  public void LogingToSite(String Username , String Password ) {
	  System.out.println("Login to site");
	  System.out.println("This is Creadentials "  + Username + " " + Password);
  }
  
  @Test(groups = "SmokeTest")
  public void getInfo() {
	  System.out.println("This is info");
  }
  
  @Test(groups = "RegressionTest")
  public void getAllDetails() {
	  System.out.println("This is Details");
  }
  
  */
 @Test(priority = 1)
 @Parameters({"usernam","password"})
	 public void Login(String usernam, String password) {
		  System.out.println("this is login"  + usernam + ""+password);
	  }
  
 @Test
 @Parameters({"mob"})
public void enterUsername(String mob) {	
	System.out.println("this is mob " + mob);
	
}
 
 
 
 
  @Test(priority = 3, enabled = false)
	 public void LogOut() {
		  System.out.println("this is LogOut");
	  }

  
  @Test(invocationCount = 3 , invocationTimeOut = 5000)
	 public void Inbox() {
		  System.out.println("this is Inbox");
	  }
  
 
  
  
}

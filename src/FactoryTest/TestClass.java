package FactoryTest;

import org.testng.annotations.Test;

public class TestClass {
	
	String username;
	String password;
	
	TestClass(String username, String password){
		this.username = username;
		this.password = password;
	}
	
  @Test(priority=0)
  public void loginUser() {
	  System.out.println(username);
  }
  
  @Test(priority=1)
  public void loginPass() {
	  System.out.println(password);
	  
  }
  
  
}

package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
//  @Test(dataProvider="LoginData")
//  public void LoginTestMethod(String username, String password) {
//	  
//	  System.out.println(username +" ---  "+password);
//	  
//  }
//  
//  @DataProvider(name="LoginData")
//  public Object[][] testData() {
//	  return new Object[][] {
//		  {"user1","pass1"},
//		  {"user2","pass2"}
//	  }; 
//  }
//  
  
  @Test(dataProvider="TestData", dataProviderClass=DataProviderClassTest.class)
  public void LoginTestMethod(Integer username, String password) {
	  
	  System.out.println(username +" ---  "+password);
	  
  }
  
}

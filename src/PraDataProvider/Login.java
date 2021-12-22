package PraDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProviderPra.LogInTestData;

public class Login 
// in below example Test data and method , both present in same class.
{
  @Test (dataProvider = "LoginData")  
  public void LoginTest(String username, String password) {
	  System.out.println(username + "" + password);
  }
  
  @DataProvider(name= "LoginData")
  public Object [][] testData(){
	  return new Object[][] {
		  {"user1", "pass1"},
		  {"user2", "pass2"},
		  {"user3" , "pass3"}
	  };
  }
  
  
  // in below example test Data present in another class, so we need to mention dataProviderClass to pass data 
  
@Test(dataProvider = "negativeTestData" , dataProviderClass=TestData.class)
public void NegativeTesting(String username, String password) {
	  System.out.println(username + "" + password);
}  


@Test (dataProvider = "LoginCredentials")
public void PraTest(String id, String password)
{
	System.out.println(id+ " " + password+ " ");}

@DataProvider(name= "LoginCredentials")
public Object[][] loginTestData(){
	return new Object[][] {
		{"ID1", "Pass1"},
		
		{"ID2", "Pass2"}
	};
	
}

}




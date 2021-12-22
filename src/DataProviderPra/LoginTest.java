package DataProviderPra;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
  @Test(dataProvider = "LoginData")
  public void LogInTest(String username , String password) {
	  System.out.println(username +"" + password);	  
  }
  
  
  @DataProvider(name = "LoginData")
  public Object[][] testData() {
	  return new Object[][] {
		  {"user1", "pass1"},
		  {"user2", "pass2"},
		  {"user3" , "pass3"}
	  };
  }
  
  @Test(dataProvider= "negativeTestData", dataProviderClass=LogInTestData.class)
  public void NegativeTesting (String username , String password){
	  System.out.println(username + "" + password);
	  
  }
}

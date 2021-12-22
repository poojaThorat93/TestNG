package Pra;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	@Test(dataProvider = "LoginNegativeData")
	
	public void TestLogin(String username , String password) {
		System.out.println(username + "" +password );
	}
	 
	@DataProvider(name = "LoginNegativeData") 
	public Object [][] testData(){		
		return new Object [][] {
			{"pooja" , "T"},
			{"Sahil", "T"}
		};
	}
	
	
	
}

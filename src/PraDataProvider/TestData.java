package PraDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {
	  @DataProvider(name="negativeTestData")
	  public Object[][] negativeData() {
		  return new Object [][] {
			  {"PO" , "23"},
			  {"98" , "%^"},
			  {"9897" , "9879"}
		  };
	  }
}

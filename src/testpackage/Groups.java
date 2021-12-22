package testpackage;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups= {"smoke"})
  public void FillDetails() {
	  System.out.println(" Fill details class ");
  }
	@Test(groups= {"smoke", "regtession"})
	public void getInfo() {
		  System.out.println(" get Info class ");
	  }
}

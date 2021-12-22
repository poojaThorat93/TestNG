package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation2 {
	
  @Test
  @Parameters({"env" ,"brow" })
  public void Cat(String env , String brow) {
	  System.out.println("this " +env +"" + brow);
	  
  }
  @Test(groups = {"smoke"})
  public void Dog() {
	  System.out.println(" Dog Method");
  }
  
@Test(successPercentage = 80)// if this method pass 80% then alos it will show as a pass. no need to pass at 100 percent 
  public void TestsucPercent(){
	  System.out.println("this is successPercentage");
  }
{
	
}
}

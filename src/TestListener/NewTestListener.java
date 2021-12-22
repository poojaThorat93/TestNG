package TestListener;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTestListener {
  @Test
  public void launchURL() {
	  System.out.println("launch the url");
	  int value = 10/2 ; // here we are failing test cases - so it will execute 
	  System.out.println(value);
	  
	  /*here we are failing test cases - so it will execute
	   * ---OUTPUT---
	  On Start Method
	  On Test Start Method
	  launch the url
	  On Failure Method
	  On Finish Method*/
	  
	  /*IF THIS METHOD PASS - so it will execute
	  ---OUTPUT---
	  
	  On Start Method
	  On Test Start Method
	  launch the url
	  5
	  On Success Method
	  On Finish Method*/
	  
  }
}

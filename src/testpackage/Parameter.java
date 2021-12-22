package testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  @Parameters({"a","b"})
  public void Addition(int a, int b) {
	  
	  int c= a+b;
	  System.out.println("this is addition " +c );
  }
}

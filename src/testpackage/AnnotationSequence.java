package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSequence  {
	
  @org.testng.annotations.BeforeSuite
  public void beforeSuite() {
	  System.out.println(" In Before Suite ");
  }
  @BeforeTest
  public void beforeTest () {
	  System.out.println( " In Before Test ");
  }
  
  @BeforeClass
  public void beforeClass () {
	  System.out.println( " In Before Class ");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println( " In Before Method ");
  }
  @Test
  public void cat() {
	  System.out.println( " ----  In Cat Method  ---- ");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println(" In After Suite ");
  }
  
  @AfterTest
  public void afterTest () {
	  System.out.println( " In After Test ");
  }
  
  @AfterClass
  public void afterClass () {
	  System.out.println( " In After Class ");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println( " In After Method ");
  }
  
}

package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//  ===========  BeforeMethod & AfterMethod ==============  
// BeforeMethod - will run before every method
// AfterMethod - will run after every method

public class Annotation3 {
  @BeforeMethod
  public void login() {
	  System.out.println("  ===== This is Before Method  ===== ");
  }
  @Test
  public void inbox() {
	  System.out.println( " check inbox ");
  }
  
  @Test
  public void checkEmail() {
	  System.out.println(" check Email ");
  }
  
  @AfterMethod
  public void logOut() {
	  System.out.println("==== This is After Method ====");
  }
  //====================== BeforeClass & AfterClass ============================= 
  
  // Before Class - It will run before every class , 1st this  Beforemethod run , and then others
  // After Class -  It will run After Every class .
  @BeforeClass
  public void clearHistory() {
	  System.out.println(" ----- This is Before Class -----");
  }
  
  @AfterClass
  public void CloseBorser(){
	  System.out.println(" -------- This is After Class ------");
  }
  
  
  // ========================== BeforeTest & AfterTest =============================
  
  // BeforeTest -  it will execute before every test - here consider 'Test' in xml file
  // AfterTest -  it will execute after every test - here consider 'Test' in xml file
  
  
}

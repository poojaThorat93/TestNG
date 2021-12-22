package testpackage;
import org.testng.annotations.Test;

public class Annotation1 {
	
	/*// one test cases/Scenario  can consided , by default it run asci character , when we not set any priprity 

  @Test(priority =1 , description = "for addition")
    public void add() {
	  System.out.println("in the test method - add");
  }
  
  @Test(priority = 2)
  public void substraction() {
	  System.out.println("in the test method - substraction");
  }
  
  @Test(priority = 3,  timeOut = 1000)// use for single method time - it will throw erroe if it take more time than given time
  public void multiplication() {
	  System.out.println("in the test method - multiplication");
  }
  
  @Test(priority = 4 , enabled = false)// this will not run 
  public void Division() {
	  System.out.println("in the test method - Division");
	  
  }
  
  @Test(invocationCount= 2, invocationTimeOut = 5000)
  public void TestInvocation() {
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("this is Invocation "); // same method can execute number of times, whichever we pass 
  }
  
  @Test(expectedExceptions=ArithmeticException.class)
  public void DivisionTestMethod() {
	  System.out.println("this is Division Method == ");
	  int i = 10/0;
	  System.out.println("This is DivisionTestMethod ");
  }
  */
  
 
// ======= DependsOn ======== if one method is depends on another method. if 1st method/dependsOnMethods will pass then only it execute , if 1st method/dependsOnMethods fail then it will Skip it  
  @Test
  public void LogIn() {
	  System.out.println(" this is Login Method");
	  int i = 10/0;
	  
  }
  /*@Test(dependsOnMethods="LogIn")
  public void InBox() {
	  System.out.println("this is inbox");
	  
  }*/
  @Test(dependsOnMethods="LogIn",alwaysRun= true)// it will always run though dependsOnMethod fail.
  public void LogOut() {
	  System.out.println("This is LogOut");
  }
  
}

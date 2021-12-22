package FactoryTest;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactoryExample {
	
  @Factory
  public Object[] factoryMethod() {
	  
	  Object[] test = new Object[2];
	  
	  test[0] = new TestClass("user1", "pass1");
	  test[1] = new TestClass("user2", "pass2");
	  
	  return test;
	  
  }
  
}

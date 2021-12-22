package FactoryTest;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class RegisterDataFactoryExample {
  @Factory
  public Object[] factryMethod1(){
	  Object[] test = new Object[2];
	  test [0] = new RegisterForm("pooja","Thul");
	  test [1] = new RegisterForm("sahil","Thorat");

	  return test;
			  
  }
}

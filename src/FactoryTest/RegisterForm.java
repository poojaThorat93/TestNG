package FactoryTest;

import org.testng.annotations.Test;

public class RegisterForm {
	
	String Name;
	String Surname;
	
	RegisterForm(String Name,String Surname){
		this.Name = Name;
		this.Surname = Surname;
	}
	
  @Test
  public void fillForm() {
	  System.out.println(Name);
  }
  @Test
  public void fillForm1() {
	  System.out.println(Surname);
  }
}

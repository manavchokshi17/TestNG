package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testing3 {
	
	SoftAssert softAssert = new SoftAssert();//creat object first
  @Test (priority = -2, groups = {"smoke","sanity"}) //create new user test@test.com
  public void createUser() {
	  System.out.println("I am in home test");
	  System.out.println("Before assertion");
	  Assert.assertTrue(4>3,"Verify Element");//we use regular assert in industry
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc");
	 
  }
  @Test(priority = -1, dependsOnMethods = "createUser")//Edit user test@test.com
  public void editUser() {
	  System.out.println("Before assertion");
	  softAssert.assertTrue(2>3,"Verify Element");
	  System.out.println("After Assertion");
	  softAssert.assertAll();
  }
  @Test(priority = 0, dependsOnMethods = "editUser")//Delete user test@test.com
  public void deletUser() {
	  System.out.println("I m in End Test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2>3,"Verify Element1");
	  System.out.println("After Assertion");
	  softAssert.assertEquals("abc", "abc1");
	  System.out.println("After Second Asssertion");
	  softAssert.assertAll();
	  
  }
}

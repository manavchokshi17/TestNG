package selenium;

import org.testng.annotations.Test;

public class testing2 {
  @Test
  public void test4() {
	  System.out.println("test4");
  }
  @Test(groups = "smoke")
  public void test5() {
	  System.out.println("test5");
  }
}

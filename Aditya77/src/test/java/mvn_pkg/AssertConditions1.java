package mvn_pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConditions1 {
  @Test(priority = 0)
  public void test1() {
	  Assert.assertEquals("Aditya1", "Aditya2");
	  System.out.println("This is first case");
  }
  @Test(priority = 1, dependsOnMethods = "test1", alwaysRun = true)
  public void test2() {
	  System.out.println("This is second case");
  }
  @Test(priority = 2)
  public void test3() {
	  System.out.println("This is third case");
  }
  @Test(priority = 3)
  public void test4() {
	  System.out.println("This is fourth case");
  }
}

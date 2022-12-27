package mvn_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class groups1 {
  @Test(groups = "smoke",priority = 0)
  public void testcase1() {
	  System.out.println("this is smoke test 1");
  }
  @Test(groups = "regression",priority = 1)
  public void testcase2() {
	  System.out.println("this is regression test 1");
  }
  @Test(groups = "smoke",priority = 2)
  public void testcase3() {
	  System.out.println("this is smoke test 2");
  }
  @Test(groups = "regression",priority = 3)
  public void testcase4() {
	  System.out.println("this is regression test 2");
  }
}

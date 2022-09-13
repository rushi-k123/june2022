package TestNG12;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Assertions {
	@Test
	public void test1() {
		Reporter.log("running TestCase1",true);
		
		String expResult = "Rushikesh";
	    String actResulst = "Rushikesh";
	    
	    Assert.assertEquals( actResulst,expResult,"act & exp result is same");
	}
	@Test
	public void test2() {
		Reporter.log("running TestCase2",true);
		
		String expResult = "Rushikesh";
	    String actResulst ="Aniket";
	    
	    Assert.assertNotEquals( actResulst,expResult,"act & exp result is diffrent");
	}
}

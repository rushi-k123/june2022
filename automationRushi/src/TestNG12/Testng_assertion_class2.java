package TestNG12;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_assertion_class2 {
	@Test
	public void test1() {
		Reporter.log("running TestCase1",true);
		
		String expResult = "Rushikesh";
	    String actResulst = "Aniket";  //act & exp result is same expected [Rushikesh] but found [Aniket]
	    
	    Assert.assertEquals( actResulst,expResult,"act & exp result is same");
	}
	@Test
	public void test2() {
		Reporter.log("running TestCase2",true);
		
		String expResult = "Rushikesh";
	    String actResulst ="Rushikesh";  // act & exp result is diffrent did not expect [Rushikesh] but found [Rushikesh]
	    
	    Assert.assertNotEquals( actResulst,expResult,"act & exp result is diffrent");
	}
}



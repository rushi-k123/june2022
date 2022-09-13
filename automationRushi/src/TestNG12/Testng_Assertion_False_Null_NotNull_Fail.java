package TestNG12;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Assertion_False_Null_NotNull_Fail {
	

	@Test
	public void test1() {
		Reporter.log("running TC1",true);
		
		String expResult = "Rushikesh";
	    String actResulst = "Rushikesh";
	    
	    Assert.assertEquals( actResulst,expResult,"act & exp result is different");
	}
	@Test
	public void test2() {
		Reporter.log("running TC2",true);
		
		String expResult = "Rushikesh";
	    String actResulst ="Aniket";
	    
	    Assert.assertNotEquals( actResulst,expResult,"act & exp result is same");
	}
	@Test
	public void test3() {
		Reporter.log("running TC3",true);
		boolean result = true;
		
		Assert.assertTrue(result, "result is false");
	}
	@Test
	public void test4() {
		Reporter.log("running TC4",true);
		boolean result = false ;
		
		Assert.assertFalse(result,"result i8s true");
	}
	
	@Test
	public void test5() {
		Reporter.log("running TC5",true);
	    
		String actResult = null;
		Assert.assertNull(actResult, "act result is not null");
	}	
	@Test
	public void test6() {
		Reporter.log("running TC6",true);
	    
		String actResult = "Pune";
        Assert.assertNotNull(actResult, "act result is null");
	}
	}

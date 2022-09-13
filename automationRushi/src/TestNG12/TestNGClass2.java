package TestNG12;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass2 {
	@Test(invocationCount = 4)
	public void Tc1() {
		Reporter.log("running is TC1",true);
	}
	@Test(priority = -2,enabled=true)
	public void Tc2() {
		Reporter.log("running is TC2",false);
	}	
	@Test(priority = 2)
	public void Tc3() {
		Reporter.log("running is TC3",true);
   }
	@Test(priority = 5)
	public void Tc4() {
		Reporter.log("running is TC4",true);
	
  }
	@Test(timeOut=4000)
	public void Tc5() throws InterruptedException {
		Thread.sleep(2000);
		Reporter.log("running is TC5",true);
	}
	@Test(dependsOnMethods={"Tc4"})
	public void Tc6(){
		
		Reporter.log("running is TC4",true);
  }
	
	
	
	
}
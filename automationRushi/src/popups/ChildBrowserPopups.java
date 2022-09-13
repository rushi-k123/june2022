package popups;




import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {
	public static <string> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\acer\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		driver.get("https://qavbox.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Multi Window']")).click();
		Thread.sleep(3000);
		
		String idofmainpage = driver.getWindowHandle();
		  System.out.println(idofmainpage);//CDwindow-9985C385F51E2D7FBE32F9AC115CD625
		  Thread.sleep(2000);
		  
	    Set<String> ids = driver.getWindowHandles();
	      ArrayList<String> al = new ArrayList<String>(ids)	;
		  System.out.println(al.get(0));
		  System.out.println(al.get(1));
		  
		  Thread.sleep(2000);
		  



		 
		  
		  driver.quit();		
		
	}
}

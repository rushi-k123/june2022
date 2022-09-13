package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\acer\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@maxlength='10' ]")).sendKeys("14");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println(alt.getText());
		
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		System.out.println(alt1.getText());
		Thread.sleep(2000);
		
		driver.quit();
		  
	
	}
}

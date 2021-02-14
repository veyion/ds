import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

 

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//selenium code-
	System.setProperty("webdriver.chrome.driver", "C:\\johncena\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://spicejet.com"); //URL in the browser

//	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

//	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Thread.sleep(4000);
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
driver.findElement(By.xpath("//*[@text='Ajmer (KQH)']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	}
	
	
}
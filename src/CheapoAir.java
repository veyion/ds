import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheapoAir {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\johncena\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("to0")).sendKeys("Dhaka");
		Thread.sleep(3000);
		driver.findElement(By.id("to0")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@aria-label='20 December 2020']")).click();
	//	driver.findElement(By.xpath("//*[@aria-label='16 January 2021']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='calendar']/div/div[1]/div[1]")).getText());
	WebElement ron =	driver.findElement(By.xpath("//*[@id='calendar']"));
	System.out.println(ron.getText());
		while(!ron.getText().contains("April"))
		{
			System.out.println(ron.getText());
			driver.findElement(By.xpath("//*[@aria-label='Select next month']")).click();
		}
		driver.findElement(By.xpath("//*[@aria-label='21 April 2021']")).click();
		driver.findElement(By.id("travellerButton")).click();
		WebElement jo= driver.findElement(By.id("addadults"));
		for(int i=0;i<9;i++)              
		{jo.click();}
		
		Select s= new Select(driver.findElement(By.id("Class")));
		Thread.sleep(2000);
		s.selectByIndex(2);
		driver.findElement(By.id("closeDealDialog")).click();
		driver.findElement(By.id("searchNow")).click();
	}

}

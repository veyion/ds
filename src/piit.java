import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class piit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\johncena\\chromedriver.exe");
		WebDriver driver = piit();
		password(driver);

		driver.findElement(By.xpath("//*[@id='frmLogin']/div/div[3]/p/input")).click();
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * * * ==================================");
		Object veggie;
		int topscore = 100;
		if (topscore ==100 || topscore>10)
		{
				
		        System.out.println("ok");
		        		// && = AND  ||= or
		   
		        } }
























	private static WebDriver piit() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://forum.piit.us/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='input_text']")).sendKeys("mmislam99");
		return driver;
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void password(WebDriver driver) throws InterruptedException
	{

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='input_password']")).sendKeys
		
		
		
		
		("126884651082899");
	}



}
	

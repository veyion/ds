import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CHAIR {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\johncena\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://cheapoair.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("to0")).sendKeys("New");
		List<WebElement> go =driver.findElements(By.xpath("//*[@class='suggestion-box__item ic-arw-bend childsuggest']"));
		for(WebElement goo:go) {
          if(goo.getText().equalsIgnoreCase("JFK - New York Kennedy, New York, United States"))
        		  {
        	       goo.click();
        		  }
        		  
		}
		
	}
}
	   
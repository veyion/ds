import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MentoringNBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\johncena\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nba.com/");
		driver.manage().window().maximize();
		WebElement Cool= driver.findElement(By.xpath("//*[@id='__next']/div[2]/footer/div/section/div[2]/ul"));
	
		for(int i=0;i<Cool.findElements(By.tagName("a")).size();i++)
			
		{Cool.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		Set<String>idk =  driver.getWindowHandles();
		Iterator<String> a  =  idk.iterator();
	         driver.switchTo().window(a.next());
		System.out.println(driver.getCurrentUrl());
            driver.switchTo().window(a.next());
		System.out.println(driver.getCurrentUrl());
	
	
	}

}

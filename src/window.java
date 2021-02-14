import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\johncena\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nba.com");
       WebElement Cool = driver.findElement(By.xpath("//*[@id='__next']/div[2]/footer/div/section/div[2]/ul"));
     
       for (int i=0;i<Cool.findElements(By.tagName("a")).size();i++)

{
	Cool.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
        	//System.out.println(Cool.getText());
  }
   	Set<String>ids=driver.getWindowHandles();
	Iterator<String> it= ids.iterator();
	String pid= it.next();
	String cid = it.next();
	String did= it.next();
	driver.switchTo().window(did);
	System.out.println("AFTER SWTICHING");
	System.out.println(driver.getTitle());
	

	}

}

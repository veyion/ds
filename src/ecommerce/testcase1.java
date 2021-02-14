package ecommerce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\johncena\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
				
		//.forEach(s->s.findElements(By.xpath("//button[@type='button']")).get(1).click());
		for(int i=0;i<product.size();i++) {
			if(product.get(i).getText().contains("Carrot") || product.get(i).getText().contains("Beetroot"))
			{
			   driver.findElements(By.xpath("//button[@type='button']")).get(i).click();
			}
			
		}
				
	}

}

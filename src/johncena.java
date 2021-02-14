import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class johncena {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\johncena\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
  		WebDriverWait w=new WebDriverWait(driver,5);

		int j=0;
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
         Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		Thread.sleep(4555);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	      		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

				driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
      		driver.findElement(By.cssSelector("button.promoBtn")).click();
      		
      		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promo.info")));
      		System.out.println(driver.findElement(By.cssSelector("span.promo.info")).getText());

	}
public static void addItems(WebDriver driver,String[] itemsNeeded)
{
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
int j=0;
	for(int i=0;i<products.size();i++)

	{

	//Brocolli - 1 Kg

	//Brocolli,    1 kg

	String[] name=products.get(i).getText().split("-");

	String formattedName=name[0].trim();

	//format it to get actual vegetable name

	//convert array into array list for easy search

	//  check whether name you extracted is present in arrayList or not-

 List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(formattedName))

	{

	j++;

	//click on Add to cart

	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	if(j==itemsNeeded.length)

	{

	break;

	}

	
	}
	

	}
	
}
}
	





	
	
	
	
	
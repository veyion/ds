import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dddda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\johncena\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/spicejet.com");
		 Select dan= new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		 dan.selectByValue("USD");
		 dan.selectByIndex(3);
		 dan.selectByVisibleText("INR");
	//	 driver.findElement(By.id("divpaxinfo")).click();
		// for(int i=1;i>5;i++)	 {}

	}
}

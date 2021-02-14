import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class finalMentoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 double principal = 10000;
	 double rate =   .1;
	 double time= 2.3;
	double interest= principal * rate * time;
      end(principal,rate,time,interest);
	
 principal=3700;
 rate= .11;
 time= 2;
 interest= principal * rate * time;
 end(principal,rate,time,interest);
 
		
		
}
	public static void end(double principal,double rate,double time,double interest) {
		if(interest== principal *rate * time)
		{
		 System.out.println(interest);
		}
	}
}
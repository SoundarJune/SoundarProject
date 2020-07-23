package Automation.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[9]/a/img")).click();
		WebElement Aleart= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		Aleart.click();
	    Alert alert=driver.switchTo().alert();
	    alert.accept();
	
	    WebElement a1= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
	   a1.click();
	   Alert a11=driver.switchTo().alert();
	   a11.dismiss();
	   
	  WebElement Soundar= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
	  Soundar.click();
	  Thread.sleep(3000);
	 Alert b=driver.switchTo().alert();
	 Thread.sleep(3000);
	 b.sendKeys("soundar");
	 b.accept();
	  
	   
	
	
	
	
	
		
		
		 
		
		
		
	}

}

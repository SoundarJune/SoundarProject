package Automation.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[11]/a/img")).click();
		String OldWindow=driver.getWindowHandle();
		WebElement soundar=driver.findElement(By.id("home"));
		soundar.click();
		Set<String> handles=driver.getWindowHandles();
		for (String newwindow1 : handles) {
			driver.switchTo().window("newwindow1");	
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/h5")).click();
		driver.close();
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
	
	
		
		
		
	}
	
		

	}



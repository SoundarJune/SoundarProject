package Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/a/img")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		
		
		
		
		
		
	}

}

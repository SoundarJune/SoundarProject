package Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("soundar");
		
		WebElement  name =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		name.sendKeys("murugan");
		
		WebElement value = driver.findElement(By.name("username"));
		String value1=value.getAttribute("value");
		System.out.println(value1);
		
		WebElement clearname=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearname.clear();
		
		WebElement a=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
	    boolean so= 	a.isEnabled();
	    System.out.println(so);
	
		

		
		
		

		
		
		

	}

}

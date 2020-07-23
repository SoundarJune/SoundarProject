package Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[5]/a/img")).click();
		
		WebElement dropdown1 =driver.findElement(By.id("dropdown1"));
		Select s= new Select(dropdown1);
		s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("Loadrunner");
		WebElement soundar=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		Select soundar1=new Select(soundar);
		soundar.sendKeys("Selenium");
		
		WebElement sound=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select/option[1]"));
		Select sound1=new Select(sound);
		sound1.selectByIndex(0);
		sound1.selectByIndex(1);
		sound1.selectByIndex(2);
		
		
		
		
		
		


		

	}

}

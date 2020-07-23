package Automation.org;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[5]/a/img")).click();
		
		WebElement dropdown1 =driver.findElement(By.id("dropdown1"));
		Select dropdown= new Select(dropdown1);
		dropdown.selectByIndex(1);
		
		WebElement dropdown2 =driver.findElement(By.name("dropdown2"));
		Select dropdowns= new Select(dropdown2);
		dropdowns.selectByValue("3");
		
		WebElement dropdown3 =driver.findElement(By.id("dropdown3"));
		Select drop= new Select(dropdown3);
		drop.selectByVisibleText("Loadrunner");
		
		WebElement dropdown4=driver.findElement(By.className("dropdown"));
		Select drop1= new Select(dropdown4);
		java.util.List<WebElement>  soundar=drop1.getOptions();
		int size=soundar.size();
		System.out.println("size is"+size );
		
		WebElement s=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
	     Select ss=	new Select(s);
	    s.sendKeys("Loadrunner");
		
		
		
		WebElement m=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select all=new Select(m);
		all.selectByIndex(2);
		all.selectByIndex(1);
		
		
		
		
		
		
		
		
		
	
	
//driver.quit();		

}
}

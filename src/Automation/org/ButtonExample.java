package Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		WebElement click=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[2]/a/img"));
		click.click();
		
		WebElement FindXY=driver.findElement(By.id("position"));
	Point Find=	FindXY.getLocation();
	int xvalue=Find.getX();
	int yvalue=Find.getY();
	System.out.println("xvalue is"+ xvalue+"yvalueis"+ yvalue);
	
	
	WebElement color=driver.findElement(By.xpath("//*[@id='color']"));
	String color1=color.getCssValue("background-color");
	System.out.println(color1);
	
	WebElement size=driver.findElement(By.id("size"));
	int height=size.getSize().getHeight();
	int width=size.getSize().getWidth();
	System.out.println("hight is"+height+"width is "+width);
	
	driver.findElement(By.id("home")).click();
	
	
	
	
	
	
	
	
	
	

	
	
	
	
		
		
	}

}

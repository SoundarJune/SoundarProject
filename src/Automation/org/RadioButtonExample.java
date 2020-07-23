package Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[6]/a/img")).click();
		WebElement RadioButton= driver.findElement(By.id("yes"));
		Boolean s=RadioButton.isSelected();
		System.out.println(s);
	    WebElement soundar=	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]"));
	    soundar.click();
	    WebElement so=driver.findElement(By.className("myradio"));
	    Boolean sound=so.isEnabled();
	    System.out.println(sound);
	    
	    
	   
	
		


		
		

	}

}

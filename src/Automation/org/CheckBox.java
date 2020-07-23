package Automation.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LearnAutomation\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[7]/a/img")).click();
		WebElement soundar=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		soundar.click();
		WebElement soundar1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		Boolean ss=soundar1.isEnabled();
		System.out.println(ss);
		
		WebElement soundarraj=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]"));
		soundarraj.click();
		
		
		
		
		
		
		
		
	}

}

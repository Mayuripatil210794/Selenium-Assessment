package Selenium_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que_3 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		

	driver.manage().window().maximize();
	driver.get("https://demoqa.com/webtables");

String name = "Alden";
//For Delete
//driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[2]")).click();
//Thread.sleep(2000);

// For Edit
WebElement usernamee = driver.findElement(By.xpath("//div[text()='" + name + "']"));
	if (usernamee.isDisplayed()) 
	{
		driver.findElement(By.xpath("//*[text()='" + name + "']/following-sibling::div[6]/div/span[1]")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.id("firstName")).sendKeys("test");
}
}
}

package Selenium_Assessment;

/*
 *
Task 1 : Write script to fill this form using selenium webdriver.
Task 2 : Write script to take screenshot of filled form
 * 
 */
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.ui.Select;
	import com.google.common.io.Files;

	public class Que_1 
	{
			
		public static void main(String[] args) throws InterruptedException, IOException 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("  https://demoqa.com/automation-practice-form");
			driver.manage().window().maximize();
			
			
			 Thread.sleep(2000);
			  
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			 driver.findElement(By.id("firstName")).sendKeys("Mayuri");
			 Thread.sleep(1000);
			 driver.findElement(By.id("lastName")).sendKeys("Patil");
			 Thread.sleep(1000);
			 driver.findElement(By.id("userEmail")).sendKeys("mayuri@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
			 Thread.sleep(1000);
			 JavascriptExecutor up=(JavascriptExecutor)driver;
			 up.executeScript("window.scrollBy(0,1000)");
			 Thread.sleep(1000);
			 driver.findElement(By.id("userNumber")).sendKeys("1234567899");
			 Thread.sleep(1000);
			 driver.findElement(By.id("dateOfBirthInput")).click();
			 Thread.sleep(1000);

			 WebElement WE1= driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
			 WebElement WE2= driver.findElement(By.cssSelector("select.react-datepicker__year-select"));
			 Select s1= new Select(WE1);
			 Select S2= new Select(WE2);
			 s1.selectByVisibleText("July");
			 S2.selectByValue("1994");
			 Thread.sleep(2000);

			 WebElement WE3= driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]"));
			 Actions A = new Actions(driver);
			 A.moveToElement(WE3).click().perform();

			 driver.findElement(By.id("subjectsInput")).sendKeys("Computer");
			 Thread.sleep(1000);

			 WebElement WE4=	driver.findElement(By.id("hobbies-checkbox-1"));
			 A.moveToElement(WE4).click().build().perform();
			 Thread.sleep(1000);
			 WebElement WE5=	driver.findElement(By.id("hobbies-checkbox-3"));
			 A.moveToElement(WE5).click().build().perform();
			 Thread.sleep(1000);


			 driver.findElement(By.id("uploadPicture")).sendKeys("G:\\Tops Techonology\\photos\\Mayuri.jpg"); //for uploading file
			 //A.moveToElement(WE5).click().build().perform();
			 Thread.sleep(1000);
			 driver.findElement(By.id("currentAddress")).sendKeys("Surat, Gujrat");
			 Thread.sleep(1000);
			 File F1= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
			 Files.copy(F1, new File("C:\\Users\\HP\\Screenshot\\DemoQAForm.png"));

			 driver.quit();
}
}

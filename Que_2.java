package Selenium_Assessment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();


/*------------------------------------------------Task_1----------------------------------------------------------*/
    for (int i = 1; i <=4; i++) 
    {
    String rowcount = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[1]/div[5]/table/tbody/tr["+i+"]/th")).getText();
	System.out.println(rowcount);
    }
    System.out.println();

    for (int i = 1; i <=4; i++) {
	WebElement td = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/th"));
	if (td.isDisplayed()) {
	System.out.println("Yes");	
	} else {
	System.out.println("Not present");	
	}
	}
	System.out.println();
		// OR --> done by relative xpath//
	WebElement td = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr/th"));
	if (td.isDisplayed()) {
	System.out.println("Present");	
	} else {
	System.out.println("Not Present");	
	}

/*------------------------------------------------Task_2----------------------------------------------------------*/
//    int last= driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[1]/div[5]/table/tfoot/tr/th")).size();
//    System.out.println(last + " Heading ");
//    int ast= driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[1]/div[5]/table/tfoot/tr/td")).size();
//    System.out.println(ast + " Coloumn ");
//    System.out.println(" Hence verified !!!  1 heading & 1 coloumn = Total 2 coloumns having data ");
//    driver.quit();
	
//    	for (int i = 0; i < 1; i++) {
//    	String g=driver.findElement(By.xpath("//table[@summary='Sample Table']/tfoot/tr")).getText();	
//		System.out.println(g);
//    	}
//    	driver.quit();

		
/*-------------------------------------------------Task_3----------------------------------------------------------*/		
//		List<WebElement> data = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
//		int max = 0;
//		for(WebElement dElement : data)
//		{
//			String str = dElement.getText();
//			
//			String k = str.substring(0,str.length()-1);
//			int i = Integer.parseInt(k);
//			System.out.println(i);
//			if(i>max)
//			{
//				max= i;
//			}
//		}
//		System.out.println("Max is : "+max);
//		
		

	}	
	}






	

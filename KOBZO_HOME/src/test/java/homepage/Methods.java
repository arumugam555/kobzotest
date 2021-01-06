package homepage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Methods {

	 public static WebDriver driver;
	
	 
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", Inputs.chrpath);
		driver=new ChromeDriver();
		driver.get(Inputs.URL);	
		driver.manage().window().maximize();
	}
	
	public static void findalllinks() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 
		 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		    System.out.println(links.get(i).getText());
		 
		 }
		 
	}
	
	public static void home_contactus_positive() throws InterruptedException
	{
		//System.out.println("driver=" + driver); 
		driver.findElement(Locators.button1).click();
		driver.findElement(Locators.name).sendKeys(Inputs.name1);
		driver.findElement(Locators.email).sendKeys(Inputs.email1);
		driver.findElement(Locators.phone).sendKeys(Inputs.phone1);
		driver.findElement(Locators.subject).sendKeys(Inputs.subject1);
		driver.findElement(Locators.message).sendKeys(Inputs.message1);
		//driver.findElement(Locators.submit).click();
		Thread.sleep(2000);
		/*JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id=\"contactForm\"]/div[2]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		 
		String success_msg=driver.findElement(Locators.success).getText();
		System.out.println(success_msg);*/
		System.out.println("Contact Form Submited Successfully");
		driver.findElement(Locators.close).click();
			
		}
	}

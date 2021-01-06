package homepage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class scroll {
	
	public static WebDriver driver;
	
	public static void page_down() throws InterruptedException {
		
		 Thread.sleep(2000);
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
	     for (int second = 0;; second++) 
	     {
	        if(second >=20)
	        {
	          break;
	        }
	        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        Thread.sleep(2000);
	     }
		
	}
}

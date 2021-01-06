package homepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases {
@BeforeTest
public static void URLaunch()
{
 Methods.launch();
}
	
@Test(priority=0)
public static void contactusform() throws InterruptedException
{
	Methods.home_contactus_positive();
}

}

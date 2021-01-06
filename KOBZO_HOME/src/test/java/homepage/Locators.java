package homepage;

import org.openqa.selenium.By;

public class Locators {
	public static By button1=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div[1]/div/div/div/div/div[1]/div/button");
	
	//contact form
	
	public static By name=By.xpath("//*[@id=\"contactForm\"]/div/div[1]/div/input");
	public static By email=By.xpath("//*[@id=\"email6ad5\"]");
	public static By phone=By.xpath("//*[@id=\"contactForm\"]/div/div[3]/div/input");
	public static By subject=By.xpath("//*[@id=\"contactForm\"]/div/div[4]/div/input");
	public static By message=By.xpath("//*[@id=\"message\"]");
	public static By submit=By.xpath("//*[@id=\"contactForm\"]/div[1]/div[6]/button");
	
	public static By success=By.className("alert alert-success");
	public static By close=By.xpath("//*[@id=\"contactForm\"]/div[2]/button");
	
	public static By knowmore1=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/section[1]/div/div[2]/div[1]/div/p[2]/a");
	public static By knowmore2=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/section[1]/div/div[2]/div[2]/div/p[2]/a");
	public static By knowmore3=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/section[1]/div/div[2]/div[3]/div/p[2]/a");
	
	public static By covid_19know=By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div[2]/div/div/div[2]/div/a");

	
}

package keyBoardStrokeHandlingUsingKeyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClass {
	/*
	 * This method tells how to handle keyboard stroke using
	 * Keys class, Keys class is always used inside send keys  
	 */

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/v1/");
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user",Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.TAB,Keys.ENTER);			
		driver.quit();
	}

}

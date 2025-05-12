package typesOfLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfLocators 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.saucedemo.com/v1/");
		
		//By.id-->[id="user-name"]
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//By.name-->[name="password"]
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//By.classname-->[className="btn_action"]
		driver.findElement(By.className("btn_action")).click();
		
		driver.quit();
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		
		//By.linkText-->must contain a href link on webpage and  a text like >Login<
		driver1.findElement(By.linkText("Login")).click();
		
		//By.partialLinkText-->must contain a href link on webpage and  a text like >Become a Seller< here i used partial text 
		driver1.findElement(By.partialLinkText("Become a")).click();
		
		//By.cssSelector-->[class=\"styles__ButtonStyle-sekd9q-0 jSCZCD styles__Button-sc-a90kxg-8 styles__SecondaryButton-sc-a90kxg-9 styles__SignUpButton-sc-1lklol6-41 kIPDMU\"]
		//can be found by any tab name like [label="abckjkda"]
		driver1.findElement(By.cssSelector("[class=\"styles__ButtonStyle-sekd9q-0 jSCZCD styles__Button-sc-a90kxg-8 styles__SecondaryButton-sc-a90kxg-9 styles__SignUpButton-sc-1lklol6-41 kIPDMU\"]")).click();
		
		//By.xpath-->//input[@label=\"Enter Mobile Number\"]"
		//this is xpath with attribute whole xpath session will be there in next class named as xpath types
		driver1.findElement(By.xpath("//input[@label=\"Enter Mobile Number\"]")).sendKeys("9015643220");
		driver.quit(); 
	}
			
}

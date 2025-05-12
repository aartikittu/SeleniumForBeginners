package autoSuggestion;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions 
{
	/*
	 * This method captures all the webelement which comes after typing the String which 
	 * you want to search. For ex: if we search for iphone on search bar and do not submit it, 
	 * you will get lists of suggestions, so this method will capture all thee suggestions
	 * and print it.  
	 */
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Nike");
		Thread.sleep(2000);
		List<WebElement> elements=driver.findElements(By.className("_3D0G9a"));
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
		}		
	}	
}

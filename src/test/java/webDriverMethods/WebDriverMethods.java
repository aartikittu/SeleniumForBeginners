package webDriverMethods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		//get method--> to go to particular URL		
		driver.get("https://www.flipkart.com/");
		
		//getTitle--> to get the title of current tab
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		
		//getCurrentUrl---> to get the current URL
		String url=driver.getCurrentUrl();
		System.out.println("Current URL: "+url);
		
		//getPageSource--> to get the current tab page Source
		String pageSource=driver.getPageSource();
		System.out.println("pageSource: "+pageSource);
		
		//getWindowHandle---> to get the current tab window handle 
		String windowHandle=driver.getWindowHandle();
		System.out.println("Window Handle: "+windowHandle );
		
		//getWindpowHandles--> to get the all the window handles opened by web driver
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println("window handles: "+windowHandles);
		
		//manage--> will help in minimizing , maximizing and many more options with the help of window function......
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		//switch---> to switch to default content, alert, frame and many more.....
		driver.switchTo().defaultContent();
		
		
		//findElement--> to find the element by id, xpath, classname, name css and many more.....
		driver.findElement(By.xpath("//span[text()=\"Mobiles\"]")).click();
		
		//navigate--> to navigate to url, to go back ,forward and many more....
		driver.navigate().back();

		//find Elements--> to find the list of elements found by particular locator
		 List<WebElement> elements = driver.findElements(By.className("_38VF5e"));
		 System.out.println(elements);
		 
		 //close--> to close the current window where webdriver is present right now 
		 driver.close();
		 
		 //quite--> to close all the windows opened by web driver
		 driver.quit();
	}
}

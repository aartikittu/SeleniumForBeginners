package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login-button"));
		
		//sendKeys()---> send the data to the text field
		username.sendKeys("performance_glitch_user");
		
		//clear()--> clear the data from the particular webelement text field
		username.clear();
		username.sendKeys("standard_user");
		
		//getSize()--> get the size of the element and return their dimension i.e height and width 
		Dimension size=username.getSize();
		System.out.println("Height of username text field: "+size.getHeight());// getHeight()--> returns height
		System.out.println("Width of username text field: "+size.getWidth());// getWidth().--> returns width 
	
		//getLocation()-->get the position of element and return the Point type of datatype 
		Point location = username.getLocation();		
		System.out.println("Location of webElement in X axis: "+location.getX()); //returns X axis of element
		System.out.println("Location of webElement in Y axis: "+location.getY());// returns Y axis of element

		//getRect()--> get the dimension as well as point of Webelement i.e height, width, x axis, y axis
		Rectangle rect = username.getRect();
		System.out.println("Height: "+rect.getHeight()); // returns height
		System.out.println("Width: "+rect.getWidth()); //returns width
		System.out.println("X axis: "+rect.getX()); // returns X axis
		System.out.println("Y axis: "+rect.getY()); // returns Y axis
		
		//isDisplayed()--> check the webelement is displayed on webpage or not and returns true is displayed and false if not displayed 
		System.out.println("username is displayed or not: "+username.isDisplayed());
		
		//isEnabled()--> check if the webelement is enabled for action or not and returns boolean value
		System.out.println("username is enabled or not: "+username.isEnabled());
		
		//isSelected()--> check if the webelement is selected or not and returns boolean value
		System.out.println("username is selected or not: "+username.isSelected());
		
		/*getAttribute()-->it gives the attribute value of the particular locator which we provide in method
		 *<input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">
		 *it is Depreciated as there was ambiguity that weather it is returning property or attribute of the element.
		 *So instead we use getDomAttribute() for attribute of element  
		 *and getDomProperty() for property of element	
		 */
		System.out.println("Attribute Value: "+username.getAttribute("id")); // here attribute name is id and value corresponding to id is username 
		
		/*getTagName()-->it provides the tag name of the webelement
		 * <input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">
		 */
		System.out.println("Tag Name: "+username.getTagName());// here tag name is input
		
		//getArialRole()-->it gives the type of element weather is it text box, button, link, text and so on....
		System.out.println("Arial role: "+username.getAriaRole());
		
		/*getDomAttribute()--> it returns the attribute value of element as defined in Html
		 *<input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">
		 * here attribute value of id is username	 
		 */
		System.out.println("Dom Attribute: "+username.getDomAttribute("id"));
		
		/*
		 *getDomProperty()-->it returns the current state of element which can be dynamically updated by java script
		 *you will not see much difference until and unless value of element is updated dynamically 
		 */
		System.out.println("Dom Property: "+username.getDomProperty("id"));
		
		//getAccessibleName()-->it gives the name which is displayed on webpage
		System.out.println("Accesible name: "+username.getAccessibleName()); 
		
		//submit()--> it will submit the clickable element like link, button, search box and take to further Webpage
		password.sendKeys("secret_sauce");
		login.submit();
				
		//click()-->it will click the button, link, text field, search box it will take the cursoR to particular webelement
		driver.findElement(By.xpath("//button[text()=\"Open Menu\"]")).click();
				
			
		//getText()--> it gives the text which is there on webpage
		WebElement info=driver.findElement(By.className("inventory_item_desc"));
		String text=info.getText();
		System.out.println("Text is: "+info);
		
		
		//getScreenshotAs()--> please check another class named as CaptureScreenshot in webElementMethods package
		
	}
}

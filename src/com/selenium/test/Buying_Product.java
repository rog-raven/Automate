package com.selenium.test;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Buying_Product {
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
	signin.click();
	
	WebElement email_Id = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	email_Id.sendKeys("reengage43@gmail.com");
	
	WebElement pswd = driver.findElement(By.xpath("//input[@name='passwd']"));
	pswd.sendKeys("12345678");
	
	WebElement sign_in_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	sign_in_Btn.click();
	
	
	WebElement t_Shirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	t_Shirts.click();
	
	Actions a = new Actions(driver);
	
	WebElement product = driver.findElement(By.xpath("//div[@class='product-container']"));
	a.moveToElement(product).click().perform();
	
	WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	a.moveToElement(addtocart).click().perform();

	WebElement checkout_Clk = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",checkout_Clk );
	
	WebElement checkout_Clk2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	checkout_Clk2.click();
	
	WebElement comment = driver.findElement(By.xpath("//textarea[@class='form-control']"));
	comment.sendKeys("User information already registered correctly:");
	
	
	WebElement checkout_Clk3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	checkout_Clk3.click();
	
	WebElement tc_clk = driver.findElement(By.xpath("//input[@type='checkbox']"));
	tc_clk.click();
	
	WebElement checkout_Clk4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	checkout_Clk4.click();

	WebElement bank_Payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
	bank_Payment.click();
	
	WebElement confirm_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	confirm_Btn.click();
	
	WebElement scroll_down = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
	  js.executeScript("arguments[0].scrollIntoView();",scroll_down);
		
	Thread.sleep(2000);
	TakesScreenshot order_Img = (TakesScreenshot)driver;
	File source = order_Img.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Rog\\eclipse\\java-2020-09\\eclipse\\Automation_Practice\\Images\\order1.png");
    FileUtils.copyFile(source,destination);
    
    WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
    women.click();
    
    WebElement printed_Dress = driver.findElement(By.xpath("(//div[@class='product-container'])[4]"));
    a.moveToElement(printed_Dress).click().perform();
    
   WebElement add_To_Cart = driver.findElement(By.xpath("(//span[text()='More'])[4]"));
   a.moveToElement(add_To_Cart).click().perform();
    
  WebElement item_No = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
  item_No.clear();
  item_No.sendKeys("4");
  
  WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
  Select s6 = new Select(size);
  s6.selectByIndex(1);
  
  WebElement cart_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
  cart_Btn.click();
  
  Thread.sleep(2000);
  WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
  js.executeScript("arguments[0].click();",checkout);
  
  WebElement checkout_1 = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
  checkout_1.click();
  
  
  WebElement summary_Chkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
  summary_Chkout.click();
  
  WebElement address_Chkout = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
  address_Chkout.click();
  
  WebElement tc2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
  tc2.click();
  
  WebElement shipping_Chkout = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
  shipping_Chkout.click();
  
  WebElement payment_Cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
  payment_Cheque.click();
  
  WebElement confirm_Order= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
  confirm_Order.click();
  
  WebElement scrolls = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
  js.executeScript("arguments[0].scrollIntoView();",scrolls);
	
  File source1 = order_Img.getScreenshotAs(OutputType.FILE);
  File destination1 = new File("C:\\Users\\Rog\\eclipse\\java-2020-09\\eclipse\\Automation_Practice\\Images\\order2.png");
  FileUtils.copyFile(source1,destination1);
  
  WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
  logout.click();
    
  driver.navigate().refresh();
  
  driver.close();
	
	}

}


package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shopping_Cart_Reg{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	
	WebDriver chrome = new ChromeDriver();
	chrome.get("http://automationpractice.com/index.php");
	
	chrome.manage().window().maximize();
	chrome.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	
	WebElement signin_Btn = chrome.findElement(By.xpath("//a[@class='login']"));
	signin_Btn.click();
	
	WebElement crt_Acnt = chrome.findElement(By.xpath("(//input[@type='text'])[2]"));
	crt_Acnt.sendKeys("reengage43@gmail.com");
	
	WebElement crt_Acnt_Btn = chrome.findElement(By.xpath("(//button[@type='submit'])[2]"));
	crt_Acnt_Btn.click();
	
	
	WebElement title = chrome.findElement(By.xpath("//label[@for='id_gender1']"));
	title.click();
	

	WebElement first_Name = chrome.findElement(By.xpath("//input[@id='customer_firstname']"));
	first_Name.sendKeys("Jason");
	
	WebElement last_Name = chrome.findElement(By.xpath("//input[@id='customer_lastname']"));
	last_Name.sendKeys("Broody");

    WebElement pswd = chrome.findElement(By.xpath("//input[@type='password']"));
    pswd.sendKeys("12345678");

    WebElement days_Dob = chrome.findElement(By.xpath("//select[@id='days']"));
    Select s = new Select(days_Dob);
    s.selectByIndex(3);
    
    WebElement month_Dob = chrome.findElement(By.xpath("//select [@id='months']"));
    
    Select s1 = new Select(month_Dob);
    s1.selectByIndex(4);
	
    WebElement years_Dob = chrome.findElement(By.xpath("//select [@id='years']"));
	Select s2 = new Select(years_Dob);
	s2.selectByIndex(23);
	
	WebElement signup_Newsettler = chrome.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	signup_Newsettler.click();
	
	WebElement offers = chrome.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	offers.click();
	
	WebElement company = chrome.findElement(By.xpath("(//input[@type='text'])[7]"));
	company.sendKeys("AbcInfotech");
	
	WebElement address_1 = chrome.findElement(By.xpath("(//input[@type='text'])[8]"));
	address_1.sendKeys("No.34");
	
	WebElement address_2 = chrome.findElement(By.xpath("(//input[@type='text'])[9]"));
	address_2.sendKeys("4th cross street");
	
	WebElement city = chrome.findElement(By.xpath("(//input[@type='text'])[10]"));
	city.sendKeys("Chennai");
	
	
	WebElement state = chrome.findElement(By.xpath("//select[@name='id_state']"));
	Select s4 = new Select(state);
	s4.selectByIndex(1);
	
	WebElement pincode = chrome.findElement(By.xpath("(//input[@type='text'])[11]"));
	pincode.sendKeys("60096");
	
	WebElement home_Phone = chrome.findElement(By.xpath("(//input[@type='text'])[12]"));
	home_Phone.sendKeys("48969834");
	
	WebElement phone_No = chrome.findElement(By.xpath("(//input[@type='text'])[13]"));
	phone_No.sendKeys("876349876");
	
	WebElement alias_Address = chrome.findElement(By.xpath("(//input[@type='text'])[14]"));
	alias_Address.sendKeys("No.43,");
	
	WebElement register_Btn = chrome.findElement(By.xpath("(//button[@type='submit'])[2]"));
	register_Btn.click();
	
}
}

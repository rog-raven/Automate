package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Shopping extends Base_Class {
public static void main(String[] args) {
	getDriver("chrome");
	geturl("http://automationpractice.com/index.php");
	implicit_Wait(5);
	
	WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
	clickTheElement(signin);
	
	WebElement email_Id = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	inputValueElement(email_Id,"reengage43@gmail.com");
	
	WebElement pswd = driver.findElement(By.xpath("//input[@name='passwd']"));
    inputValueElement(pswd, "12345678");    
    
    WebElement sign_in_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
    clickTheElement(sign_in_Btn);
    
    WebElement t_Shirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
    clickTheElement(t_Shirts);
    
    WebElement products = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
    clickTheElement(products);
    
    implicit_Wait(05);
    
    
   frameWindow("byId", "fancybox-frame1609292969773", "null", null);
   
  
   
   WebElement frame2 = driver.findElement(By.xpath("//div[@class='box-info-product']"));
   frameWindow("Bywebelement", "null", "null", frame2);
   
   WebElement icon_Incrs = driver.findElement(By.xpath("//i[@class='icon-plus']"));
   clickTheElement(icon_Incrs);
   


}
}

package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends Base_Class {
	public static void main(String[] args) {
		getDriver("chrome");
		geturl("https://www.amazon.in/");
		
		WebElement best_Sellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		actionMethods(best_Sellers, "click");
	//	actionMethods(best_Sellers, "contextclick");
		
	}

}

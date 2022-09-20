package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice extends Base_Class {
	public static void main(String[] args) throws Throwable {

		getDriver("chrome");
		geturl("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickTheElement(signin);

		WebElement email_Id = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		inputValueElement(email_Id, "reengage43@gmail.com");

		WebElement pswd = driver.findElement(By.xpath("//input[@name='passwd']"));
		inputValueElement(pswd, "12345678");

		WebElement sign_in_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickTheElement(sign_in_Btn);

		WebElement t_Shirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickTheElement(t_Shirts);

		WebElement product = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		//frameWindow("bywebelement", null, null, product);
		actionMethods(product, "movetoelement");

		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		actionMethods(addtocart, "click");

		WebElement checkout_Clk = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		scripting(checkout_Clk, "click");

		WebElement checkout_Clk2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickTheElement(checkout_Clk2);

		WebElement comment = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		inputValueElement(comment, "User information already registered correctly:");

		WebElement checkout_Clk3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickTheElement(checkout_Clk3);

		WebElement tc_clk = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickTheElement(tc_clk);

		WebElement checkout_Clk4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickTheElement(checkout_Clk4);

		WebElement bank_Payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickTheElement(bank_Payment);

		WebElement confirm_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickTheElement(confirm_Btn);

		WebElement scroll_down = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
		scripting(scroll_down, "scrolldown");

		screenshot("C:\\Users\\Rog\\eclipse\\java-2020-09\\eclipse\\Automation_Practice\\Images\\shop1.png");

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		clickTheElement(women);

		WebElement printed_Dress = driver.findElement(By.xpath("(//div[@class='product-container'])[4]"));
		clickTheElement(printed_Dress);

		WebElement add_To_Cart = driver.findElement(By.xpath("(//span[text()='More'])[4]"));
		actionMethods(add_To_Cart, "click");

		WebElement item_No = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		clearSelected(item_No);
		inputValueElement(item_No, "4");

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropDown("1", "selectbyindex", size);

		WebElement cart_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickTheElement(cart_Btn);
		sleep(2000);

		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		scripting(checkout, "click");

		WebElement checkout_1 = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		clickTheElement(checkout_1);

		WebElement summary_Chkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickTheElement(summary_Chkout);

		WebElement address_Chkout = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickTheElement(address_Chkout);

		WebElement tc2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickTheElement(tc2);

		WebElement shipping_Chkout = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickTheElement(shipping_Chkout);

		WebElement payment_Cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		clickTheElement(payment_Cheque);

		WebElement confirm_Order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickTheElement(confirm_Order);

		WebElement scrolls = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
		scripting(scrolls, "scrolldown");

		screenshot("C:\\Users\\Rog\\eclipse\\java-2020-09\\eclipse\\Automation_Practice\\Images\\shop2.png");

		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
		clickTheElement(logout);
		navigation("refresh");
		close();

	}
}

package com.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static  WebDriver driver;
	public static WebDriver getDriver(String browserName) {
     try {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		 else if (browserName.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
		 else if (browserName.equalsIgnoreCase("ie")) {
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver = new InternetExplorerDriver();
		}
		 else if (browserName.equalsIgnoreCase("edge")) {
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		     driver = new EdgeDriver();
		 }
	} catch (Exception e) {
		e.printStackTrace();
	}
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     return driver;
	} 
     
	//Get url
	public static void geturl(String url) {
          try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// send keys
	public static void inputValueElement(WebElement element, String value) {
      try {
		element.sendKeys(value);
	} catch (Exception e) {
		e.printStackTrace();
	}
      
      
	}
	
	public static void clickTheElement(WebElement element ) {
      try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	// close
	public static void close() {
      try {
		driver.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	//Quit
	public static void quit() {
    try {
		driver.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	// Navigation
	public static void navigation(String value) {
      try {
		if (value.equalsIgnoreCase("back")) {
		         driver.navigate().back();		
		}
		  else if (value.equalsIgnoreCase("forward")) {
			    driver.navigate().forward();
		}
		  else if (value.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
		  else if (value.equalsIgnoreCase("to")) {
			driver.navigate().to(value);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	// Alert
	
public static void alert(String value) {
  try {
	if (value.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
		
	}
	  else if (value.equalsIgnoreCase("dismiss")) {
		driver.switchTo().alert().dismiss();
		
	}
	  else if (value.equalsIgnoreCase("sendkeys")) {
	   driver.switchTo().alert().sendKeys("");	
	}
} catch (Exception e) {
	e.printStackTrace();
}
}

//Actions for mouse based Actions

public static void actionMethods(WebElement element,String value) {
  Actions a = new Actions(driver);
  try {
	if (value.equalsIgnoreCase("click")) {
		  a.click(element).build().perform();
	}
	  else if (value.equalsIgnoreCase("contextclick")) {
	    a.contextClick(element).build().perform();	;
	}
	  else if (value.equalsIgnoreCase("doubleclick")) {
		a.doubleClick(element).build().perform();
	}
	  else if (value.equalsIgnoreCase("moveToElement")) {
	   a.moveToElement(element).build().perform();	
	}
} catch (Exception e) {
	e.printStackTrace();
}
  
 
}
//Robot class
public static void keyboardHanling(String value) throws AWTException {
Robot r = new Robot();
try {
	if (value.equalsIgnoreCase("Enter")) {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	else if (value.equalsIgnoreCase("Down")) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	else if (value.equalsIgnoreCase("Up")) {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
} catch (Exception e) {
	e.printStackTrace();
}

}


public static void title(String value) {
try {
	if (value.equalsIgnoreCase("title")) {
		String title = driver.getTitle();
		System.out.println("Title of the Page:"+title);
		
	}
	else if (value.equalsIgnoreCase("currentUrl")) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url of the Page is:"+currentUrl);
		
	}
	else if (value.equalsIgnoreCase("")) {
	}
} catch (Exception e) {
	e.printStackTrace();
}
}
	//wait
  public static void waiting() throws Throwable {
   try {
	driver.wait();
} catch (InterruptedException e) {
	e.printStackTrace();
}
}
  // implicity wait
  public static void implicit_Wait(long  value) {
     
    	 try {
			driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static  void handling(String value) {
	try {
		if (value.equalsIgnoreCase("getWindowHandles")) {
			String windowHandle = driver.getWindowHandle();
			driver.switchTo().window(windowHandle);
}

		else if (value.equalsIgnoreCase("getwindowHandles")) {
			Set<String> all_Id = driver.getWindowHandles();
			for (String id : all_Id) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println("All Ids of the windows"+title);
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	

}
// Screenshot
public static void screenshot(String path) throws Throwable {
   TakesScreenshot snaps = (TakesScreenshot)driver;
   File source = snaps.getScreenshotAs(OutputType.FILE);
   File destination = new File(path);
   FileUtils.copyFile(source, destination);
		   
}

//   *******JavaScriptting******
public static void scripting(WebElement element, String value) {
 JavascriptExecutor js = (JavascriptExecutor)driver;
 try {
	if (value.equalsIgnoreCase("scrolldown")) {
	 js.executeScript("arguments[0].scrollIntoView();", element);
	 
	 }
	 else if (value.equalsIgnoreCase("scrollup")) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	 else if (value.equalsIgnoreCase("click")) {
        js.executeScript("arguments[0].click();", element);
	}
} catch (Exception e) {
	e.printStackTrace();
}
}

//DROP DOWN
public static void dropDown(String values, String type, WebElement element) {
    Select s = new Select(element);
    if (type.equalsIgnoreCase("byIndex")) {
		int parseInt = Integer.parseInt(values);
		s.selectByIndex(parseInt);
	}

    else if (type.equalsIgnoreCase("byValue")) {
		s.selectByValue(values);
	}	
    else if (type.equalsIgnoreCase("byVisibleText")) {
		s.selectByVisibleText(values);
	}
    else {
		System.out.println("DropDown is not selected Here");
	}
} 




 public void check(WebElement element, String value) {
      try {
		if (value.equalsIgnoreCase("isdisplayed")) {
			element.isDisplayed();
		}

		  else if (value.equalsIgnoreCase("isenabled")) {
			element.isEnabled();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 

//Frames
  public static void frameWindow( String type,String value, String Id,WebElement element ) {
		
	  if (type.equalsIgnoreCase("byIndex")) {
		  int parseInt = Integer.parseInt(value);
		driver.switchTo().frame(parseInt);
	}
	  else if (type.equalsIgnoreCase("byId")) {
		driver.switchTo().frame(Id);
	}
	  else if (type.equalsIgnoreCase("byWebElement")) {
		driver.switchTo().frame(element);
	}
	  else {
		System.out.println("No frame Window");
	}
   
}
 public static void sleep(long value) throws Throwable {
             Thread.sleep(value);
}
 

 public static void clearSelected(WebElement element ) {
  element.clear();
 }
}




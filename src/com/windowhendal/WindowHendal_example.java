package com.windowhendal;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHendal_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="F:\\java\\geckodriver-v0.19.1-win64\\geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://seleniumwebdriverfaq.tumblr.com/");
		String windowhandle=driver.getWindowHandle();
		
		System.out.println("window handle " + windowhandle);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector(".avatar-image")).click();
		
		Set<String> multiplehandle=driver.getWindowHandles();
		
		System.out.println("multiple handles " + multiplehandle);
		for (String windowhandles:driver.getWindowHandles()){
			driver.switchTo().window(windowhandles);
			Thread.sleep(5000);
			System.out.println("next window title : "+ driver.getTitle());
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				{
			
		}
		
		
		
		
		

	}

}

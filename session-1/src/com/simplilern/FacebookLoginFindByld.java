package com.simplilern;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
public class FacebookLoginFindByld {

	public static void main(String[] args) {
		
		String path= "D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        
        ///initiate the driver
        WebDriver driver= new ChromeDriver();
        ///step:2 base url
        String base_url= "http://www.facebook.com/";
        ///step:3 launching facebook
        driver.get(base_url);
        
        WebElement email= driver.findElement(By.id("email"));
        email.getAttribute("placeholder");
        
        System.out.println(email.getAttribute("placeholder"));
        
        WebElement password= driver.findElement(By.id("pass"));
        password.getAttribute("placeholder");
        
        System.out.println(password.getAttribute("placeholder"));
        
        email.sendKeys("nikunj@gmail.com");
         
        password.sendKeys("nikunj@123");
         
        WebElement login= driver.findElement(By.name("login"));
        login.click();
        
        //driver.close();

	}

}

package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pagefactory {
	
	WebDriver driver;
	
	@FindBy(name="username")
		WebElement uname;
	
	@FindBy(name="password")
		WebElement pword;
	
	@FindBy(xpath="//button[@type='submit']")
		WebElement submitbutton;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
		WebElement dashboard;
	
	public void enterusername( String username) {
		uname.sendKeys(username);
		
	}
	public void enterpassword( String password) {
		pword.sendKeys(password);
		
	}
	public void clickonsubmit() {
		submitbutton.click();
		
	}
	public boolean dashboarddisplayed() {
		return dashboard.isDisplayed();
	}
	
}

	
	
	


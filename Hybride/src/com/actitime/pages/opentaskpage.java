package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseTest;

public class opentaskpage
{
	@FindBy(xpath="//a[text()='Users']")
	private WebElement userslink;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	public WebElement projandcust;
	
	public opentaskpage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickusersTab()
	{
		userslink.click();
	}
	
	public void clickprojandcust()
	{
		projandcust.click();
	}
	
}

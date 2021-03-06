package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseTest;

public class addnewcustomerpage
{
@FindBy(xpath="//input[@name='name']")
private WebElement custname;


	public addnewcustomerpage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	public WebElement custnametb()
	{
		return custname;
	}
	
	
}

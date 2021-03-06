package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseTest;

public class activeprojectsandcustomerspage 
{
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addnewcustbtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement successmsg;
	
	public activeprojectsandcustomerspage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void addnewcustomerbtn()
	{
		addnewcustbtn.click();
	}
	
	public WebElement getsuccess()
	{
		return successmsg;
	}
	
	public String getsuccessmsg()
	{
		return successmsg.getText();
	}
}

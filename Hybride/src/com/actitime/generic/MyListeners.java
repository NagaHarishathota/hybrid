package com.actitime.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener
{
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log(result.getName()+"Test Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log(result.getName()+"Test Success", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log(result.getName()+"Test Failed", true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.screenshot("C:\\Assignment\\Selenium assig\\Hybride\\Screenshots\\"+result.getName()+".png");;
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log(result.getName()+"Test Skipped", true);
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		Reporter.log(context.getName()+"Test Finished", true);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		Reporter.log(context.getName()+"Test Started", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}

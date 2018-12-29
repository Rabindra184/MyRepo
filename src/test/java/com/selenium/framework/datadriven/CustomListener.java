package com.selenium.framework.datadriven;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter implements IInvokedMethodListener{

	public void onTestFailure(ITestResult tr){
		TestBase.APPLICATION_LOG.debug("Fail..."+tr.getName());
	}
	
	public void onTestSkipped(ITestResult tr) {
		TestBase.APPLICATION_LOG.debug("skip..."+tr.getName());

	}
	
	public void onTestSuccess(ITestResult tr){
		TestBase.APPLICATION_LOG.debug("Pass..."+tr.getName());

	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		
	}
	
	}
			
	



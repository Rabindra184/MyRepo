package com.selenium.framework.datadriven.suiteB;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.selenium.framework.datadriven.TestBase;
import com.selenium.framework.util.Constants;
import com.selenium.framework.util.TestDataProvider;

public class Test1 extends TestBase{
	
	/*@BeforeTest
	public void initLogs(){
		initLogs(this.getClass());
	}*/
	
	@Test(dataProviderClass=TestDataProvider.class,dataProvider="suiteBDataProvider")
	public void test1(Hashtable<String,String> table){
		/*
		Xls_Reader xls = new Xls_Reader("D:\\Ashish\\Frameworks\\Rediff_Framework\\Suite.xlsx");
		System.out.println(Utility.isSuiteRunnable("SuiteA", xls));
		System.out.println(Utility.isSuiteRunnable("SuiteB", xls));

		System.out.println(Utility.isSuiteRunnable("SuiteC", xls));
		Xls_Reader xls1 = new Xls_Reader("D:\\Ashish\\Frameworks\\Rediff_Framework\\SuiteA.xlsx");

		System.out.println(Utility.isTestCaseRunnable("Test1", xls1));
		*/
		validateRunmodes("Test1", Constants.SECOND_SUITE, table.get("Runmode"));
	}
	
	

}

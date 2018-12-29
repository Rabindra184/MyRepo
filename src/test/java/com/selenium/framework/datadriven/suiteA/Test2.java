package com.selenium.framework.datadriven.suiteA;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.selenium.framework.datadriven.TestBase;
import com.selenium.framework.util.Constants;
import com.selenium.framework.util.TestDataProvider;

public class Test2 extends TestBase {
	
	@Test(dataProviderClass=TestDataProvider.class,dataProvider="suiteADataProvider")
	public void test2(Hashtable<String,String> table){
		
		validateRunmodes("Test2","SuiteA",table.get(Constants.RUNMODE_COL));
	}
		
}

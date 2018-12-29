package com.selenium.framework.datadriven.suiteA;
import java.util.Hashtable;
import org.testng.annotations.Test;
import com.selenium.framework.datadriven.TestBase;
import com.selenium.framework.util.Constants;
import com.selenium.framework.util.TestDataProvider;

public class Test1 extends TestBase {
	
	@Test(dataProviderClass=TestDataProvider.class,dataProvider="suiteADataProvider")
	public void test1(Hashtable<String,String> table){
		
	APPLICATION_LOG.debug("Executing the Test1");
		
		validateRunmodes("Test1","SuiteA",table.get(Constants.RUNMODE_COL));
	}
		
		/*Xls_Reader xls= new Xls_Reader("C:\\Users\\RABINDRA\\Desktop\\Interview Folder\\New folder\\Suite.xlsx");
		
			
		//System.out.println(Utility.isSuiteRunnable("SuiteA", xls));
		//System.out.println(Utility.isSuiteRunnable("SuiteB", xls));
		//System.out.println(Utility.isSuiteRunnable("SuiteC", xls));
		
		
		Xls_Reader xls1= new Xls_Reader("C:\\Users\\RABINDRA\\Desktop\\Interview Folder\\New folder\\suiteA.xlsx");
		
		//System.out.println(Utility.isTestCaseRunnable("Test1", xls1));
		//System.out.println(Utility.isTestCaseRunnable("Test2", xls1));
		//System.out.println(Utility.isTestCaseRunnable("Test3", xls1));
		
	}*/
	
}

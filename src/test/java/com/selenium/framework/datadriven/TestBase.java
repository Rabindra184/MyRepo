package com.selenium.framework.datadriven;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.selenium.framework.util.Constants;
import com.selenium.framework.util.Utility;
import com.selenium.framework.util.Xls_Reader;

public class TestBase 
{
  
	public static Properties prop;
	public static Logger APPLICATION_LOG = Logger.getLogger("devpinoyLogger");
	
	
	/*public void initLogs(Class<?> class1){

		FileAppender appender = new FileAppender();
		// configure the appender here, with file location, etc
		//appender.setFile(System.getProperty("user.dir")+"//target//reports//"+CustomListener.resultFolderName+"//"+class1.getName()+".log");
		appender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
		appender.setAppend(false);
		appender.activateOptions();

		APPLICATION_LOG = Logger.getLogger(class1);
		APPLICATION_LOG.setLevel(Level.DEBUG);
		APPLICATION_LOG.addAppender(appender);
	}*/
	
	public static void init(){
		if(prop == null){
			String path=System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties";
			
			 prop = new Properties();
			try {
				FileInputStream fs = new FileInputStream(path);
				prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
    public void validateRunmodes(String testName,String suiteName,String dataRunmodes)
    {
        boolean issuiteRunmode=   Utility.isSuiteRunnable(suiteName,new Xls_Reader(prop.getProperty("xlsFileLocation")+"Suite.xlsx"));

        boolean istestRunmode=   Utility.isTestCaseRunnable(testName,new Xls_Reader(prop.getProperty("xlsFileLocation")+suiteName+".xlsx"));
 
        boolean dataSetRunmode=false;
		if(dataRunmodes.equals(Constants.RUNMODE_YES))
			dataSetRunmode=true;
		
		if(!(issuiteRunmode && istestRunmode && dataSetRunmode)){
			APPLICATION_LOG.debug("Skipping the test "+testName+" inside the suite "+ suiteName);
			throw new SkipException("Skipping the test "+testName+" inside the suite "+ suiteName);
		}
        	
        }
    
    
    }


package Jibe_PURC_ADMIN;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Jibe_PURC_ADMIN.SetItemsMinMaxQty;
import common_Function.WebDriverPass;




public class SetItemsMinMaxQtysTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;

	
	SetItemsMinMaxQty w = new SetItemsMinMaxQty();

	   @Test(priority=17)
	  public void MinMaxQuantityURL() throws Exception {
		try{
		   test=report.startTest("Min Max Quantity URL");	
		   w.MinMaxQuantityURL(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,81,7,pass);
		   write_data.writedata(2,81,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,81,7,fail);
			 write_data.writedata(2,81,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		   test.log(LogStatus.PASS, "Purchase-->Admin-->Min Max Quantity URL"); 
			  System.out.println("Set Items Min Max Quantity URL open successfully");
	  }
	   @Test(priority=18)
	   public void SearchCatalogueItems() throws Exception {
		   try{
	 	   test=report.startTest("Catalogue Item");	  
	 	   w.SearchCatalogueItems(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,84,7,pass);
		   write_data.writedata(2,84,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,84,7,fail);
			 write_data.writedata(2,84,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Catalogue Item"); 
	 	 System.out.println("Catalogue Item Method is executed successfully ");
	   }
	  
	
	   @AfterMethod
	 	public void afterMethod(ITestResult result) {
	 	    if (result.getStatus() == ITestResult.FAILURE) {
	 	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	 	    } else if (result.getStatus() == ITestResult.SKIP) {
	 	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	 	    } else {
	 	        test.log(LogStatus.PASS, "Test passed");
	 	    }
	 	    report.endTest(test);
	 	    report.flush();
	 }
	  @BeforeSuite
	  public void beforeSu() {
		  report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		  		  }
	  
	 /* @AfterSuite
	 public void afterSu() {
	      report.close();
	  }*/
	   
	   
	   
	}

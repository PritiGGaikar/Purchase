package Jibe_PURC_ADMIN;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Jibe_PURC_ADMIN.PurchaseSettings;
import common_Function.WebDriverPass;



public class PurchaseSettingsTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	PurchaseSettings w = new PurchaseSettings();
	
	  @Test(priority=35)
	  public void PurchaseConfigsettingsURL() throws Exception {
		  try{
		   test=report.startTest("Purchase Config settingsURL");	  
		   w.PurchaseConfigsettingsURL(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,170,7,pass);
		   write_data.writedata(2,170,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,170,7,fail);
			 write_data.writedata(2,170,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Config settings URL"); 
		  System.out.println("Purchase settings URL open successfully");
		  
	  }

		 @Test(priority=36)
		   public void PurchaseAutoSetting() throws Exception {
			 try{
			   test=report.startTest("Purchase Auto Setting");	  
			   w.PurchaseAutoSetting(driver);
			   Assert.assertTrue(true);
			   write_data.writedata(2,176,7,pass);
			   write_data.writedata(2,176,6,pass);
			}
			catch(Exception e){			  
				String exception=e.getMessage();
				 write_data.writedata(2,176,7,fail);
				 write_data.writedata(2,176,6,exception);
				 Assert.assertTrue(false);	
			
		 }	
			  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Auto Setting"); 
			  System.out.println("Purchase Auto Setting is executed successfully ");
			 	
		  }   
	  @Test(priority=37)
	   public void PurchaseConfigSetting() throws Exception {
		  try{
		   test=report.startTest("Perchase Config Setting");	  
		   w.PurchaseConfigSetting(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,175,7,pass);
		   write_data.writedata(2,175,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,175,7,fail);
			 write_data.writedata(2,175,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Config Setting");
		  System.out.println("Perchase Config Setting is executed successfully ");
		 
	  }
	   
	   @Test(priority=38)
	   public void PurchaseMandatory() throws Exception {
          try{
		   test=report.startTest("PurchaseMandatory");	  
		   w.PurchaseMandatory(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,181,7,pass);
		   write_data.writedata(2,181,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,181,7,fail);
			 write_data.writedata(2,181,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Mandatory"); 
		  System.out.println("Purchase Mandatory is executed successfully ");
		  
	  }
	   @Test(priority=39)
	   public void CaptureRank() throws Exception {
          try{
		   test=report.startTest("CaptureRank");	  
		   w.CaptureRank(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,173,7,pass);
		   write_data.writedata(2,173,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,173,7,fail);
			 write_data.writedata(2,173,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Capture Rank"); 
		  System.out.println("Capture Rank is executed successfully ");
		 
	  }
	   @Test(priority=40)
	   public void AutomaticRequisition() throws Exception {
             try{
		   test=report.startTest("AutomaticRequisition");	  
		   w.AutomaticRequisition(driver);
		   Assert.assertTrue(true);
		  
		}
		catch(Exception e){			  
			e.getMessage();
			
			 Assert.assertTrue(false);	
		
	 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Automatic Requisition"); 
		  System.out.println("Positive Test Case for Automatic Requisition is executed successfully ");
		 	
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
		   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 		  
	   
	  /* @AfterSuite
	  public void afterSu() {
	       report.close();
	   }*/
	}
	}
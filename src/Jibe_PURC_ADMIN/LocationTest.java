package Jibe_PURC_ADMIN;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test; 

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Jibe_PURC_ADMIN.Location;
import common_Function.RW;
import common_Function.WebDriverPass;



public class LocationTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	Location w = new Location();

	 @Test(priority=9)
	   public void LocationsURL() throws Throwable {
		 try{
		   test=report.startTest("Location URL");	  
		   w.LocationsURL(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,45,7,pass);
		   write_data.writedata(2,45,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,45,7,fail);
			 write_data.writedata(2,45,6,exception);
			 Assert.assertTrue(false);	
		
	 }		 	 
		  System.out.println("Location URL Opened Successfully");	   	   
		   test.log(LogStatus.PASS, "Purchase->Admin->Location URL"); 	   
	 }
	  
	   @Test(priority=10)
	   public void ValidationforAddNewLocation() throws Exception {
		   try{
		   test=report.startTest("Validation for Add New Location");	  
		   w.ValidationforAddNewLocation(driver);  
		   Assert.assertTrue(true);	 	
		   write_data.writedata(2,48,7,pass);
		   write_data.writedata(2,48,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,48,7,fail);
			 write_data.writedata(2,48,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		   System.out.println("Validation for Add New Location is Executed Successfully");
		   test.log(LogStatus.PASS, "Purchase->Admin->Validation for Add New Location"); 
		  	
	 }
	    

	   @Test(priority=11)
	    public void DuplicateAddNewLocation() throws Exception {
		   try{
	 	   test=report.startTest("Duplicate Add New Location");	  
	 	   w.DuplicateAddNewLocation(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,57,7,pass);
		   write_data.writedata(2,57,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,57,7,fail);
			 write_data.writedata(2,57,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	   System.out.println("Duplicate Add New Location is Executed Successfully"); 	
	 	   test.log(LogStatus.PASS, "Purchase->Admin->Duplicate Add New Location");
	 	 
	   }
	   @Test(priority=12)
	   public void SearchAddNewLocation() throws Exception {
		   try{
		   test=report.startTest("Search Added New Location");	  
		   w.SearchAddNewLocation(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,63,7,pass);
		   write_data.writedata(2,63,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,63,7,fail);
			 write_data.writedata(2,63,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		   System.out.println("Search Added New Location is Executed Successfully"); 	
		   test.log(LogStatus.PASS, "Purchase->Admin->Search Added New Location"); 
		  
	 }
	   @Test(priority=13)
	   public void EditLocation() throws Exception {
          try{
		   test=report.startTest("EditLocation");	  
		   w.EditLocation(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,66,7,pass);
		   write_data.writedata(2,66,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,66,7,fail);
			 write_data.writedata(2,66,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		   System.out.println("Edit Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Edit Location"); 
		 
	  }

	   @Test(priority=14)
	   public void SearchEditLocation() throws Exception {
		   try{
		   test=report.startTest("Search Edited Location");	  
		   w.SearchEditLocation(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,71,7,pass);
		   write_data.writedata(2,71,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,71,7,fail);
			 write_data.writedata(2,71,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		   System.out.println("Search Edited Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Search Edited Location"); 
		 
		  
	  }
	   @Test(priority=15)
	   public void DeleteLocation() throws Exception {
		   try{
		   test=report.startTest("DeleteLocation");	  
		   w.DeleteLocation(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,74,7,pass);
		   write_data.writedata(2,74,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,74,7,fail);
			 write_data.writedata(2,74,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		   System.out.println("Delete Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Delete Location"); 
	   }
	   
	   @Test(priority=16)
	   public void SearchDeletedLocation() throws Exception {	
		   try{	   
		   test=report.startTest("Search Deleted Location");	  
		   w.SearchDeleteLocation(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,77,7,pass);
		   write_data.writedata(2,77,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,77,7,fail);
			 write_data.writedata(2,77,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		   System.out.println("Search Deleted Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Search Deleted Location"); 


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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		  }
   
  /* @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}

package Jibe_PURC_ADMIN;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Jibe_PURC_ADMIN.UnitPackings;
import common_Function.WebDriverPass;
import jxl.demo.Write;


public class UnitPackingsTest<UIMap> extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	public UIMap uimap;
	public UIMap datafile;
	public String workingDir;
	
	HSSFWorkbook workbook;	
	HSSFSheet sheet;
	Map<String,Object[]> TestNGResults;
	
	UnitPackings w = new UnitPackings();
	


	   @Test(priority=19)
	   public void UnitPackingURL() throws Exception {
		   try{
		   test=report.startTest("Unit Packing URL");	  
		   w.UnitPackingURL(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,93,7,pass);
		   write_data.writedata(2,93,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,93,7,fail);
			 write_data.writedata(2,93,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Unit Packing URL"); 
		  System.out.println("Unit Packing URL open successfully");
		 	  
	  }

	
	   @Test(priority=20)
	   public void ValidationforAddUnitPacking() throws Exception {
		   try{
	 	   test=report.startTest("Validation for Add Unit Packing");	  
	 	   w.ValidationforAddUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,96,7,pass);
		   write_data.writedata(2,96,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,96,7,fail);
			 write_data.writedata(2,96,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Validation for Add Unit Packing"); 
	 	 System.out.println("Validation for Add Unit Packing is executed successfully ");
	 	
	   }
	   
	   @Test(priority=21)
	   public void DuplicateAddUnitPacking() throws Exception {
	   try{
	 	   test=report.startTest("Duplicate Add Unit Packing");	  
	 	   w.DuplicateAddUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	    write_data.writedata(2,103,7,pass);
		   write_data.writedata(2,103,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,103,7,fail);
			 write_data.writedata(2,103,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Duplicate Add Unit Packing"); 
	 	 System.out.println("Duplicate Add Unit Packing is executed successfully ");
	 	
	   }
	   
	   @Test(priority=22)
	   public void SearchAddedUnitPacking() throws Exception {
		   try{
	 	   test=report.startTest("Search Added Unit Packing");	  
	 	   w.SearchAddedUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,108,7,pass);
		   write_data.writedata(2,108,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,108,7,fail);
			 write_data.writedata(2,108,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Added Unit Packing"); 
	 	 System.out.println("Search Added Unit Packing is executed successfully ");
		   }
	   

	  
	   @Test(priority=23)
	   public void EditUnitPacking() throws Exception {
		   try{
	 	   test=report.startTest("Edit Unit Packing");	  
	 	   w.EditUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,111,7,pass);
		   write_data.writedata(2,111,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,111,7,fail);
			 write_data.writedata(2,111,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit Unit Packing"); 
	 	 System.out.println("Edit Unit Packing is executed successfully ");
	 	
	   }

	   @Test(priority=24)
	   public void SearchEditUnitPacking() throws Exception {
		   try{
	 	   test=report.startTest("Search Edited Unit Packing");	  
	 	   w.SearchEditUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,117,7,pass);
		   write_data.writedata(2,117,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,117,7,fail);
			 write_data.writedata(2,117,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	   
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Edited Unit Packing"); 
	 	 System.out.println("Search Edites Unit Packing is executed successfully ");
	 	
	   }
	   
	   
	   @Test(priority=25)
	   public void DeleteUnitPacking() throws Exception {
		   try{
	 	   test=report.startTest("Delete Unit Packing");	  
	 	   w.DeleteUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,120,7,pass);
		   write_data.writedata(2,120,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,120,7,fail);
			 write_data.writedata(2,120,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Unit Packing"); 
	 	 System.out.println("Delete Unit Packing is executed successfully ");
	 	
	   }
	   
	   @Test(priority=26)
	   public void SearchDeletedtUnitPacking() throws Exception {
		   try{
	 	   test=report.startTest("Search Deleted Unit Packing");	  
	 	   w.SearchDeletedtUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,123,7,pass);
		   write_data.writedata(2,123,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,123,7,fail);
			 write_data.writedata(2,123,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Deleted Unit Packing Unit Packing"); 
	 	 System.out.println("Search Deleted Unit Packing is executed successfully ");
	 	
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
		  report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
	  
	 /* @AfterSuite
	 public void afterSu() {
	      report.close();
	  }*/
	}

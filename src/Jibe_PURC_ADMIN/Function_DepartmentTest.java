package Jibe_PURC_ADMIN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;

public class Function_DepartmentTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	Function_Department w = new Function_Department();
	//test w = new test();
	@Test(priority=41)
	  public void FunctionDepartmentURL() throws Exception {
		try{
		 
		   test=report.startTest("Function Department URL");	  
		   w.FunctionDepartmentURL(driver);
		   Assert.assertTrue(true);
		   write_data.writedata(2,183,7,pass);
		   write_data.writedata(2,183,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,183,7,fail);
			 write_data.writedata(2,183,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Function Department"); 
		  System.out.println("Function Department URL open successfully");
	}
	
	   @Test(priority=42) 
	   public void ValidationforAddFunctionDepartment() throws Exception {
		   try{
	   
	 	   test=report.startTest("Validation for Add Function Department");	  
	 	   w.ValidationforAddFunctionDepartment(driver);
	 	   Assert.assertTrue(true);
	 	  write_data.writedata(2,186,7,pass);
		   write_data.writedata(2,186,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,186,7,fail);
			 write_data.writedata(2,186,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Validation for Add Function Department"); 
	 	 System.out.println("Validation for Add Function Department is executed successfully");
	 	 
	   }
	    @Test(priority=43) 
	   public void DuplicateAddFunctionDepartment() throws Exception {
	    	try{
	 	   test=report.startTest("Duplicate Add Function Department");	  
	 	   w.DuplicateAddFunctionDepartment(driver);	 	  
	 	  Assert.assertTrue(true);
	 	  write_data.writedata(2,195,7,pass);
		   write_data.writedata(2,195,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,195,7,fail);
			 write_data.writedata(2,195,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Duplicate Add Function Department"); 
	 	 System.out.println("DuplicateAdd Function Department is executed successfully");
	 	 
	   }
	  @Test(priority=44) 
	  public void SearchAddFunctionDepartment() throws Exception {
         try{
		   test=report.startTest("Search Added Function Department");	  
		   w.SearchAddFunctionDepartment(driver);
		   Assert.assertTrue(true);
		 	  write_data.writedata(2,201,7,pass);
			   write_data.writedata(2,201,6,pass);
			}
			catch(Exception e){			  
				String exception=e.getMessage();
				 write_data.writedata(2,201,7,fail);
				 write_data.writedata(2,201,6,exception);
				 Assert.assertTrue(false);	
			
		 }	
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Add Function Departmentt"); 
		 System.out.println("Search Added Function Department is executed successfully");
		 
	  }
	   
	   @Test(priority=45)   
	   public void EditFunctionDepartment() throws Exception {
		   try{
	 	   test=report.startTest("Edit Function Department");	  
	 	   w.EditFunctionDepartment(driver);
	 	  Assert.assertTrue(true);
	 	  write_data.writedata(2,205,7,pass);
		   write_data.writedata(2,205,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,205,7,fail);
			 write_data.writedata(2,205,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit Function Department"); 
	 	 System.out.println("Edit Function Department is executed successfully ");
	 	
	   }

	   @Test(priority=46)   
	   public void SearchEditedFunctionDepartment() throws Exception {
           try{
	 	   test=report.startTest("Search Edit Function Department");	  
	 	   w.SearchEditFunctionDepartment(driver);
	 	  Assert.assertTrue(true);
	 	  write_data.writedata(2,211,7,pass);
		   write_data.writedata(2,211,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,211,7,fail);
			 write_data.writedata(2,211,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Edited Function Department"); 
	 	 System.out.println("Search Edited Function Department is executed successfully ");
	 	
	   }
	   
	 @Test(priority=47)
	   
	   public void DeletetFunctionDepartment() throws Exception {
            try{
	 	   test=report.startTest("Delete Function Department");	  
	 	   w.DeletetFunctionDepartment(driver);
	 	  Assert.assertTrue(true);
	 	  write_data.writedata(2,215,7,pass);
		   write_data.writedata(2,215,6,pass);
		}
		catch(Exception e){			  
			String exception=e.getMessage();
			 write_data.writedata(2,215,7,fail);
			 write_data.writedata(2,215,6,exception);
			 Assert.assertTrue(false);	
		
	 }	
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Function Department"); 
	 	 System.out.println("Delete Function Department is executed successfully ");
	 	
	   }
	 @Test(priority=48)
	 
	 public void SearchDeletetFunctionDepartment() throws Exception {
            try{
		   test=report.startTest("Search Delete Function Department");	  
		   w.SearchDeletetFunctionDepartment(driver);
		   Assert.assertTrue(true);
		 	  write_data.writedata(2,219,7,pass);
			   write_data.writedata(2,219,6,pass);
			}
			catch(Exception e){			  
				String exception=e.getMessage();
				 write_data.writedata(2,219,7,fail);
				 write_data.writedata(2,219,6,exception);
				 Assert.assertTrue(false);	
			
		 }	
		 test.log(LogStatus.PASS, "Purchase-->Admin-->Search Delete Function Department"); 
		 System.out.println("Search Deleted Function Department is executed successfully ");
		
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
	   
	 /*  @AfterSuite
	  public void afterSu() {
	       report.close();
	   }*/
	}


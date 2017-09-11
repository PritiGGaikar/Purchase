package Jibe_PURC_ADMIN;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;

public class ItemCategoryTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	ItemCategory w = new ItemCategory();
	

   @Test(priority=49)
  public void ItemCategoryURL() throws Exception {
    try{
	   test=report.startTest("Item Category URL");	  
	   w.ItemCategoryURL(driver);
	   Assert.assertTrue(true);
	   write_data.writedata(2,224,7,pass);
	   write_data.writedata(2,224,6,pass);
	}
	catch(Exception e){			  
		String exception=e.getMessage();
		 write_data.writedata(2,224,7,fail);
		 write_data.writedata(2,224,6,exception);
		 Assert.assertTrue(false);	
	
 }	
	  test.log(LogStatus.PASS, "Purchase-->Admin-->Item Category"); 
	  System.out.println("Item Category URL open successfully");
  }
  
   
   @Test(priority=50)
   public void ValidationforAddNewCategory() throws Exception {
        try{
 	   test=report.startTest("Validation for Add New Category");	  
 	   w.ValidationforAddNewCategory(driver);
 	   Assert.assertTrue(true);
 	  write_data.writedata(2,227,7,pass);
	   write_data.writedata(2,227,6,pass);
	}
	catch(Exception e){			  
		String exception=e.getMessage();
		 write_data.writedata(2,227,7,fail);
		 write_data.writedata(2,227,6,exception);
		 Assert.assertTrue(false);	
	
}	
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Validation for Add New Category");
 	 System.out.println("Item Category URL open successfully");
 	 System.out.println("Validation for for Add New Category is executed successfully ");
 	
   }
  /* 
   @Test(priority=51)
   public void DuplicateAddNewCategory() throws Exception {
        try{
 	   test=report.startTest("Duplicate Add New Category");	  
 	   w.DuplicateAddNewCategory(driver);
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
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Duplicate Add New Category"); 
 	 System.out.println("Duplicate Add New Category is executed successfully ");
 	
   }*/
   @Test(priority=52)
   public void SearchAddNewCategory() throws Exception {
      try{
 	   test=report.startTest("Search Add New Category");	  
 	   w.SearchAddNewCategory(driver);
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
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Added New Category"); 
 	 System.out.println("Search Added New Category is executed successfully ");
 	 
   } 
   
   @Test(priority=53)
   public void EditAddNewCategory() throws Exception {
        try{
 	   test=report.startTest("Edit New Category");	  
 	   w.EditAddNewCategory(driver);
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
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit New Category"); 
 	 System.out.println("Edit New Category is executed successfully ");
 	 
   } 
   @Test(priority=54)
   public void SearchEditAddNewCategory() throws Exception {
         try{
 	   test=report.startTest("Search Edited Add New Category");	  
 	   w.SearchEditAddNewCategory(driver);
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
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Edited Add New Category"); 
 	 System.out.println("Search Edited Add New Category is executed successfully ");
 	 
   } 
   
   @Test(priority=55)
   public void DeleteCategory() throws Exception {
         try{
 	   test=report.startTest("Delete Category");	  
 	   w.DeleteCategory(driver);
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
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Category"); 
 	 System.out.println("Delete Category is executed successfully ");
 	 
   }
   @Test(priority=56)
   public void SearchDeleteCategory() throws Exception {
        try{
 	   test=report.startTest("Search Deleted Category");	  
 	   w.SearchDeleteCategory(driver);
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
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Deleted Category"); 
 	 System.out.println("Search Deleted Category is executed successfully ");
 	 
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

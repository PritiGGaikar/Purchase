package Jibe_PURC_ADMIN;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class Function_Department extends RW{

	 

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	report = new ExtentReports(path.concat("Report\\Purchase_Admin_Report.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}


	public void FunctionDepartmentURL(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;
		   

		 
	     ArrayList<Row> row= OR_Purchase_m.searchSheet("FunctionDepartmentURL",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("FunctionDepartmentURL", 2,0);//Functn key, sheet no,//test data excel
	 	
	     //  URL Path Concat
	     String input_purc_URL =url.concat(input_purc_m.getData(2, 184, 4));
	     
		for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
		
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(TestData).toString();
								  
								  switch(row1.get(j).getCell(TestData).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 

					if (row.get(i).getCell(10) != null) {
						
						String strControlTypeKey = row.get(i).getCell(10).toString();
					//	if (driver.getPageSource().contains("Log Out")) {	
						if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
							
							driver.get(input_purc_URL);
							Thread.sleep(k);
							
							String actualTitle = driver.getTitle().trim();
							
						 	String expectedTitle = " 	Deprtment/Function ".trim();
						 	
							Assert.assertEquals(expectedTitle,actualTitle);
							if(expectedTitle.equals(actualTitle)){
						 		System.out.println("Title Match");
						 		Thread.sleep(k);
						 	}	else{
						 		System.out.println("Title does not Match");
						 		Thread.sleep(k);	
						 		
						 	}
							
						}
						
		}
	}}
	


	public void ValidationforAddFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=3TestData)

		WebDriver driver = driver1;
		           
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("ValidationforAddFunctionDepartment",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("ValidationforAddFunctionDepartment", 2,0);//Functn key, sheet no,//test data excel
	 
	     //  URL Path Concat
	  		//	String input_purc_URL =url.concat(input_purc_m.getData(2, 136, 2));
	  	     
	     for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String LocatorType=row.get(i).getCell(1).getStringCellValue();
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(TestData).toString();
								  
								  switch(row1.get(j).getCell(TestData).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 
				
					
				
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, LocatorType, strControl); 
								Thread.sleep(k);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								
								sendkeys(driver, LocatorType, strControl, strValue);
								Thread.sleep(k);															
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, LocatorType, strControl, strValue); 
								Thread.sleep(k);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, LocatorType, strControl);
								Thread.sleep(k);
								Alert_accept(driver);
								Thread.sleep(k);
							}
							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
								Thread.sleep(k);
							}

							
					}
			}
			}
			}
	
	public void DuplicateAddFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=30)

		WebDriver driver = driver1;
		  
	     ArrayList<Row> row= OR_Purchase_m.searchSheet("DuplicateAddFunctionDepartment",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("DuplicateAddFunctionDepartment", 2,0);//Functn key, sheet no,//test data excel
	 	


	     for (int i = 0; i < row.size(); i++) {
	    	 String LocatorType=row.get(i).getCell(1).getStringCellValue();
				String strValue = "";
				String strControl = row.get(i).getCell(2).getStringCellValue();

				for (int j = 0; j < row1.size(); j++) {

					
					if (row.get(i).getCell(0) != null) {

						
						if (row1.get(j).getCell(2) != null) {

							if (row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString()) == 0) {
								strValue = row1.get(j).getCell(TestData).toString();

								switch (row1.get(j).getCell(TestData).getCellTypeEnum()) {

								case NUMERIC:
									strValue = String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
									break;
								case STRING:
									strValue = row1.get(j).getCell(TestData).getStringCellValue();
									break;
								case BOOLEAN:
									strValue = String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
									break;
								default:
									strValue = row1.get(j).getCell(TestData).getStringCellValue();
									break;
								}

							}
						}
					}

				}
					
				if (row.get(i).getCell(10) != null) {

					String strControlTypeKey = row.get(i).getCell(10).toString();

					if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
						if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
							click_element(driver, LocatorType, strControl);
							Thread.sleep(k);
						}

						if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
							sendkeys(driver, LocatorType, strControl, strValue);
							Thread.sleep(k);
						}

						if (strControlTypeKey.compareTo("Alert_accept") == 0) {
							click_element(driver, LocatorType, strControl);
							Thread.sleep(k);
							Alert_accept(driver);
							Thread.sleep(k);
						}
						if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
							sendkeys(driver, LocatorType, strControl, strValue);
							Thread.sleep(k);
														
						}

						if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
							clear_element(driver, LocatorType, strControl);
							Thread.sleep(k);
						}

						

					}
				}
			}
		}

	public void SearchAddFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=31)

		WebDriver driver = driver1;
			 
	     ArrayList<Row> row= OR_Purchase_m.searchSheet("SearchAddFunctionDepartment",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("SearchAddFunctionDepartment", 2,0);//Functn key, sheet no,//test data excel
	 	    
			for(int i=0;i<row.size();i++)
			{
				String strValue="";
				String LocatorType=row.get(i).getCell(1).getStringCellValue();
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(TestData).toString();
								  
								  switch(row1.get(j).getCell(TestData).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, LocatorType, strControl); 
								Thread.sleep(k);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								
								sendkeys(driver, LocatorType, strControl, strValue);
								Thread.sleep(k);
															
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, LocatorType, strControl, strValue); 
								Thread.sleep(k);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, LocatorType, strControl);
								Thread.sleep(k);
								Alert_accept(driver);
								Thread.sleep(k);
							}
							

							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
								Thread.sleep(k);
							}

							
							
					}
			}
			}
			}
	
		
	public void EditFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=32)

		WebDriver driver = driver1;
		
		 
	     ArrayList<Row> row= OR_Purchase_m.searchSheet("EditFunctionDepartment",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("EditFunctionDepartment", 2,0);//Functn key, sheet no,//test data excel
	 	


		    
			for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String LocatorType=row.get(i).getCell(1).getStringCellValue();
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(TestData).toString();
								  
								  switch(row1.get(j).getCell(TestData).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, LocatorType, strControl); 
								Thread.sleep(k);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								
								sendkeys(driver, LocatorType, strControl, strValue);
								Thread.sleep(k);
								
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, LocatorType, strControl, strValue); 
								Thread.sleep(k);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, LocatorType, strControl); 
								Thread.sleep(k);
								
								Alert_accept(driver);
								Thread.sleep(k);
							}
							
				
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
								Thread.sleep(k);
							}
							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								getAttribute(driver,LocatorType, strControl);
			                      Thread.sleep(k);
								
								
								}
							
							
					}
			}
			}
			}
	
public void SearchEditFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=32)

WebDriver driver = driver1;

 
 ArrayList<Row> row= OR_Purchase_m.searchSheet("SearchEditFunctionDepartment",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
 ArrayList<Row> row1=input_purc_m.searchSheet("SearchEditFunctionDepartment", 2,0);//Functn key, sheet no,//test data excel
	


    
	for(int i=0;i<row.size();i++)
	{
		String strValue=""; 
		String LocatorType=row.get(i).getCell(1).getStringCellValue();
		String strControl=row.get(i).getCell(2).getStringCellValue();
		 for(int j=0;j<row1.size();j++)
		 {
			 if(row.get(i).getCell(0)!=null)
				{
				
				 	if(row1.get(j).getCell(1)!=null)
					{
					  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
					  {
						  strValue=row1.get(j).getCell(TestData).toString();
						  
						  switch(row1.get(j).getCell(TestData).getCellTypeEnum()){
						     
						     case NUMERIC: 
						    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
						    	 break;
						     case STRING:
						    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
						    	 break;
						     case BOOLEAN:
						    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
						    	 break;
						     default:
						    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
						    	 break;
						     }
						     
					  }
					}
				}
		 
		 }
		 
		
			
			if(row.get(i).getCell(10)!=null)
			{
					
				
				String strControlTypeKey=row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						click_element(driver, LocatorType, strControl); 
						Thread.sleep(k);
					}

					if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
						
						sendkeys(driver, LocatorType, strControl, strValue);
						Thread.sleep(k);
						
						
					}

					if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
						sendkeys(driver, LocatorType, strControl, strValue); 
						Thread.sleep(k);
					}

					if (strControlTypeKey.compareTo("Alert_accept") == 0) {
						click_element(driver, LocatorType, strControl); 
						Thread.sleep(k);
						
						Alert_accept(driver);
						Thread.sleep(k);
					}
					
		
					if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
						clear_element(driver, LocatorType, strControl); 																										
						Thread.sleep(k);
					}
					if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
						getAttribute(driver,LocatorType, strControl);
	                      Thread.sleep(k);
						
						
						}
					
					
			}
	}
	}
	}


public void DeletetFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=32)

WebDriver driver = driver1;

 
 ArrayList<Row> row= OR_Purchase_m.searchSheet("DeletetFunctionDepartment",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
 ArrayList<Row> row1=input_purc_m.searchSheet("DeletetFunctionDepartment", 2,0);//Functn key, sheet no,//test data excel
	


    
	for(int i=0;i<row.size();i++)
	{
		String strValue=""; 
		String LocatorType=row.get(i).getCell(1).getStringCellValue();
		String strControl=row.get(i).getCell(2).getStringCellValue();
		 for(int j=0;j<row1.size();j++)
		 {
			 if(row.get(i).getCell(0)!=null)
				{
				
				 	if(row1.get(j).getCell(1)!=null)
					{
					  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
					  {
						  strValue=row1.get(j).getCell(TestData).toString();
						  
						  switch(row1.get(j).getCell(TestData).getCellTypeEnum()){
						     
						     case NUMERIC: 
						    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
						    	 break;
						     case STRING:
						    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
						    	 break;
						     case BOOLEAN:
						    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
						    	 break;
						     default:
						    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
						    	 break;
						     }
						     
					  }
					}
				}
		 
		 }
		 
		
			
			if(row.get(i).getCell(10)!=null)
			{
					
				
				String strControlTypeKey=row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						click_element(driver, LocatorType, strControl); 
						Thread.sleep(k);
					}

					if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
						
						sendkeys(driver, LocatorType, strControl, strValue);
						Thread.sleep(k);
						
						
					}

					if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
						sendkeys(driver, LocatorType, strControl, strValue); 
						Thread.sleep(k);
					}

					if (strControlTypeKey.compareTo("Alert_accept") == 0) {
						click_element(driver, LocatorType, strControl); 
						Thread.sleep(k);
						
						Alert_accept(driver);
						Thread.sleep(k);
						Alert_accept(driver);
					}
					
		
					if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
						clear_element(driver, LocatorType, strControl); 																										
						Thread.sleep(k);
					}
					if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
						getAttribute(driver,LocatorType, strControl);
	                      Thread.sleep(k);
						
						
						}
					
					
			}
	}
	}
	}


public void SearchDeletetFunctionDepartment(WebDriver driver1) throws Exception {  //(priority=32)

WebDriver driver = driver1;

 
 ArrayList<Row> row= OR_Purchase_m.searchSheet("SearchDeletetFunctionDepartment",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
 ArrayList<Row> row1=input_purc_m.searchSheet("SearchDeletetFunctionDepartment", 2,0);//Functn key, sheet no,//test data excel
	


    
	for(int i=0;i<row.size();i++)
	{
		String strValue=""; 
		String LocatorType=row.get(i).getCell(1).getStringCellValue();
		String strControl=row.get(i).getCell(2).getStringCellValue();
		 for(int j=0;j<row1.size();j++)
		 {
			 if(row.get(i).getCell(0)!=null)
				{
				
				 	if(row1.get(j).getCell(1)!=null)
					{
					  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
					  {
						  strValue=row1.get(j).getCell(TestData).toString();
						  
						  switch(row1.get(j).getCell(TestData).getCellTypeEnum()){
						     
						     case NUMERIC: 
						    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getNumericCellValue());
						    	 break;
						     case STRING:
						    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
						    	 break;
						     case BOOLEAN:
						    	 strValue=String.valueOf(row1.get(j).getCell(TestData).getBooleanCellValue());
						    	 break;
						     default:
						    	 strValue=row1.get(j).getCell(TestData).getStringCellValue();
						    	 break;
						     }
						     
					  }
					}
				}
		 
		 }
		 
		
			
			if(row.get(i).getCell(10)!=null)
			{
					
				
				String strControlTypeKey=row.get(i).getCell(10).toString();

				if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
					if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
						click_element(driver, LocatorType, strControl); 
						Thread.sleep(k);
					}

					if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
						
						sendkeys(driver, LocatorType, strControl, strValue);
						Thread.sleep(k);
						
						
					}

					if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
						sendkeys(driver, LocatorType, strControl, strValue); 
						Thread.sleep(k);
					}

					if (strControlTypeKey.compareTo("Alert_accept") == 0) {
						click_element(driver, LocatorType, strControl); 
						Thread.sleep(k);
						
						Alert_accept(driver);
						Thread.sleep(k);
					}
					
		
					if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
						clear_element(driver, LocatorType, strControl); 																										
						Thread.sleep(k);
					}
					if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
						getAttribute(driver,LocatorType, strControl);
	                      Thread.sleep(k);
						
						
						}
					
					
			}
	}
	}
	}
	     
	}

package Jibe_PURC_ADMIN;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;
public class PurchaseQuestionnaire extends RW{

	 

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


	public void PurchaseQuestionnaireURL(WebDriver driver1) throws Exception {  //(priority=26)

		WebDriver driver = driver1;
		
		  ArrayList<Row> row= OR_Purchase_m.searchSheet("PurchaseQuestionnaire",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		  ArrayList<Row> row1=input_purc_m.searchSheet("PurchaseQuestionnaire", 2,0);//Functn key, sheet no, test data excel
		 	 

		    //  URL Path Concat
		  String input_purc_URL =url.concat(input_purc_m.getData(2, 128, 4));
			for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
			{
				if (row.get(i).getCell(0) != null) {

					if (row1.get(j).getCell(1) != null) {
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
					//	if (driver.getPageSource().contains("Log Out")) {	
						if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
							
							driver.get(input_purc_URL);
							Thread.sleep(k);
							
							String actualTitle = driver.getTitle().trim();
							
						 	String expectedTitle = " 	Purchase Questionnaire ".trim();
						 	
							Assert.assertEquals(expectedTitle,actualTitle);
							if(expectedTitle.equals(actualTitle)){
						 		System.out.println("Title Match");
						 		Thread.sleep(k);
						 	}	else{
						 		System.out.println("Title does not Match");
						 		Thread.sleep(k);	
						 		
						 	}
							
						}
						/*else {
							System.out.println("Log out button is not available in page");
						}*/
						
		}
	}}
		

	public void ValidationforAddNewQuestion(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("ValidationforAddNewQuestion",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	    ArrayList<Row> row1=input_purc_m.searchSheet("ValidationforAddNewQuestion", 2,0);//Functn key, sheet no,//test data excel
	 	

	
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
			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();
				
					
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
		
	
	public void DuplicateAddNewQuestion(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("DuplicateAddNewQuestion",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	    ArrayList<Row> row1=input_purc_m.searchSheet("DuplicateAddNewQuestion", 2,0);//Functn key, sheet no,//test data excel
	 	
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
				 
				
			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

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

						getAttribute(driver, LocatorType, strControl);
						Thread.sleep(k);

					}

				}
			}
		}
	}
	public void DeleteNewQuestion(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("DeleteNewQuestion",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	    ArrayList<Row> row1=input_purc_m.searchSheet("DeleteNewQuestion", 2,0);//Functn key, sheet no,//test data excel
	 	
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
				 
				
			if (row.get(i).getCell(10) != null) {

				String strControlTypeKey = row.get(i).getCell(10).toString();

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

						getAttribute(driver, LocatorType, strControl);
						Thread.sleep(k);

					}

				}
			}
		}
	}
				
	
	public void SearchDeleteNewQuestion(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("SearchDeleteNewQuestion",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	    ArrayList<Row> row1=input_purc_m.searchSheet("SearchDeleteNewQuestion", 2,0);//Functn key, sheet no,//test data excel
	 	
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

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, LocatorType, strControl, strValue); 
								Thread.sleep(k);
							}
							

							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
								Thread.sleep(k);
							}
							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {

								sendkeys(driver, LocatorType, strControl, strValue);
								Thread.sleep(k);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, LocatorType, strControl);
								Thread.sleep(k);
								Alert_accept(driver);
								Thread.sleep(k);
							}
							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {

								getAttribute(driver, LocatorType, strControl);
								Thread.sleep(k);

							}
				}
			}
			}
			}
	

	public void ValidationforAddNewGrade(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("ValidationforAddNewGrade",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	    ArrayList<Row> row1=input_purc_m.searchSheet("ValidationforAddNewGrade", 2,0);//Functn key, sheet no,//test data excel
	 	

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
			 
			
		if (row.get(i).getCell(10) != null) {

			String strControlTypeKey = row.get(i).getCell(10).toString();

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

					getAttribute(driver, LocatorType, strControl);
					Thread.sleep(k);

				}

			}
		}
	}
}

	public void DuplicateAddNewGrade(WebDriver driver1) throws Exception {

						WebDriver driver = driver1;

					     ArrayList<Row> row= OR_Purchase_m.searchSheet("DuplicateAddNewGrade",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
					    ArrayList<Row> row1=input_purc_m.searchSheet("DuplicateAddNewGrade", 2,0);//Functn key, sheet no,//test data excel
					 	
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
								

							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
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
							
							
							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {

								getAttribute(driver, LocatorType, strControl);
			                      Thread.sleep(k);
							
					}
							
					}
			}
			}}
					

					
	
	public void DeleteAddedNewGrade(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("DeleteAddedNewGrade",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	    ArrayList<Row> row1=input_purc_m.searchSheet("DeleteAddedNewGrade", 2,0);//Functn key, sheet no,//test data excel
	 	
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
								

							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
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
							
							
							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {

								getAttribute(driver, LocatorType, strControl);
			                      Thread.sleep(k);
							
					}
							
					}
			}
			}}
					

					
	
	}
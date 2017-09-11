package Jibe_PURC_ADMIN;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class test extends RW {
	private static ExtentReports report;

	public synchronized static ExtentReports getReporter(String filePath) {

		if (report == null) {
			report = new ExtentReports(path.concat("Report\\Purchase_Admin_Report.html"));

			report.addSystemInfo("Host Name", "Priti") // Environment Setup For
														// Report
					.addSystemInfo("Environment", "QA");
		}

		return report;
	}

	public void FunctionDepartmentURL(WebDriver driver1) throws Exception { 

			// Get the list of controls used in the AddNewJobs screen
			ArrayList<Row> locator = GetElementrows(driver1);

			// Get Data for the Input Test datassss
			ArrayList<Row> InputTestData = GetInputData(driver1);
						
		
				//-- set input data to the locator 
			NavigateLocators( driver1,  locator,InputTestData);
			
		}
				
		private ArrayList<Row> GetElementrows(WebDriver driver1) throws Exception {

			driver1.get("http://192.168.1.202/STG_VEKTOR/Purchase/PURC_FunctionsLibrary.aspx");

			ArrayList<Row> OR_row = OR_Purchase_m.searchSheet("ValidationforAddFunctionDepartment", 2, 9);// Functn
																			// key,sheetNo.,Column
																			// no.//
																			// Xpath
			return (OR_row);

		}

		private ArrayList<Row> GetInputData(WebDriver driver1) {
			
	        // defined TestData Excel in arraylist
	    ArrayList<Row> Input_row = input_purc_m.searchSheet("ValidationforAddFunctionDepartment", 2,0); 

			return (Input_row);

		}

		private void NavigateLocators(WebDriver driver1, ArrayList<Row> ElementRow, ArrayList<Row> Input_row) throws Exception
		{

			 for(int i=0;i<Input_row.size();i++)
				{
					String strValue=""; 
					String LocatorType=ElementRow.get(i).getCell(1).getStringCellValue();
					String strControl=ElementRow.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<Input_row.size();j++)
					 {
						 if(ElementRow.get(i).getCell(0)!=null)
							{
							
							 	if(Input_row.get(j).getCell(1)!=null)
								{
								  if(ElementRow.get(i).getCell(0).toString().compareTo(Input_row.get(j).getCell(1).toString())==0)
								  {
									  strValue=Input_row.get(j).getCell(4).toString();
									  
									  switch(Input_row.get(j).getCell(4).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(Input_row.get(j).getCell(4).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=Input_row.get(j).getCell(4).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(Input_row.get(j).getCell(4).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=Input_row.get(j).getCell(4).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
					
					
						
						if(ElementRow.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=ElementRow.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver1, LocatorType, strControl); 
									Thread.sleep(k);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
									
									sendkeys(driver1, LocatorType, strControl, strValue);
									Thread.sleep(k);															
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver1, LocatorType, strControl, strValue); 
									Thread.sleep(k);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver1, LocatorType, strControl);
									Thread.sleep(k);
									Alert_accept(driver1);
									Thread.sleep(k);
								}
								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver1, LocatorType, strControl); 																										
									Thread.sleep(k);
								}

								
						}
				}
				}}
		
}
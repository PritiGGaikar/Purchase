
package common_Function;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RW {

	public static String path = "C:\\Users\\Priti\\workspace\\Purchase\\";

	protected int k = 3000;
	protected int TestData = 4;
	public String pass = "PASS";
	public String fail = "FAIL";
	// ---------------------------------Stage-------------------------------//
	public ExcelRead jibe_config = new ExcelRead(path.concat("Excel\\jibe_config.xlsx"));

	public ExcelRead OR_Purchase_m = new ExcelRead(path.concat("Excel\\OR_Purchase_Stage.xlsx"));

	public ExcelRead input_purc_m = new ExcelRead(path.concat("Excel\\Purchase_Input_Stage.xlsx"));

	public WriteExcel write_data = new WriteExcel(path.concat("Excel\\Purchase_Input_Stage.xlsx"));

	/*
	  //------------------------local----------------------------// public
	  ExcelRead jibe_config = new
	 ExcelRead(path.concat("Excel\\jibe_config.xlsx"));
	 
	  public ExcelRead OR_Purchase_m = new
	  ExcelRead(path.concat("Excel\\OR_Purchase_m.xlsx"));
	  
	  public ExcelRead input_purc_m = new
	  ExcelRead(path.concat("Excel\\Purchase_Input.xlsx"));
	  
	  public WriteExcel write_data = new
	  WriteExcel(path.concat("Excel\\Purchase_Input.xlsx"));
	 */
	// public WriteExcel write_data = new
	// WriteExcel(path.concat("Excel\\Purchase_output.xlsx"));

	public String url = jibe_config.getData(0, 1, 1);

	// All Kyeword

	public static String click_element(WebDriver driver, String locatorType, String locatorvalue) throws Exception

	{
		Boolean locatorvalue_enabled = driver.findElement(By.id(locatorvalue)).isEnabled();
		if (locatorvalue_enabled == true) {

			switch (locatorType) {

			case "id":
				driver.findElement(By.id(locatorvalue)).click();
				break;

			case "name":
				driver.findElement(By.name(locatorvalue)).click();
				break;

			case "xpath":
				driver.findElement(By.xpath(locatorvalue)).click();
				break;

			case "linkText":
				driver.findElement(By.linkText(locatorvalue)).click();
				break;

			}
		}
		return null;

	}

	public static String sendkeys(WebDriver driver, String locatorType, String locatorvalue, String pamarValue)
			throws Exception

	{
		Boolean locatorvalue_enabled = driver.findElement(By.id(locatorvalue)).isEnabled();
		if (locatorvalue_enabled == true) {
			switch (locatorType) {

			case "id":
				driver.findElement(By.id(locatorvalue)).sendKeys(pamarValue);
				break;

			case "name":
				driver.findElement(By.name(locatorvalue)).sendKeys(pamarValue);
				break;

			case "xpath":
				driver.findElement(By.xpath(locatorvalue)).sendKeys(pamarValue);
				break;

			case "linkText":
				driver.findElement(By.linkText(locatorvalue)).sendKeys(pamarValue);
				break;

			}
		}
		return null;

	}

	public static String clear_element(WebDriver driver, String locatorType, String locatorvalue) throws Exception

	{
		Boolean locatorvalue_enabled = driver.findElement(By.id(locatorvalue)).isEnabled();
		if (locatorvalue_enabled == true) {
			switch (locatorType) {

			case "id":
				driver.findElement(By.id(locatorvalue)).clear();
				break;

			case "name":
				driver.findElement(By.name(locatorvalue)).clear();
				break;

			case "xpath":
				driver.findElement(By.xpath(locatorvalue)).clear();
				break;

			case "linkText":
				driver.findElement(By.linkText(locatorvalue)).clear();
				break;

			}
		}
		return null;

	}

	public static String frameSwitchto(WebDriver driver, String locatorType, String locatorvalue) throws Exception

	{
		WebElement iframe = driver.findElement(By.id(locatorvalue));
		switch (locatorType) {

		case "id":

			driver.switchTo().frame(iframe);

			break;

		case "name":

			driver.switchTo().frame(iframe);
			break;

		case "xpath":
			driver.switchTo().frame(iframe);
			break;

		case "linkText":
			driver.switchTo().frame(iframe);
			break;

		case "cssSelector":
			driver.switchTo().frame(iframe);
			break;

		}

		return null;

	}

	public static String getAttribute(WebDriver driver, String locatorType, String locatorvalue) throws Exception

	{
		String Value;
		switch (locatorType) {

		case "id":

			Value = driver.findElement(By.id(locatorvalue)).getText();
			System.out.println(Value);
			break;

		case "name":

			Value = driver.findElement(By.name(locatorvalue)).getText();
			System.out.println(Value);
			break;

		case "xpath":

			Value = driver.findElement(By.xpath(locatorvalue)).getText();
			System.out.println(Value);
			break;

		case "linkText":

			Value = driver.findElement(By.linkText(locatorvalue)).getText();
			System.out.println(Value);

			break;

		}

		return null;

	}

	public static String dropdownIndex(WebDriver driver, String locatorType, String locatorvalue, String pamarValue)
			throws Exception

	{

		switch (locatorType) {

		case "id":
			Select dropdown = new Select(driver.findElement(By.id(locatorvalue)));
			dropdown.selectByValue(pamarValue);

		case "name":
			Select dropdown1 = new Select(driver.findElement(By.id(locatorvalue)));
			dropdown1.selectByValue(pamarValue);
			break;

		case "xpath":
			Select dropdown2 = new Select(driver.findElement(By.id(locatorvalue)));
			dropdown2.selectByValue(pamarValue);
			break;

		case "linkText":
			Select dropdown3 = new Select(driver.findElement(By.id(locatorvalue)));
			dropdown3.selectByValue(pamarValue);
			break;
		}

		return null;

	}

	public static String frameSwitchBack(WebDriver driver) throws Exception

	{

		driver.switchTo().defaultContent();

		return null;

	}

	public static String WindowSwitchto(WebDriver driver) throws Exception

	{
		for (String handle : driver.getWindowHandles()) { // Switch to new
															// window
			driver.switchTo().window(handle);
		}
		return null;
	}

	public static String SwitchtoParent(WebDriver driver) throws Exception

	{
		String HandleBefore = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) { // Switch to new
															// window
			driver.switchTo().window(handle);
		}
		driver.switchTo().window(HandleBefore);
		return null;
	}

	public static String Alert_accept(WebDriver driver) throws Exception

	{ // Alert of "Alert"
		Alert alert = driver.switchTo().alert();
		// To read the text from alert
		String Alert = alert.getText();
		System.out.println(" alert :" + Alert);
		alert.accept();
		return null;
	}

	public static String Alert_Dismiss(WebDriver driver) throws Exception

	{// Alert of "Alert"
		Alert alert = driver.switchTo().alert();
		// To read the text from alert
		String Alert = alert.getText();
		System.out.println(" alert :" + Alert);
		alert.dismiss();
		return null;
	}

	public static String refresh(WebDriver driver) throws Exception {

		driver.navigate().refresh();
		return null;

	}

	public static void close_driver(WebDriver driver)

	{
		driver.close();

	}

}

/*
 * public static String radioButton(WebDriver driver, String locatorType, String
 * locatorvalue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue)).click(); break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue)).click(); break;
 * 
 * case "xpath": driver.findElement(By.xpath(locatorvalue)).click(); break;
 * 
 * case "linkText": driver.findElement(By.linkText(locatorvalue)).click();
 * break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * public static String click_element(WebDriver driver, String locatorType,
 * String locatorvalue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue)).click(); break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue)).click(); break;
 * 
 * case "xpath": driver.findElement(By.xpath(locatorvalue)).click(); break;
 * 
 * case "linkText": driver.findElement(By.linkText(locatorvalue)).click();
 * break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * } public static String refresh(WebDriver driver, String locatorType, String
 * locatorvalue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.navigate().refresh();
 * driver.findElement(By.id(locatorvalue)).click();
 * 
 * break;
 * 
 * case "name": driver.navigate().refresh();
 * driver.findElement(By.name(locatorvalue)).click();
 * 
 * break;
 * 
 * case "xpath": driver.navigate().refresh();
 * driver.findElement(By.xpath(locatorvalue)).click();
 * 
 * break;
 * 
 * case "linkText": driver.navigate().refresh();
 * driver.findElement(By.linkText(locatorvalue)).click();
 * 
 * break;
 * 
 * case "cssSelector": driver.navigate().refresh();
 * driver.findElement(By.cssSelector(locatorvalue)).click();
 * 
 * break;
 * 
 * }
 * 
 * return null ;
 * 
 * 
 * } public static String dropdown(WebDriver driver, String locatorType, String
 * locatorvalue,String pamarValue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue)).sendKeys(pamarValue);
 * break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue)).sendKeys(pamarValue);
 * break;
 * 
 * case "xpath":
 * driver.findElement(By.xpath(locatorvalue)).sendKeys(pamarValue); break;
 * 
 * case "linkText":
 * driver.findElement(By.linkText(locatorvalue)).sendKeys(pamarValue); break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * 
 * public static String sendkeys(WebDriver driver, String locatorType, String
 * locatorvalue, String pamarValue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue)).sendKeys(pamarValue);
 * break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue)).sendKeys(pamarValue);
 * break;
 * 
 * case "xpath":
 * driver.findElement(By.xpath(locatorvalue)).sendKeys(pamarValue); break;
 * 
 * case "linkText":
 * driver.findElement(By.linkText(locatorvalue)).sendKeys(pamarValue); break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * 
 * public static String clear_element(WebDriver driver, String locatorType,
 * String locatorvalue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue)).clear(); break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue)).clear(); break;
 * 
 * case "xpath": driver.findElement(By.xpath(locatorvalue)).clear(); break;
 * 
 * case "linkText": driver.findElement(By.linkText(locatorvalue)).clear();
 * break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * 
 * public static String checkbox_element(WebDriver driver, String locatorType,
 * String locatorvalue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue)).click(); break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue)).click(); break;
 * 
 * case "xpath": driver.findElement(By.xpath(locatorvalue)).click(); break;
 * 
 * case "linkText": driver.findElement(By.linkText(locatorvalue)).click();
 * break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * public static String dropdownCheckbox(WebDriver driver, String locatorType,
 * String locatorvalue1,String locatorvalue2,String locatorvalue3) throws
 * Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue1)).click(); // Arrow
 * Thread.sleep(1000); driver.findElement(By.id(locatorvalue2)).click(); //
 * Select CheckBox Thread.sleep(1000);
 * driver.findElement(By.id(locatorvalue3)).click(); // OK Button break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue1)).click(); // Arrow
 * Thread.sleep(1000); driver.findElement(By.name(locatorvalue2)).click(); //
 * Select CheckBox Thread.sleep(1000);
 * driver.findElement(By.name(locatorvalue3)).click(); // OK Button break;
 * 
 * case "xpath": driver.findElement(By.xpath(locatorvalue1)).click(); // Arrow
 * Thread.sleep(1000); driver.findElement(By.xpath(locatorvalue2)).click(); //
 * Select CheckBox Thread.sleep(1000);
 * driver.findElement(By.xpath(locatorvalue3)).click(); // OK Button break;
 * 
 * case "linkText": driver.findElement(By.linkText(locatorvalue1)).click(); //
 * Arrow Thread.sleep(1000);
 * driver.findElement(By.linkText(locatorvalue2)).click(); // Select CheckBox
 * Thread.sleep(1000); driver.findElement(By.linkText(locatorvalue3)).click();
 * // OK Button break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * 
 * public static String uploadFile(WebDriver driver, String locatorType, String
 * locatorvalue1, String locatorvalue2, String path, String locatorvalue3,
 * String locatorvalue4) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue1)).click(); // Add
 * Attachment
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.id(locatorvalue2)).sendKeys(path); // Select File path
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.id(locatorvalue3)).click(); // Upload
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.id(locatorvalue4)).click(); // Close
 * 
 * 
 * break;
 * 
 * case "name": driver.findElement(By.name(locatorvalue1)).click(); // Add
 * Attachment
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.name(locatorvalue2)).sendKeys(path); // Select File
 * path
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.id(locatorvalue3)).click(); // Upload
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.name(locatorvalue4)).click(); // Close
 * 
 * 
 * break;
 * 
 * case "xpath": driver.findElement(By.xpath(locatorvalue1)).click(); // Add
 * Attachment
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.xpath(locatorvalue2)).sendKeys(path); // Select File
 * path
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.id(locatorvalue3)).click(); // Upload
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.xpath(locatorvalue4)).click(); // Close
 * 
 * Thread.sleep(1000);
 * 
 * break;
 * 
 * case "linkText": driver.findElement(By.linkText(locatorvalue1)).click(); //
 * Add Attachment
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.linkText(locatorvalue2)).sendKeys(path); // Select File
 * path
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.id(locatorvalue3)).click(); // Upload
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.linkText(locatorvalue4)).click(); // Close
 * 
 * break;
 * 
 * } Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * 
 * public static String frameSwitchto(WebDriver driver, String locatorType,
 * String locatorvalue) throws Exception
 * 
 * {
 * 
 * System.out.println(locatorType); switch(locatorType) {
 * 
 * case "id":
 * 
 * WebElement iframe1=driver.findElement(By.id(locatorvalue));
 * 
 * driver.switchTo().frame(iframe1); System.out.println(locatorType); break;
 * 
 * case "name": WebElement iframe2=driver.findElement(By.name(locatorvalue));
 * 
 * driver.switchTo().frame(iframe2); break;
 * 
 * case "xpath": WebElement iframe3=driver.findElement(By.xpath(locatorvalue));
 * 
 * driver.switchTo().frame(iframe3); break;
 * 
 * case "linkText": WebElement
 * iframe4=driver.findElement(By.linkText(locatorvalue));
 * 
 * driver.switchTo().frame(iframe4); break;
 * 
 * case "cssSelector": WebElement
 * iframe5=driver.findElement(By.cssSelector(locatorvalue));
 * 
 * driver.switchTo().frame(iframe5); break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * 
 * public static String WindowSwitchto(WebDriver driver) throws Exception
 * 
 * {
 * 
 * for (String handle : driver.getWindowHandles()) { //Switch to new window
 * 
 * driver.switchTo().window(handle);}
 * 
 * Thread.sleep(1000);
 * 
 * return null ;
 * 
 * }
 * 
 * public static String SwitchtoParent(WebDriver driver) throws Exception
 * 
 * {
 * 
 * String HandleBefore = driver.getWindowHandle(); for (String handle :
 * driver.getWindowHandles()) { //Switch to new window
 * 
 * driver.switchTo().window(handle);}
 * 
 * Thread.sleep(1000);
 * 
 * driver.switchTo().window(HandleBefore);
 * 
 * 
 * return null ;
 * 
 * 
 * }
 * 
 * public static String Alert(WebDriver driver) throws Exception
 * 
 * 
 * {// Alert of "Alert" Alert alert = driver.switchTo().alert(); // To read the
 * text from alert String Alert = alert.getText(); //
 * System.out.println(" alert :" + Alert); Thread.sleep(2000); alert.accept();
 * Thread.sleep(6000); return null; }
 * 
 * public static String Alert_WindowSwitch(WebDriver driver) throws Exception
 * 
 * 
 * {// Alert of "Alert" Alert alert = driver.switchTo().alert(); // To read the
 * text from alert String Alert = alert.getText(); System.out.println(" alert :"
 * + Alert); Thread.sleep(2000); alert.accept(); Thread.sleep(6000); //return
 * null;
 * 
 * for (String handle : driver.getWindowHandles()) { //Switch to new window
 * 
 * driver.switchTo().window(handle);}
 * 
 * Thread.sleep(1000);
 * 
 * return null ; }
 * 
 * public static String Alert_Double(WebDriver driver) throws Exception
 * 
 * 
 * {// Alert of "Alert" Alert alert = driver.switchTo().alert(); // To read the
 * text from alert String Alert = alert.getText(); System.out.println(" alert :"
 * + Alert); Thread.sleep(2000); alert.accept(); alert.accept();
 * Thread.sleep(6000); return null; }
 * 
 * public static String gettext(WebDriver driver, String locatorType, String
 * locatorvalue ) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.findElement(By.id(locatorvalue)).getText(); break;
 * 
 * case "name":
 * 
 * driver.findElement(By.name(locatorvalue)).getText(); break;
 * 
 * case "xpath":
 * 
 * driver.findElement(By.xpath(locatorvalue)).getText(); break;
 * 
 * case "linkText":
 * 
 * driver.findElement(By.linkText(locatorvalue)).getText(); break;
 * 
 * }
 * 
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * 
 * 
 * 
 * } public static String AlertDismiss(WebDriver driver) throws Exception
 * 
 * 
 * {// Alert of "Alert" Alert alert = driver.switchTo().alert(); // To read the
 * text from alert String Alert = alert.getText(); System.out.println(" alert :"
 * + Alert); Thread.sleep(2000); alert.dismiss(); Thread.sleep(6000); return
 * null; }
 * 
 * public static String gettext(WebDriver driver, String locatorType, String
 * locatorvalue ,String pamarValue) throws Exception
 * 
 * { String Value; switch(locatorType) {
 * 
 * case "id":
 * 
 * Value=driver.findElement(By.id(locatorvalue)).getText();
 * System.out.println(Value); break;
 * 
 * case "name":
 * 
 * Value= driver.findElement(By.name(locatorvalue)).getText();
 * System.out.println(Value); break;
 * 
 * case "xpath":
 * 
 * Value= driver.findElement(By.xpath(locatorvalue)).getText();
 * System.out.println(Value); break;
 * 
 * case "linkText":
 * 
 * Value=driver.findElement(By.linkText(locatorvalue)).getText();
 * System.out.println(Value);
 * 
 * break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * public static String getAttribute(WebDriver driver, String locatorType,
 * String locatorvalue ,String pamarValue) throws Exception
 * 
 * { String Value; switch(locatorType) {
 * 
 * case "id":
 * 
 * Value=driver.findElement(By.id(locatorvalue)).getText();
 * System.out.println(Value); break;
 * 
 * case "name":
 * 
 * Value= driver.findElement(By.name(locatorvalue)).getText();
 * System.out.println(Value); break;
 * 
 * case "xpath":
 * 
 * Value= driver.findElement(By.xpath(locatorvalue)).getText();
 * System.out.println(Value); break;
 * 
 * case "linkText":
 * 
 * Value= driver.findElement(By.linkText(locatorvalue)).getText();
 * System.out.println(Value);
 * 
 * break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * } public static String frameSwitchto1(WebDriver driver, String locatorType,
 * String locatorvalue) throws Exception
 * 
 * {
 * 
 * System.out.println(locatorType); switch(locatorType) {
 * 
 * case "id":
 * 
 * WebElement iframe1=driver.findElement(By.id(locatorvalue));
 * 
 * driver.switchTo().frame(iframe1); System.out.println(locatorType); break;
 * 
 * case "name": WebElement iframe2=driver.findElement(By.name(locatorvalue));
 * 
 * driver.switchTo().frame(iframe2); break;
 * 
 * case "xpath": WebElement iframe3=driver.findElement(By.xpath(locatorvalue));
 * 
 * driver.switchTo().frame(iframe3); break;
 * 
 * case "linkText": WebElement
 * iframe4=driver.findElement(By.linkText(locatorvalue));
 * 
 * driver.switchTo().frame(iframe4); break;
 * 
 * case "cssSelector": WebElement
 * iframe5=driver.findElement(By.cssSelector(locatorvalue));
 * 
 * driver.switchTo().frame(iframe5); break;
 * 
 * }
 * 
 * Thread.sleep(1000);
 * 
 * return null;
 * 
 * }
 * 
 * public static String Refresh(WebDriver driver) throws Exception{
 * 
 * driver.navigate().refresh(); return null;
 * 
 * }
 * 
 * public static String frameSwitchBack(WebDriver driver, String locatorType,
 * String locatorvalue) throws Exception
 * 
 * {
 * 
 * switch(locatorType) {
 * 
 * case "id": driver.switchTo().defaultContent();
 * driver.findElement(By.id(locatorvalue)).click();
 * 
 * break;
 * 
 * case "name": driver.switchTo().defaultContent();
 * driver.findElement(By.name(locatorvalue)).click();
 * 
 * break;
 * 
 * case "xpath": driver.switchTo().defaultContent();
 * driver.findElement(By.xpath(locatorvalue)).click();
 * 
 * break;
 * 
 * case "linkText": driver.switchTo().defaultContent();
 * driver.findElement(By.linkText(locatorvalue)).click();
 * 
 * break;
 * 
 * case "cssSelector": driver.switchTo().defaultContent();
 * driver.findElement(By.cssSelector(locatorvalue)).click();
 * 
 * break;
 * 
 * }
 * 
 * return null ;
 * 
 * 
 * } public static String frameSwitchBack(WebDriver driver) throws Exception
 * 
 * {
 * 
 * driver.switchTo().defaultContent();
 * 
 * return null ;
 * 
 * 
 * }
 * 
 * public static void close_driver(WebDriver driver)
 * 
 * { driver.close();
 * 
 * }
 */

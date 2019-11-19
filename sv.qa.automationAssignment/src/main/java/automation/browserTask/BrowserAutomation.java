package automation.browserTask;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import automation.helper.propertiesHelper.PropertiesHelper;
import automation.helper.waitHelper.WaitHelper;

public class BrowserAutomation {
	static WebDriver driver;
	static ArrayList excelSheetDataList;

	public static void task() throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", PropertiesHelper.getProperties("chromedriver"));
		driver = new ChromeDriver();
		ArrayList<String> list = new ArrayList<String>();
//		excelSheetDataList = new ArrayList();
		driver.manage().window().maximize();
		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.setImplicitWait(10, TimeUnit.SECONDS);
		driver.get(PropertiesHelper.getProperties("url"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(PropertiesHelper.getProperties("username"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PropertiesHelper.getProperties("password"));
		driver.findElement(By.xpath("//input[@id='loginbtn']")).click();
		driver.findElement(By.xpath("//div[@class='buttons']//form//div")).click();
		list=readCellFromExcel("filename", "sheet1", 1, 8);
		//excelSheetDataList = excelHandler();
		
		driver.findElement(By.xpath("//input[@id='id_name']")).sendKeys(list.get(0));
		driver.findElement(By.xpath("//div[@id='id_descriptioneditable']")).sendKeys(list.get(1));
		dropDownHandle("//select[@id='id_timestart_day']",  list.get(2)); 
		dropDownHandle("//select[@id='id_timestart_month']", list.get(3));
		dropDownHandle("//select[@id='id_timestart_year']", list.get(4));
		dropDownHandle("//select[@id='id_timestart_hour']", list.get(5));
		
		dropDownHandle("//select[@id='id_timestart_minute']",list.get(6));
		
		driver.findElement(By.xpath("//div[@class='felement fcheckbox']//span")).click();
		driver.findElement(By.xpath("//input[@id='id_repeats']")).clear();
		driver.findElement(By.xpath("//input[@id='id_repeats']")).sendKeys(list.get(7));
		driver.findElement(By.xpath("//input[@id='id_submitbutton']")).click();
	}

//	private static ArrayList  excelHandler() throws FileNotFoundException 
//	{
//		FileInputStream fis=new FileInputStream(new File(PropertiesHelper.getProperties("filename")));
//		
//		ArrayList a = new ArrayList();
//		
//
//		XSSFWorkbook wb=null;
//		try {
//			wb = new XSSFWorkbook(fis);
//		} 
//		catch (IOException e) 
//		{
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//		}   
//		XSSFSheet sheet1=wb.getSheetAt(0);
//		Iterator<Row> itr = sheet1.iterator();     //iterating over excel file  
//		itr.next();                               //skips header
//		while (itr.hasNext())                 
//		{  
//		Row row = itr.next();  
//		Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
//		
//		while (cellIterator.hasNext())   
//		{  
//		Cell cell = cellIterator.next();  
//		switch (cell.getCellType())               
//		{  
//		
//		
//		case Cell.CELL_TYPE_STRING:          //field that represents string cell type
//		System.out.print(cell.getStringCellValue() + "\t");  
//		a.add(cell.getStringCellValue());
//		break; 
//		
//		case Cell.CELL_TYPE_NUMERIC:       //field that represents number cell type  
//		//System.out.print(cell.getNumericCellValue() + "\t\t\t");  
//		
//		Double d = cell.getNumericCellValue();
//		Integer integer=d.intValue();
//	    
//		System.out.print(d.intValue()+ "\t");  
//		a.add(d.intValue());
//		break;  
//		default:  
//		}  
//		}  
//		//System.out.println("");  
//		} 
//		//System.out.println("Array :::"+a);  
//		
//		return a;
//	}
	
	private static void dropDownHandle(String webElement, Object object) {
		WebElement element = driver.findElement(By.xpath(webElement));
		Select select = new Select(element);
		select.selectByVisibleText(String.valueOf(object));
	}

	
	public static void exit() {
		driver.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		task();
		exit();
	}
	
	public static ArrayList<String> readCellFromExcel(String filePath, String sheetName, int iRow, int columnCount) {

		InputStream oFile;
		XSSFWorkbook oExcel;
		XSSFSheet oSheet;
		XSSFRow oRow;
		XSSFCell oCell;
		ArrayList<String> list = new ArrayList<String>();
		try {

			oFile = new FileInputStream(PropertiesHelper.getProperties(filePath));
			oExcel = new XSSFWorkbook(oFile);
			oSheet = oExcel.getSheet(sheetName);
			oRow = oSheet.getRow(iRow);
			for (int i = 0; i < columnCount ; i++) {
				oCell = oRow.getCell(i);
			//System.out.println("cell vLUESSSS:::: "+oCell.toString());
				DataFormatter fmt = new DataFormatter();
				// Once per cell
				String valueInExcel = fmt.formatCellValue(oCell); 
				System.out.println("cell vLUESSSS after:::: "+valueInExcel);
				list.add(valueInExcel);
				//list.add(oCell.toString());
			}
			
			oFile.close();
			return list;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}
	
}

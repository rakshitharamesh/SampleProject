package resusable;

public class Reusable {
	package com.macys.mst.d2c.wms.utils;

	import static org.testng.Assert.assertTrue;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Properties;

	import javax.swing.text.html.parser.Entity;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.restassured.response.Response;

	public class Reusables {

		WebDriver driver = null;
		WebDriverWait oWait = null;
		Actions action = null;
		Properties propObj = null;

		public Reusables() throws Exception {
			try {
				this.driver = DriverDefinitions.getDriver();
				this.oWait = DriverDefinitions.getoWait();
				if (this.driver != null) {
					action = new Actions(this.driver);
				}
				propObj = DriverDefinitions.getPropObj();
			} catch (Exception e) {
				throw e;
			}
		}

		public void click(String xpath) throws Exception {
			try {
				oWait.until(ExpectedConditions.elementToBeClickable(By.xpath(getProperty(xpath))));
				driver.findElement(By.xpath(getProperty(xpath))).click();

			} catch (AssertionError | IOException | TimeoutException | NoSuchElementException e) {
				throw e;
			}
		}

		public void clickDynamic(String xpath, String postfix) throws Exception {
			try {
				oWait.until(ExpectedConditions.elementToBeClickable(By.xpath(getProperty(xpath) + postfix)));
				driver.findElement(By.xpath(getProperty(xpath) + postfix)).click();

			} catch (AssertionError | IOException | TimeoutException | NoSuchElementException e) {
				throw e;
			}
		}

		public void sendKeys(String xpath, String value) throws Exception {
			try {
				oWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getProperty(xpath))));
				driver.findElement(By.xpath(getProperty(xpath))).sendKeys(value);

			} catch (AssertionError | IOException | TimeoutException | NoSuchElementException e) {
				throw e;
			}
		}

		public void assertTitleContains(String title) throws Throwable {

			try {
				assertTrue(driver.getTitle().contains(getProperty(title)));

			} catch (AssertionError | IOException e) {
				throw e;
			}
		}

		public void assertTitleEquals(String title) throws Throwable {
			try {
				assertTrue(driver.getTitle().equals(getProperty(title)));

			} catch (AssertionError | IOException e) {
				throw e;
			}
		}

		public void moveOnTo(String xpath) throws Exception {
			try {
				oWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getProperty(xpath))));
				WebElement element = driver.findElement(By.xpath(getProperty(xpath)));
				action.moveToElement(element).perform();

			} catch (AssertionError | IOException | TimeoutException | NoSuchElementException e) {
				throw e;
			}
		}

		public void moveAndClick(String xpath) throws Exception {
			try {
				oWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getProperty(xpath))));
				WebElement element = driver.findElement(By.xpath(getProperty(xpath)));
				action.moveToElement(element).click().perform();

			} catch (AssertionError | IOException | TimeoutException | NoSuchElementException e) {
				throw e;
			}
		}

		public void elementExists(String xpath) throws Exception {
			try {
				oWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getProperty(xpath))));
				WebElement element = driver.findElement(By.xpath(getProperty(xpath)));
				assertTrue(element.isDisplayed());

			} catch (AssertionError | IOException | TimeoutException | NoSuchElementException e) {
				throw e;
			}
		}

		public void listLoaded(String xpath) throws Exception {
			try {
				By listXpath = By.xpath("//select[@id='templateName']/option");

				oWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(listXpath, 1));
				List<WebElement> element = driver.findElements(By.xpath(getProperty(xpath)));
				assertTrue(element.size() > 1);

			} catch (AssertionError | IOException | TimeoutException | NoSuchElementException e) {
				throw e;
			}
		}

		public boolean elementExistsTrue(String xpath) throws Exception {

			try {
				oWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getProperty(xpath))));
				WebElement element = driver.findElement(By.xpath(getProperty(xpath)));
				assertTrue(element.isDisplayed());
				return true;

			} catch (Exception e) {
				return false;
			}

		}

		public String getProperty(String key) throws IOException {
			String propertyValue = null;
			try {
				propertyValue = propObj.getProperty(key).toString();
			} catch (Exception e) {
				throw e;
			}
			return propertyValue;
		}

		@SuppressWarnings("unchecked")
		public List<Entity> returnResponseasList(Response resonseBody) {
			List<Entity> resList = new ArrayList<>();
			return resonseBody.body().as(resList.getClass());
		}

//		Excel Read

		public String readCellFromExcel(String filePath, String sheetName, int iRow, int iCell) {

			InputStream oFile;
			XSSFWorkbook oExcel;
			XSSFSheet oSheet;
			XSSFRow oRow;
			XSSFCell oCell;
//			XSSFCell oCell1;
			String value = null;
			try {

				oFile = new FileInputStream(getProperty(filePath));
				oExcel = new XSSFWorkbook(oFile);
				oSheet = oExcel.getSheet(sheetName);
				oRow = oSheet.getRow(iRow);
				oCell = oRow.getCell(iCell);
				oCell.setCellType(Cell.CELL_TYPE_STRING);
				value = oCell.getStringCellValue().toString();
				oFile.close();
				return value;

			} catch (Exception e) {

				e.printStackTrace();
			}

			return value;
		}

		public int getRowCount(String filePath, String sheetName) {
			InputStream oFile;
			XSSFWorkbook oExcel = null;
			XSSFSheet oSheet;

			int rowCount = 0;

			try {
				oFile = new FileInputStream(getProperty(filePath));
				oExcel = new XSSFWorkbook(oFile);
				oSheet = oExcel.getSheet(sheetName);
				rowCount = oSheet.getPhysicalNumberOfRows();
				oFile.close();
				return rowCount;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return rowCount;
		}

//		Excel Write
		public void ExcelWrite(String updateValue, String filePath, String sheetName, int iRow, int iCell) {

			InputStream oFile;
			XSSFWorkbook oExcel;
			XSSFSheet oSheet;
			XSSFRow oRow;
			XSSFCell oCell;

			try {

				oFile = new FileInputStream(getProperty(filePath));
				oExcel = new XSSFWorkbook(oFile);
				oSheet = oExcel.getSheet(sheetName);
				oRow = oSheet.getRow(iRow);
				oCell = oRow.getCell(iCell);

				oCell.setCellValue(updateValue);

				OutputStream oFileWrite = new FileOutputStream(getProperty(filePath));
				oExcel.write(oFileWrite);
				oFileWrite.close();
//				oExcel.close();
				oFile.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public ArrayList<String> readColumn(String inputFile, String sheetName, int rowCount, int columnNumber)
				throws IOException {

			InputStream oFile;
			XSSFWorkbook oExcel;
			XSSFSheet oSheet;
			XSSFRow oRow;
			ArrayList<String> list = new ArrayList<String>();

			try {
				oFile = new FileInputStream(getProperty(inputFile));
				oExcel = new XSSFWorkbook(oFile);
				oSheet = oExcel.getSheet(sheetName);

				for (int i = 1; i < rowCount; i++) {
					oRow = oSheet.getRow(i);
					Cell cell = oRow.getCell(columnNumber);
					list.add(cell.toString());
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}

//		Writes list of data in to the excel file at once
		public void writeColumn(String inputFile, String sheetName, ArrayList<String> dataToWrite, int columnNumber)
				throws IOException {

			InputStream oFile;
			XSSFWorkbook oExcel;
			XSSFSheet oSheet;
			XSSFRow oRow;
			XSSFCell oCell;

			try {

				oFile = new FileInputStream(getProperty(inputFile));
				oExcel = new XSSFWorkbook(oFile);
				oSheet = oExcel.getSheet(sheetName);

				for (int i = 1; i <= dataToWrite.size(); i++) {
					oRow = oSheet.getRow(i);
					oCell = oRow.getCell(columnNumber);
					oCell.setCellValue(dataToWrite.get(i - 1));
				}

				OutputStream oFileWrite = new FileOutputStream(getProperty(inputFile));
				oExcel.write(oFileWrite);
				oFileWrite.close();
//				oExcel.close();
				oFile.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

}

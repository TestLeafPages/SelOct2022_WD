package week4.day4.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	
	public static String[][] readData(String ExcelFilename) throws IOException {
//		    1)Open the Workbook using the filename and the path		
//			2)Go to the specific Sheet(by SheetName/Index)
//			3)Go to the specific  Row(by index)
//			4)Go to the specific Column(by index-->Cell)
//			5)Read the Content

		XSSFWorkbook wb = new XSSFWorkbook("data/"+ExcelFilename+".xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);// read the first sheet
		int rowCount = sheet.getLastRowNum();// to find total rowCount
		int columnCount = sheet.getRow(0).getLastCellNum();// to find total number of columns
		System.out.println("Total number of rows:" + rowCount);
		System.out.println("Total number of columns :" + columnCount);

//		XSSFRow row = sheet.getRow(2);
//		XSSFCell cell = row.getCell(0);
		// System.out.println(cell.getStringCellValue());
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row2 = sheet.getRow(i);

			for (int j = 0; j < columnCount; j++) {//looping through each cell of each row
				XSSFCell cell2 = row2.getCell(j);
				System.out.println(cell2.getStringCellValue());
				data[i-1][j]=cell2.getStringCellValue();
			}

		}

		wb.close();
		return data;

	}

}

package day19;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of rows : " + totalRows);
		System.out.println("Number of cells : " + totalCells);
		
		for(int row = 0; row <= totalRows; row++) {
			XSSFRow currentRow = sheet.getRow(row);
			
			for(int cells = 0; cells < totalCells; cells++) {
				XSSFCell cell = currentRow.getCell(cells);
				System.out.print(cell.toString()+ "\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}

package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelSheet {
	
	@Test
  public void workbook() throws Exception {
		
		File src= new File("C:\\Users\\Tezza\\eclipse-workspace\\ExcelData\\TestData.xlsx");
		 
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(1).createCell(2).setCellValue("Pass");
		
		sheet1.getRow(2).createCell(2).setCellValue("fail");
		
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		
		
		wb.close();
	}
}

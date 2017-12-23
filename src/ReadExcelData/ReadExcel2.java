package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2 {
	
	@Test
  public void workbook() throws Exception {
		
		File src= new File("C:\\Users\\Tezza\\eclipse-workspace\\ExcelData\\TestData.xlsx");
		 
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		
		System.out.println("total no. of rows is" + rowcount);
		
		for(int i=0;i<rowcount;i++)
		{
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Test Data from excel is"+ data0);
		}
		wb.close();
	}
}

package ReadExcelData;

import org.testng.annotations.Test;

import lib.ExcelDataConfig;

public class ReadExcelData {
	
	
  @Test
  public void Excel() {
	  
	  ExcelDataConfig excel= new ExcelDataConfig("C:\\Users\\Tezza\\eclipse-workspace\\ExcelData\\TestData.xlsx");
	  
	  System.out.println(excel.getData(0, 0, 0));
  }
}

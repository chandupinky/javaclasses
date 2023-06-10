package framewok1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataprovider 
{
	@DataProvider
	public String [][] excelconcept()throws Exception 
	{
		File f = new File("./src/Testrecourse/Exceldata.xlsx");//to get
		System.out.println(f.exists());
		FileInputStream fis = new FileInputStream(f);//to read raw data
		XSSFWorkbook wb = new XSSFWorkbook(fis);//convert raw data into workbook
		XSSFSheet s = wb.getSheet("Data");
		int rows=s.getPhysicalNumberOfRows();//get total no of rows
		int colmns=s.getRow(0).getLastCellNum();//get colomns
		String [][] data = new String [rows-1][colmns];
		for (int i = 0; i <rows-1; i++)
		{
			for (int j = 0; j < colmns; j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j]=df.formatCellValue(s.getRow(i+1).getCell(j));	   

			}
		}
		wb.close();
		fis.close();

		return data;
	}

}

package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel 
{
	
	public static String getCell(String path,String Sheet,int row,int cell)
	{
		String v="";
		try{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(Sheet).getRow(row).getCell(cell);
		v = c.toString();
		}
		catch(Exception e)
		{
			Reporter.log("Invalid path",true);

		}
		return v;
	}
	

}

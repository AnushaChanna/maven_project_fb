package Utility_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_assign
{
	public static String un;
	public static String pw;

		
		
public void Credentials() throws EncryptedDocumentException, IOException
{
	//FileInputStream file = new FileInputStream("‪C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
			FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Assignments_FB\\DDT\\loginsheet_fb.xlsx");
		 	Workbook w1=WorkbookFactory.create(file);
			un=NumberToTextConverter.toText(w1.getSheet("facebooklogin").getRow(0).getCell(0).getNumericCellValue());
			pw=w1.getSheet("facebooklogin").getRow(0).getCell(1).getStringCellValue();
	 
	
}
}

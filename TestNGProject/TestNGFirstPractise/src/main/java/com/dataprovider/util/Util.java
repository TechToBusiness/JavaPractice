package com.dataprovider.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.dev.XSSFSave;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileSystem;

public class Util {
	static WorkbookUtil xlReader;
	private static FileInputStream fileXL;
	private static XSSFWorkbook xlWorkBook;
	public static XSSFSheet getXLSheetReader(String xlPath, String sheetName)
	{
		
		try {
			fileXL= new FileInputStream("C:\\Selenium\\Learning\\TestNGProject\\TestNGFirstPractise\\src\\main\\java\\com\\dataprovider\\FlightSearchInput.xlsx");
			xlWorkBook=new XSSFWorkbook(fileXL);
			
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = xlWorkBook.getSheet(sheetName);
		return sheet;
	}
	
	public static ArrayList<Object[]> getDataFromSheet(String xlPath, String sheetName)
	{
		XSSFSheet sheet =  getXLSheetReader(xlPath, sheetName);
		ArrayList<Object[]> iterationInput= new ArrayList<Object[]>();
		
		for(int i=1; i <= sheet.getLastRowNum(); i++)
		{
			String fromCity=sheet.getRow(i).getCell(0).getStringCellValue();
			String toCity=sheet.getRow(i).getCell(1).getStringCellValue();
			String travelDate=sheet.getRow(i).getCell(2).toString();
					
			String adultTravellerCount=sheet.getRow(i).getCell(3).getStringCellValue();
			String childrenTravellerCount=sheet.getRow(i).getCell(4).getStringCellValue();
			Object ob[]= {fromCity,toCity,travelDate,adultTravellerCount,childrenTravellerCount};
			iterationInput.add(ob);
		}
		sheet.getRow(2).getCell(2);
		return iterationInput;
	}

}

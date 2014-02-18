package com.example.checkyourself;

import java.io.File;
import java.io.IOException;
import jxl.*;
import jxl.read.biff.BiffException;

public class Registration 
{
	public void newUser () throws IOException, BiffException {
		 
        Workbook workbook = Workbook.getWorkbook(new File("C:/Users/Prachi/My Documents/Georgia Tech/Spring 2014/CS 2340/User Credentials.xls"));
        Sheet sheet = workbook.getSheet(0);
 
        Cell A = sheet.getCell(0,0);
        Cell B = sheet.getCell(1,0);
        Cell C = sheet.getCell(2,0);
 
        String stringA = A.getContents();
        String stringB = B.getContents();
        String stringC = C.getContents();
 
        System.out.println(stringA);
        System.out.println(stringB);
        System.out.println(stringC);
 
    }
}

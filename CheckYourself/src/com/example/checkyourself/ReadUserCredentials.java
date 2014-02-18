package com.example.checkyourself;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUserCredentials 
{		
	public int readLines() throws IOException
	{
		File file = new File("/CheckYourself/src/com/example/checkyourself/User_Credentials");
		FileReader file_to_read = new FileReader(file);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numberOfLines = 0;
		
		while((aLine = bf.readLine()) != null)
		{
			numberOfLines++;
		}
		
		bf.close();
		return numberOfLines;
	}
	
	public String[] openFile() throws IOException
	{
		File file = new File("/CheckYourself/src/com/example/checkyourself/User_Credentials");
		FileReader fr = new FileReader(file);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines;
		try {
			numberOfLines = readLines();
			String[] textData = new String[numberOfLines];
			
			int i;
			
			for (i = 0; i < numberOfLines; i++)
			{
				textData[i] = textReader.readLine();
			}
			
			textReader.close();
			return textData;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}

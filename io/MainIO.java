package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainIO {

	public static void main(String[] args) {
		String dataToWrite = "";
		try {
			InputStream is = new BufferedInputStream(System.in);
			while(true){
				int character = is.read();
				if(character == 13){
					break;
				}
				dataToWrite += (char)character;
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream os = new FileOutputStream("D:/text.txt");
			byte[] words = dataToWrite.getBytes();
			os.write(words);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

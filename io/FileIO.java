package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
//		try {
//			FileReader reader = new FileReader("D:/text.txt");
//			BufferedReader bufRead = new BufferedReader(reader);
//			String line;
//			while((line = bufRead.readLine()) != null){
//				System.out.println(line);
//			}
//			bufRead.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("File tidak ditemukan");
//		} catch (IOException e) {
//			System.out.println("Gagal membaca file");
//		}
		
		try{
			FileWriter fileWriter = new FileWriter("D:/MyFile.galih");
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write("Test");
			bw.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package io;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:/Temp/Dir/file1.txt");
		
		int readCharNo;
		char[] c = new char[100];
		while ((readCharNo=fr.read(c)) != -1) {
			String data = new String(c, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
				
	}

}

package io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		System.out.println("입력: ");
		String lineString = br.readLine();
		
		System.out.println("출력: " + lineString);
	}

}

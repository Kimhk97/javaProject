package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceeExample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("list.txt");
			int readByte = -1;
			while ((readByte = fis.read()) != -1) {
				System.out.println(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("end of prog");
	}

}

package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/Temp/Dir/cap.png");
		FileOutputStream fos = new FileOutputStream("C:/Temp/Dir/copy.png");

		int readByteNo  = 0;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
//			fos.write(readBytes, 0, readByteNo);

		}

		fos.flush();
		fos.close();
		fis.close();

		System.out.println("복사가 잘 되었습니다.");
	}

}

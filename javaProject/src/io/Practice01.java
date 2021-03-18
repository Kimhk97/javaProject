package io;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);

		FileOutputStream fos = new FileOutputStream("C:/Temp/Practice01.txt");
		Writer writer = new OutputStreamWriter(fos);

		String[] info = new String[100];

		System.out.println("정보를 입력하세요. >> ");
		
		for (int i = 0; i < info.length; i++) {
			
			String data = info[i];
			
			System.out.println("이름: ");
			String name = scn.next();
			System.out.println("전화번호: ");
			String number = scn.next();
			
			//info[i] <- info[i]에 이름과 전화번호 값 저장하기
			
			writer.write(data);

			writer.flush();
			writer.close();
			System.out.println("입력되었습니다.");

			if (scn.next().equals("end")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
		}
	}
}

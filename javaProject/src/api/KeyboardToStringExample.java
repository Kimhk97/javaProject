package api;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes); //시스템 문자 그대로 읽어준다?
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str); //입력한 글자 그대로 출력?
	}

}

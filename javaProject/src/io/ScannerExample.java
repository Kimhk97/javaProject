package io;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("문자열 입력> ");
		String inputString = scn.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.println("정수 입력> ");
		int inputInt = scn.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.println("실수 입력> ");
		double inputDouble = scn.nextDouble();
		System.out.println(inputDouble);
	}

}

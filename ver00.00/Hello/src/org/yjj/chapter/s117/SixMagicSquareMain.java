package org.yjj.chapter.s117;

import java.util.Scanner;

public class SixMagicSquareMain {

	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.println("6, 10, 14 ����(4n+2)�� �Է��ϼ���.");
		int n=scann.nextInt();
		SixMagicSquare sms=new SixMagicSquare(n);
		sms.make();
		sms.print();
	}
}
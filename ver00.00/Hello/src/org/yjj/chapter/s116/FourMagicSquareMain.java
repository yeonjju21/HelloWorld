package org.yjj.chapter.s116;

import java.util.Scanner;

public class FourMagicSquareMain {

	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.println("4�ǹ�� ������ �Է��ϼ���.");
		int n=scann.nextInt();
		FourMagicSquare fms=new FourMagicSquare(n);
		fms.make();
		fms.print();
	}
}

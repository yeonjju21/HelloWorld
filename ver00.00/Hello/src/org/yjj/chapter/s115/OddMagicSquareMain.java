package org.yjj.chapter.s115;

import java.util.Scanner;

public class OddMagicSquareMain {

	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.println("Ȧ�� ������ �Է��ϼ���.");
		int n=scann.nextInt();
		OddMagicSquare odd=new OddMagicSquare(n);
		odd.make();
		odd.print();
	}
}

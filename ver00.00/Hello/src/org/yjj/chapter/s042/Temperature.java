package org.yjj.chapter.s042;

public class Temperature {

	public static void main(String[] args) {
		for(int i=0;i<101;i++) {
			double fahrenheit=9.0/5*i+32;
			System.out.printf("���� %d��= ȭ�� %.2f��.\n",i,fahrenheit);
		}
	}
}

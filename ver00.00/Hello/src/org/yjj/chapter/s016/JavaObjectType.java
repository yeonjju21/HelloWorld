package org.yjj.chapter.s016;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {

	public static void main(String[] args) {
		// �⺻ Ÿ���� �迭�� ���� Ÿ��
		int [] m={1,2,3};            // �迭
		int [] n=new int[] {1,2,3} ; // �迭
		// ���� Ÿ�� - ��ü Ÿ��
		String card="H8";            // ���ڿ�
		Date d=new Date();           // ����
		Calendar cal=Calendar.getInstance();  //����
		//�ڵ����� toString()�� ����
		System.out.println(card);    // card.toString()
		System.out.println(d);       // d.toString()
		System.out.println(cal);     // cal.toString()
	}
}

package org.yjj.chapter.s130;

import java.util.Calendar;

public class JAPICalendar {

	public void showCal(int year){
		String s1=String.format("\t\t\t%d��",year);
		System.out.println(s1);
		for (int i = 1; i <= 12; i++) {
			showCal(year,i);
		}
	}
	public void showCal(int year, int month){
		String s1=String.format("\t\t%d��\t%d��",year,month);
		String t1=String.format("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println(s1);
		System.out.println(t1);
		Calendar cal=Calendar.getInstance();
		cal.set(year, month-1,1);//0~11
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);// ���� 1~7
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <=lastDay; i++) {
			System.out.printf("%d\t",i);
			if((i+dayOfWeek-1)%7==0){
				System.out.println();
			}
		}
		System.out.println("\n---------------------");
	}
}

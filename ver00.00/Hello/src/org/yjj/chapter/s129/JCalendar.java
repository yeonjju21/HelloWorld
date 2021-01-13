package org.yjj.chapter.s129;

public class JCalendar {

	public int [] 	LEAPY={31,29,31,30,31,30,31,31,30,31,30,31};
	 public int [] 	PLAIN={31,28,31,30,31,30,31,31,30,31,30,31};

	 public boolean isLeapYear(int year){
		boolean isS=false;
		if( ((year%4==0)&&(year%100!=0)) || (year%400==0)){
			isS=true;
		}
		return isS;
	 }
	 public int total(int year){
		int tot=0;
		for (int i = 1; i < year; i++) {
			if(isLeapYear(i)){
				tot+=366;
			}else{
				tot+=365;
			}
		}
		return tot;
	 }
	
	 public int total(int year,int month){
		int tot=total(year);
		for (int i = 1; i < month; i++) {
			if(isLeapYear(year)){
				tot+=LEAPY[i-1];
			}else{
				tot+=PLAIN[i-1];
			}
		}
		return tot;
	 }
	 public int total(int year,int month,int date){
		int tot=total(year, month);
		return tot+date;
	 }
	 public int lastDay(int year,int month){
		int tot=0;
		if(isLeapYear(year)){
			tot=LEAPY[month-1];
		}else{
			tot=PLAIN[month-1];
		}
		return tot;
	 }
	 public void showCal(int year, int month){
		String s1=String.format("\t\t%d��\t%d��",year,month);
		String t1=String.format("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println(s1);
		System.out.println(t1);
		int dateOfMonth=(1+total(year,month,1)-1)%7;
		for (int i = 0; i < dateOfMonth; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDay(year, month); i++) {
			System.out.printf("%d\t",i);
			if((i+dateOfMonth)%7==0){
				System.out.println();
			}
		}
		System.out.println("\n---------------------");
	 }
	 public void showCal(int year){
		String s1=String.format("\t\t\t%d��",year);
		System.out.println(s1);
		for (int i = 1; i < 13; i++) {
			showCal(year,i);
		}
	 }
}

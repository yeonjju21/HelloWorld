package org.yjj.chapter.s073;

public class MathTestMain {

	public static void main(String[] args) {
	
		System.out.println("1 : Math.E "+Math.E);
		System.out.println("2 : Math.PI "+Math.PI);
	
		System.out.println("3 : Math.abs(-5) ���밪:"+Math.abs(-5));
		System.out.println("4 : Math.ceil(4.34) �ø�:"+Math.ceil(4.34));
		System.out.println("5 : Math.round(4.34) �ݿø�:"+Math.round(4.5));
		System.out.println("6 : Math.floor(4.34) ����:"+Math.floor(4.34));
		System.out.println("7 : Math.rint(4.34) �ݿø�:"+Math.rint(4.51));
		System.out.println("8 : Math.max(45,78) "+Math.max(45,78));
		System.out.println("9 : Math.min(45,78) "+Math.min(45,78));
		System.out.println("10: Math.pow(2,4) "+Math.pow(2,4));
		System.out.println("11: Math.log(30) "+Math.log(30));
		System.out.println("12: Math.exp(3) "+Math.exp(3));
		System.out.println("13: Math.sqrt(10) "+Math.sqrt(10));
		System.out.print("14: Math.sin(Math.toRadians(90)) ");
		System.out.println(Math.sin(Math.toRadians(90)));
		System.out.print("15: Math.cos(Math.toRadians(180)) ");
		System.out.println(Math.cos(Math.toRadians(180)));
	
		double dRan=Math.random();
		int    iRan=(int)(Math.random()*100);
		System.out.println("16: Math.random()=> "+dRan);
		System.out.println("17: (int)(Math.random()*100)=> "+iRan);
	}
}

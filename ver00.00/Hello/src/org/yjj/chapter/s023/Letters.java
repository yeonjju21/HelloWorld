package org.yjj.chapter.s023;

public class Letters {

	public static void main(String[] args) {
		char a='��';
		String letter="���� ���� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		int letterNumber=letter.length();     
		int loc=letter.indexOf(a);
		System.out.printf("\"%s\"=> %d���̸�, '%c'�� %d��° �ִ�.\n",
				letter,letterNumber,a,loc);
		char b=letter.charAt(loc) ;   
		System.out.printf("\"%s\"�� %d��° ���ڴ� '%c'��.",letter,loc,b );
	
	}
}

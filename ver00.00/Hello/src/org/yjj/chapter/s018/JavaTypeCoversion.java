package org.yjj.chapter.s018;

public class JavaTypeCoversion {

	public static void main(String[] args) {
		String slat=" 37.52127220511242     ";
		//String slat="hello";
		//공백 제거 후 double로 타입 변환
		double latitude=Double.parseDouble(slat.trim()); 
		System.out.println(latitude);
	}	
}

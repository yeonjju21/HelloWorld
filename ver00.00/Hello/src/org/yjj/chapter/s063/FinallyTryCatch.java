package org.yjj.chapter.s063;

public class FinallyTryCatch {

	public static void main(String[] args) {
		try {
			
			int x = 5;
			int y = 20 / (5 - x);   
			System.out.println(y);
		} catch (ArithmeticException e) {
		   System.out.println("==> 0으로 나눴나 확인해 봐!!!!");
		 
		}finally{
			System.out.println("난 수행되어야 만 해!!!!");
		}
	}
}

package org.yjj.chapter.s127;

public class Smith {

	 public static void printSmith(int t1, int t2){
			for (int i = t1; i < t2; i++) {
				if(!Java200Math.isPrime(i) && 
						Java200Math.sumEach(i)==Java200Math.sumSmith(i)){
					System.out.printf("%d�� ���̽� �� ",i);
					Java200Math.printPrimeDivide(i);
				}
			}
		 }
		 public static void main(String[] args) {
			
			printSmith(10000, 20000);
		 }
}

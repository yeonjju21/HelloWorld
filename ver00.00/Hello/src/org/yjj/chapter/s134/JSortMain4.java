package org.yjj.chapter.s134;

import org.yjj.chapter.s133.Lotto6Num;

public class JSortMain4 {
	
	public static void main(String[] args) {
		Lotto6Num lot=new Lotto6Num(1000,100);
		lot.randomMake();       
    	int [] m=lot.getLots(); 
    	int []n=new int[m.length];
		System.arraycopy(m, 0, n, 0, m.length);
		JSort.print(n);
		long a=System.nanoTime();
		JSort.QuickSort(n);
		long b =System.nanoTime();
		System.out.println((b-a)+"nano sec");  
		JSort.print(n);
	}
}

package org.yjj.chapter.s119;

import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		System.out.println("3이상의 정수 마방진을 입력하세요.");
		Scanner scann=new Scanner(System.in);
		int n=scann.nextInt();
		IMagicSquare magic=null;         
		if(n>2 && n%2==1){        
			magic=new OddMagicSquare(n);  
		}else if(n>2 && n%4==0){
			magic=new FourMagicSquare(n); 
		}else if(n>2 && n%4==2){
			magic=new SixMagicSquare(n);  
		}else{
			System.out.println("만들수 없는 마방진입니다.");
			return ;
		}
		MagicPrint.print(magic);     
	 }
}

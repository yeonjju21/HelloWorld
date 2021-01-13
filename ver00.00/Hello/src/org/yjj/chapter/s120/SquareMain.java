package org.yjj.chapter.s120;

import java.util.Scanner;

import org.yjj.chapter.s119.IMagicSquare;

public class SquareMain {

	 public static void main(String[] args) {
		    System.out.println("3이상의 정수 마방진을 입력하세요.");
		    Scanner scann=new Scanner(System.in);
		    int n=scann.nextInt();
			try(FactoryMagic magicFactory=FactoryMagic.getInstence()) {
			  IMagicSquare magic = magicFactory.getMagicSquare(n);   
			  MagicPrint.print(magic);                              
			} catch (MagicException e) {                         
			  System.out.println(e);                 
		    } catch (Exception e1) {                               
		  }
		 }
}

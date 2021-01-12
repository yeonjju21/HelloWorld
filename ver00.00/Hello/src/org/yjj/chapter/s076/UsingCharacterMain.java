package org.yjj.chapter.s076;

public class UsingCharacterMain {

	public static void main(String[] args) {
		Character chr1=new Character('W');
		Character chr2=new Character('9');
		
		if(Character.isLetter(chr1.charValue())){       
			System.out.print("1 : "+chr1.charValue());  
		}
		System.out.print(" ");
		System.out.print('\u0057');System.out.print("\t"); 
		System.out.println(Integer.toHexString((int)chr1)); 
		System.out.println((int)chr1);     
		if(Character.isDigit(chr2.charValue())){
			System.out.println("2 : "+(int)chr2.charValue());  
		}
		
		System.out.println("3 : "+Character.getType('a'));
		System.out.println("4 : "+Character.getType('A'));
		System.out.println("5 : "+Character.getType('3'));
		System.out.println("6 : "+Character.getType('&'));
		
		System.out.println("7 : "+Character.getType('\n'));
		System.out.println("8 : "+(int)'\b');
		System.out.println("9 : "+(int)'\t');
		System.out.println("10: "+(int)'\n');
		System.out.println("11: "+(int)'\f');
		System.out.println("12: "+(int)'\r');
		
		System.out.println("13: "+Character.getNumericValue('9'));
		System.out.println("14: "+Character.isWhitespace(' '));
		System.out.println("15: "+Character.isWhitespace('\n'));
		System.out.println("16: "+Character.isWhitespace('\r'));
		System.out.println("17: "+Character.isWhitespace('\b'));
		System.out.println("18: "+Character.isLetterOrDigit('9'));
		System.out.println("19: "+Character.isLowerCase('A'));
		System.out.println("20: "+Character.isUpperCase('A'));
	 
		System.out.println("21: "+Character.digit('8',9));
	
		System.out.println("22: "+(int)' ');//32
		System.out.println("23: "+Character.isSpaceChar(' '));
		System.out.println("24: "+Character.isSpaceChar('\n'));
	}
}

package org.yjj.chapter.s038;

public class BioSwitch {

	public static String textInfor(PEI index, double value) {
		String result = "";
		switch( index ) {
			case PHYSICAL : result = "��ü����: " ;break;
			case EMOTIONAL : result = "��������: "; break;
			case INTELLECTUAL : result = "��������: "; break;
			default : result = "�̰���: "; break;
		}
		return result + (value*100);
	}
	public static void main(String[] args) {
		PEI index=PEI.PHYSICAL;
		double value=0.86;
		System.out.println("��ü���� �ֱⰪ: "+index.getPei());  //enum�� int�� ��ȯ 
		String st=textInfor( index,  value) ;
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
}
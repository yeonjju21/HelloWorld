package org.yjj.chapter.s021;

public class Grad {
	public static void main(String[] args) {
		int [] grade={90, 80, 89};
		int tot=grade[0]+grade[1]+grade[2];
		int average=tot/3;              // ���� ������ ����
		System.out.printf("���� %d��, ���� %d��, ���� %d�� =>\t",
				grade[0],grade[1],grade[2]);
		System.out.printf("���� %d��, ��� %d��\n",tot,average);
	}
}

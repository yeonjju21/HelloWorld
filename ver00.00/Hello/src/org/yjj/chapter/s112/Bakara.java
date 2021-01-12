package org.yjj.chapter.s112;

public class Bakara {

	CardPrint cp = new CardPrint();
	int whoWin=-1;
	public void start(){
		cp.make();   
		cp.shuffle();  
	}
	public void result() {  
		whoWin=-1;
		cp.print();
		System.out.println("��� : ");
		System.out.println("---------------------");
		System.out.println("�÷��̾� : " + cp.returnPlayer());
		System.out.println("���� : " + cp.returnDealer());
		if (cp.returnPlayer() < cp.returnDealer()) {
			System.out.println("���� ��!");
			whoWin=2;
		}
		else if (cp.returnPlayer() > cp.returnDealer()) {
			System.out.println("�÷��̾� ��!");
			whoWin=1;
		}
		else {
			System.out.println("Ÿ��!");
			whoWin=3;
		}
	}
	public int getWhoWin() {
		return whoWin;
	}
}

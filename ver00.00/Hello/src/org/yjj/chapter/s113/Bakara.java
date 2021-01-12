package org.yjj.chapter.s113;

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
		System.out.println("°á°ú : ");
		System.out.println("---------------------");
		System.out.println("ÇÃ·¹ÀÌ¾î : " + cp.returnPlayer());
		System.out.println("µô·¯ : " + cp.returnDealer());
		if (cp.returnPlayer() < cp.returnDealer()) {
			System.out.println("µô·¯ ½Â!");
			whoWin=2;
		}
		else if (cp.returnPlayer() > cp.returnDealer()) {
			System.out.println("ÇÃ·¹ÀÌ¾î ½Â!");
			whoWin=1;
		}
		else {
			System.out.println("Å¸ÀÌ!");
			whoWin=3;
		}
	}
	public int getWhoWin() {
		return whoWin;
	}
}

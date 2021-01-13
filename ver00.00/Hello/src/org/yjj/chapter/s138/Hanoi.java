package org.yjj.chapter.s138;

public class Hanoi {

	private int  tray=3;      
	 private int  bar=3;    
	 int [][] rings;
	 public Hanoi(int tray){
		this.tray=tray;       
		rings=new int[tray][bar];
		for(int i=0;i<rings.length;i++){
			int x=2*i+1;
			rings[i][0]=x;
		}
	 }
	 public int[][] getRings(){
		return rings;
	 }     
	 public  void moveHanoi(int num, char ringA,char ringB,char ringC){
		if(num==1){
			System.out.println(ringA+" bar�ʿ� �ִ� ���� "+ringB+" bar������ �̵�");
		}else {
			moveHanoi(num-1,ringA,ringC,ringB);
			System.out.println(ringA+" bar�ʿ� �ִ� ���� "+ringB+" bar������ �̵�");
			moveHanoi(num-1,ringC,ringB,ringA);
		}
	 }
}

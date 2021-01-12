package org.yjj.chapter.s083;

public class BillboardMain2 {

	public static void main(String[] args) {
	
		Billbaord b1 =new Billbaord(1,"Despacito",1,
		  "https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
	
		showAbout(b1); 
		
		Billbaord b=b1;  
		showAbout(b);     
	}
	public static void showAbout(Billbaord bb ){
		String sf=String.format("%s, %s, %s, %s, %s",
			bb.getRank(), bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	}
}

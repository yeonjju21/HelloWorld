package org.yjj.chapter.s084;

public class BillboardMainObject {

	public static void main(String[] args) {
		Billbaord b1 =new Billbaord(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		Billbaord b2 =new Billbaord(2,"That's What I Like",2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
		Billbaord b3 =new Billbaord(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");
		showAbout(b1);       
		showAbout(b2);       
		showAbout(b1,b2);     
		showAbout(b1,b2,b3); 
		Billbaord[] b=new Billbaord[3];
		b[0]=new Billbaord(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		b[1]=b2;  
		b[2]=b3;
		showAbout(b[0],b[1]);   
		showAbout(b);         
	 }
	 public static void showAbout(Billbaord bb ){
		System.out.println("1----------------------");
		String sf=String.format("%d, %s, %d, %s, %s",
				bb.getRank(), bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	 }
	 public static void showAbout(Billbaord ... b ){
		System.out.println("2======================>");
		for(Billbaord bill : b){
			showAbout(bill);  // 1
		}
		System.out.println("<======================2");
	 }
}

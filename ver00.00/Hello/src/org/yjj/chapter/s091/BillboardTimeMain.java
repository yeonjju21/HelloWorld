package org.yjj.chapter.s091;

public class BillboardTimeMain {
	public static void main(String[] args) {
		 String newUrls="https://www.billboard.com/charts/hot-100/";
		 Document doc=null;
		 String fnames="billboard/";
		 String ss="";
		 String tt="";
	     try {
	    	 doc = Jsoup.connect(newUrls).get(); 
	    	
	    	 Element bDay = doc.select("button.chart-detail-header__date-selector-button").first();
	    	 ss=bDay.text();     
	     } catch (Exception e) {
			System.out.println(e);
		 }
	    System.out.println("이번 빌보드 차트 날짜 : "+ss.trim());
	 }
}

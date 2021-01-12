package org.yjj.chapter.s095;

import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.util.Elements;

public class RequestFromBillboardHot {

boolean isConnection=false;
	
	ArrayList<Billbaord> billboards=new ArrayList<Billbaord>();

	public ArrayList<Billbaord> getBillboards() {
		return billboards;
	}
	public RequestFromBillboardHot(){
		billboards.clear();
	}
	
	public synchronized void getBillboardData(String newUrls){
		 billboards.clear();
		 Document doc=null;
		 String fnames="billboard/";
		 String ss="";
		 
	     try {
	    	 doc = Jsoup.connect(newUrls).get(); 
	    	 String firstsong="";
	    	 String firstartist="";

	    	 Element firsttitle = doc.select("div.chart-number-one__title").first();
	    	 firstsong=firsttitle.text();
	 
	    	 Element efirstartist = doc.select("div.chart-number-one__artist").first();
	    	 firstartist=efirstartist.text();
	  
	    	 
	    	 Billbaord board=new Billbaord(
	 				1, replace(firstsong),
	 				0, 
	 				"", replace(firstartist), replace(firstartist));
	 		        billboards.add(board);
	 		        
           
	    	 Elements links = doc.select("div.chart-list-item");
	         for (Element link : links) {
	        	 Element erank=link.selectFirst("div.chart-list-item__rank");
	             String srank=erank.text();
	      
	             Element esong=link.selectFirst("span.chart-list-item__title-text");
	             String song=esong.text();
	             Element eartist=link.selectFirst("div.chart-list-item__artist");
	             String artist=eartist.text();
	             String lastweek="101";
	             try{
	            	 Element estate=link.selectFirst("div.chart-list-item__last-week");
	            	 if(estate!=null){  
	            		 lastweek=__toStr(estate.text());
	            	 }else{
	           
	            	 }
	             }catch(Exception ee){
	            	 System.out.println(ee);
	             }
	             
	             Billbaord board1=new Billbaord(
	 	 				toInt(srank), replace(song),
	 	 				toInt(lastweek), 
	 	 				"", replace(artist), replace(artist));
	 	 		        billboards.add(board1);	 	 		     
	         }

	     } catch (IOException e) {
			System.out.println(e);
		 }
	}
	public String replace(String msg){
		String ss=msg;
		ss=ss.replaceAll("&#039;", "'");
		ss=ss.replaceAll("&amp;", "&");
		ss=ss.replaceAll("&quot;", "\"");
		return ss.trim();
	}

	private String __toStr(String lastweek){
		return lastweek.contains("-")?101+"":lastweek;
	}
	private int toInt(String msg){
		return Integer.parseInt(msg==null ?"-1":msg.trim());
	}
	public String toArtis(String msg){
		return msg.replaceAll("-", " ");
	}

	public void printBillboard(){
		for (Billbaord dto : billboards) {
			System.out.println(dto);
		}
	}
	public String getTimeDate(String aurl) {
		Document doc;
		String sdate=null;
	    try {
	        doc = Jsoup.connect(aurl).get();
	        Element first = doc.select("button.chart-detail-header__date-selector-button").first();
	        sdate=first.text();
	    } catch (IOException e) {
	        System.out.println(e);
	    }
		return sdate!=null?RestDay.toDay(sdate): RestDay.saturday();
	}
	public static void main(String[] args) {
		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs=rfw.getTimeDate(a);

		rfw.getBillboardData(a+rs);
        rfw.printBillboard();
	}
}

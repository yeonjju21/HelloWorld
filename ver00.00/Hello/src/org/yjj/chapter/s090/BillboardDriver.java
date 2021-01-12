package org.yjj.chapter.s090;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BillboardDriver {
	public String saveBillboard100(String today, String newUrls){
		 Document doc=null;
		 String fnames="billboard/";
		 String ss="";
	     try {
	    	 doc = Jsoup.connect(newUrls+today).get(); 
	    
	    	 Element bDay = doc.select("button.chart-detail-header__date-selector-button").first();
	    	 ss+=bDay.outerHtml()+"\n";
	    
	    	 Element first = doc.select("div.chart-number-one__info").first();
	    	 ss+=first.outerHtml()+"\n";
	    
	    	 Elements links = doc.select("div.chart-list-item");
	         for (Element link : links) {
	        	 ss+=link.outerHtml()+"\n";
	   
	         }

		  
		     fnames=fnames+today+".html";
			 PrintWriter pw=new PrintWriter(
						    new FileWriter(fnames));
		     pw.print(ss);
		     pw.close();
	     } catch (IOException e) {
			System.out.println(e);
		 }
	     return fnames;
	}
	public String saveBillboard100(String newUrls){
	     
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	     String today=sdf.format(new Date());
	     return saveBillboard100(today,newUrls);
	}
}

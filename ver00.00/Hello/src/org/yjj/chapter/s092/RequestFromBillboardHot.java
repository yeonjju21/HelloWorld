package org.yjj.chapter.s092;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.net.URL;


public class RequestFromBillboardHot {

	ArrayList<String> htmls=new ArrayList<String>();
	 boolean isConnection=false;

	 public RequestFromBillboardHot() {
		htmls.clear();
	 }
	 public void getAllHtml(String newUrls){
		htmls.clear();
		try {
			
			BufferedReader reader = new BufferedReader(  
		              new FileReader(newUrls));
			String line = "";
			while ((line = reader.readLine()) != null){
				if(!line.trim().equals("")){
					htmls.add(line.trim());
				}
			}
			isConnection=true;
		} catch (Exception e) {
			isConnection = false;
			System.out.println("Billboard Parsing error !!! ");
		} 
	 }
	 public void printHtml(){
		for (String ss : htmls) {
			System.out.println(ss);
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
			return sdate!=null?RestDay.saturday(sdate): RestDay.saturday();
		}
	 public static void main(String[] args) {
		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs=rfw.getTimeDate(a);
		System.out.println("ÀÌ¹ø ÁÖ "+rs);
		
		String fnames="billboard/"+rs+".html";
	
		File f=new File(fnames);
		BillboardDriver billdriver=null;
		if(!f.exists()){  
			billdriver=new BillboardDriver();
			fnames=billdriver.saveBillboard100(rs,a);
		}
	
		System.out.println(fnames);
		rfw.getAllHtml(fnames);
		rfw.printHtml();
	 }

}

package org.yjj.chapter.s094;

import java.io.BufferedReader;
import java.io.FileReader;

public class BillboardMain7 {

	 public static String cut(String msg){
			String val=msg.substring(msg.indexOf("=")+1);
			return val;
		 }
	
		 public static void show(String msg){
			System.out.println("-------------------------------------");
			String[] msgs=msg.split(", ");
			String rank=cut(msgs[0]).trim();
			String song=cut(msgs[1]).trim();
			String lastweek=cut(msgs[2]).trim();
			String imagesrc=cut(msgs[3]).trim();
			String artist=cut(msgs[4]).trim();
			String sf=String.format("%s, %s, %s, %s, %s",rank, song,lastweek,imagesrc,artist);
			System.out.println(sf);
		 }
		 public static void main(String[] args) {
			RequestFromBillboardHot rfw=new RequestFromBillboardHot();
			String a="https://www.billboard.com/charts/hot-100/";
			String rs=rfw.getTimeDate(a);
			BufferedReader br=null;
			try {
				br=new BufferedReader(new FileReader("billboard\\"+rs+".csv"));
				String msg="";
				while((msg=br.readLine())!=null){
				    show(msg);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		 }
}

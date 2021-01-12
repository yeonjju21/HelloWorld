package org.yjj.chapter.s090;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.yjj.chapter.s089.BillboardDriver;

public class BillboardArrayMain {

	public static void main(String[] args) {
		ArrayList<String> htmls=new ArrayList<String>();
		String newUrls="https://www.billboard.com/charts/hot-100/";
		BillboardDriver billdriver=new BillboardDriver();
		String fnames=billdriver.saveBillboard100(newUrls);
		try {
			
			BufferedReader reader = new BufferedReader(  
		                                 new FileReader(fnames));
			String line = null;
			while ((line = reader.readLine()) != null){
				if(!line.trim().equals("")){             
					htmls.add(line.trim());
				}
			}
		} catch (Exception e) {
			System.out.println("Billboard Parsing error !!! ");
		} 
		
		for (String str : htmls) {
			System.out.println(str);
		}
	 }
}

package org.yjj.chapter.s089;

import java.io.BufferedReader;
import java.io.FileReader;

public class BillboardMain3 {

	public static void main(String[] args) {
		 String newUrls="https://www.billboard.com/charts/hot-100/";
		 BillboardDriver billdriver=new BillboardDriver();
		 String fnames=billdriver.saveBillboard100(newUrls);
	    
	     try {
	 		BufferedReader reader = new BufferedReader(  
	 				              new FileReader(fnames));
	 		String line = null;
	 		while ((line = reader.readLine()) != null){ 
	 			if(!line.trim().equals("")){             
	 				System.out.println(line.trim());
	 			}
	 		}
	 	} catch (Exception e) {
	 		System.out.println("Billboard Parsing error !!! ");
	 	} 
	 }
}

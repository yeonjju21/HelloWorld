package org.yjj.chapter.s096;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BillboardPrint {

public static void printToXML(List<Billbaord> bblist, String fname){
	try (PrintWriter pw=new PrintWriter(new FileWriter(fname,false),true)){
		pw.println("<?xml version='1.0' encoding='utf-8'?>");
		pw.println("<billboards>");
		for(Billbaord bb : bblist){
				pw.println(pairxs(bb));
		}
		pw.println("</billboards>");
	} catch (IOException e) {
	}
}
private static String rp(String msg){
	String st=msg;
	st=st.replaceAll("&", "&amp;");
	st=st.replaceAll(">", "&gt;");
	st=st.replaceAll("<", "&lt;");
	st=st.replaceAll("\'", "&apos;");
	st=st.replaceAll("\"", "&quot;");
	return st;
}
private static String pairx(String key, String value){
	String ss=String.format("<%s>%s</%s>", key,value,key);
	return ss;
}
private static String pairxs(Billbaord bb){
	String rank=pairx("rank",rp(bb.getRank()+""));
	String song=pairx("song",rp(bb.getSong()+""));
	String lastweek=pairx("lastweek",rp(bb.getLastweek()+""));
	String imagesrc=pairx("imagesrc",rp(bb.getImagesrc()+""));
	String artist=pairx("artist",rp(bb.getArtist()+""));
	return String.format("<billboard>\n%s %s %s %s %s\n</billboard>",
			rank, song,lastweek,imagesrc,artist);
}

}

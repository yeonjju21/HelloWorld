package org.yjj.chapter.s096;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class BillboardMain10 {

	public static void main(String[] args) {

		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
			String a="https://www.billboard.com/charts/hot-100/";
			String rs=rfw.getTimeDate(a);
		DocumentBuilder db;
		try {
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = db.parse(new File("billboard\\"+rs+".xml"));
			Element root = (Element) doc.getDocumentElement();
			System.out.println(root.getTagName()); 
		    NodeList nodes = doc.getElementsByTagName("billboard");
		    for (int i = 0; i < nodes.getLength(); i++) {
		      Element element = (Element) nodes.item(i);
		      NodeList ranklist = element.getElementsByTagName("rank");
		      Element rank = (Element) ranklist.item(0);
		      NodeList songlist = element.getElementsByTagName("song");
		      Element song = (Element) songlist.item(0);
		      NodeList lastweeklist = element.getElementsByTagName("lastweek");
		      Element lastweek = (Element) lastweeklist.item(0);
		      NodeList imagesrclist = element.getElementsByTagName("imagesrc");
		      Element imagesrc = (Element) imagesrclist.item(0);
		      NodeList artistlist = element.getElementsByTagName("artist");
		      Element artist = (Element) artistlist.item(0);
		      System.out.println(element.getTagName()+"---------------------");
		      System.out.println("rank: " + getCharacterDataFromElement(rank));
		      System.out.println("song: " + getCharacterDataFromElement(song));
		      System.out.println("lastweek: " + getCharacterDataFromElement(lastweek));
		      System.out.println("imagesrc: " + getCharacterDataFromElement(imagesrc));
		      System.out.println("artist: " + getCharacterDataFromElement(artist));
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println( e);
		}
	 }
	 public static String getCharacterDataFromElement(Element e) {
	    Node child = e.getFirstChild();
	    if (child instanceof org.w3c.dom.CharacterData) {
	      org.w3c.dom.CharacterData cd = (org.w3c.dom.CharacterData) child;
	      return cd.getData();
	    }
	    return "";
	  }
}

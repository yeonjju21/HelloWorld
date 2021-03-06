package org.yjj.chapter.s100;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ImageFXListRequest {

private Map<String, Image> images;
	
	public ImageFXListRequest() {
		images= Collections
				.synchronizedMap(new LinkedHashMap<String, Image>(10, 1.5f, true));
	}
	
	public synchronized Image loadImage(String imagesrc) {
		Image mimage=null;
		if (images.containsKey(imagesrc)) {
			mimage= images.get(imagesrc);
		} else {
			if(imagesrc!=null && !imagesrc.contains("q_____")){
				try{
					mimage= new Image(imagesrc,100,100,true,true);
				}catch (Exception e) {
					mimage=null;;
				}
			}
		}
		return mimage==null ? new Image(getClass().getResourceAsStream("billboard.jpg")):mimage;
	}
	
	public synchronized void getAllImages(ArrayList<Billbaord> bills){
		images.clear();
		List<Billbaord> newbills=Collections.synchronizedList(bills);
		for(Billbaord bb: newbills){

			new Thread(() ->{
					if(!images.containsKey(bb.getImagesrc())){
						images.put(bb.getImagesrc(), loadImage(bb.getImagesrc()));
						
					}
			}).start();
		}
	}
}

package org.yjj.chapter.s102;

import java.util.ArrayList;

public class BillboardConvert {

	public static BillbaordProperty toBill(Billbaord b){
		BillbaordProperty bp=new BillbaordProperty();
		bp.setRank(b.getRank());
		bp.setSong(b.getSong());
		bp.setArtist(b.getArtist());
		bp.setImagesrc(b.getImagesrc());
		bp.setLastweek(b.getLastweek());
		return bp;
	 }
	 public static ArrayList<BillbaordProperty>toBill(ArrayList<Billbaord> blist){
		ArrayList<BillbaordProperty> bplists=new ArrayList<>();
		for(Billbaord b:blist){
			bplists.add(toBill(b));
		}
		return bplists;
	 } 
	 public static ObservableList<BillbaordProperty> toBillboard(ArrayList<BillbaordProperty> alists){
		ObservableList<BillbaordProperty> bList =
				FXCollections.observableArrayList(alists);
		return bList;
	 }
	 public static ObservableList<BillbaordProperty> toObservBill(ArrayList<Billbaord> alists){
		return toBillboard(toBill(alists));
	 }
	 public static void main(String[] args) {
		
		ImageFXListRequest  request=new ImageFXListRequest();
		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs=rfw.getTimeDate(a);
		rfw.getBillboardData(a+rs);
		
		
		ArrayList<Billbaord> bills=rfw.getBillboards();
	
		request.getAllImages(bills); 
		ObservableList<BillbaordProperty> obsbills= BillboardConvert.toObservBill(bills);
		for(BillbaordProperty bp: obsbills){
			System.out.println(bp);
		}
	 }
}

package org.yjj.chapter.s096;

public class BillboardMain6 {

	public static void main(String[] args) {
		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs=rfw.getTimeDate(a);
		rfw.getBillboardData(a+rs);
		rfw.printBillboard();

	
		BillboardPrint.printToXML(rfw.getBillboards(), "billboard\\"+rs+".xml");
	}
}

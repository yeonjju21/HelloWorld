package org.yjj.chapter.s017;

class JLocation{
	public double lat;
	public double lng;
}
public class JavaUserDefinedType {

	public static void main(String[] args) {
		//�� ���� �⺻ Ÿ��
		double latitude=37.52127220511242;
		double longitude=127.0074462890625;
		//����� ���� ��ü�� ���� 
		JLocation jloc=new JLocation();
		jloc.lat=latitude;      // ���� ����
		jloc.lng=longitude;     // ���� ����
		
		JLocation newLoc=jloc;  // ��ü�� ����
		System.out.println(newLoc.lat);  // ���
	}
}

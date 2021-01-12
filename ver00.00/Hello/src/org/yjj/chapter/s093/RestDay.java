package org.yjj.chapter.s093;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class RestDay {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i= 1; i <=lastDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);   
			if(isRest(toYMD(cal))){         
				System.out.println(toYMD(cal)+" is Rest Day.");
			}             
		}
		
		System.out.println(saturday("2018-09-12"));
		System.out.println(saturday("2018-09-13"));
		System.out.println(saturday("2018-09-14"));
		System.out.println(saturday("2018-09-15"));
		System.out.println(saturday("2018-09-16"));
		System.out.println(saturday());
		System.out.println(toDay("September 22, 2018"));
		System.out.println(toKorDay("9¿ù 22, 2018"));
	}
	public static boolean isRest(String day){
	
		boolean isRest=false;
		Calendar tod= todate(day);
		if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || 
				tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY ){ 
			isRest=true;
		}
		return isRest;
	}
	public static String toYMD(Calendar dd){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}
	public static String goGo(String ss,int day){
		Calendar cal=todate(ss);
	
		cal.add(Calendar.DAY_OF_YEAR, day);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}
	public static String toWantedDay(String ss,int round){
		return goGo(ss, -(round*7));
	}
	public static Calendar todate(String ss){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dd=new Date();
		try {
			dd=sdf.parse(ss);
		} catch (ParseException e) {
		}
		Calendar cal=Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	public static String toDay(String rs){
		SimpleDateFormat sdf=new SimpleDateFormat("MMMM dd, yyyy",Locale.US);
		Date dd=new Date();
		try {
			dd=sdf.parse(rs);
		} catch (ParseException e) {
			System.out.println(e);
		}
		Calendar cal=Calendar.getInstance();
		cal.setTime(dd);
		return toYMD(cal);
	}
	public static String toKorDay(String rs){ 
		SimpleDateFormat sdf=new SimpleDateFormat("MM¿ù dd, yyyy");

		Date dd=new Date();
		try {
			dd=sdf.parse(rs);
		} catch (ParseException e) {
			System.out.println(e);
		}
		Calendar cal=Calendar.getInstance();
		cal.setTime(dd);
		return toYMD(cal);
	}

	public static String saturday(String day){
		Calendar cal=todate(day);
		int i=0;
		for( ; i<7; i++){
			if(cal.get(Calendar.DAY_OF_WEEK)+i==Calendar.SATURDAY){
				break;
			}
		}
		cal.add(Calendar.DAY_OF_YEAR, i);
		return toYMD(cal);
	}
	public static String saturday(){
		Calendar cal=Calendar.getInstance();
		return saturday(toYMD(cal));
	}
}

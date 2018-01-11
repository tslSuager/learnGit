package adsf;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunction {
	public static  SimpleDateFormat sf; 
	public static Date getCurrentDate(){
		return new Date();
	}
	public static String getCurrentShortDate (){
		sf=new SimpleDateFormat("yyyy-MM-dd");
		return sf.format(new Date());
	}
	public static String getCurrentDateTime() {
		sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sf.format(new Date());
	}
	public static String getCurrentChineseDate() {
		sf=new SimpleDateFormat("yyyy年MM月-dd日");
		return sf.format(new Date());
	}
	public static Date convertToDate(String currentDate) throws Exception {
		sf=new SimpleDateFormat("yyyy-MM-dd");
		return sf.parse(currentDate);
	}
	public static java.util.Date convertToLongDate(String currentDate) throws Exception{
		sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sf.parse(currentDate);
	}
	public static String convertToDateString(java.sql.Date date) {
		sf=new SimpleDateFormat("yyyy-MM-dd");
		return	sf.format(date.getTime());
	}
	public static String convertToDateTimeString(java.sql.Date date) {
		sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return	sf.format(date.getTime());
	}
	
}

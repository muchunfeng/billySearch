package com.ec.billySearch;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class Tool {
	public static String getToDate(String fromYear,String fromMonth){
		if(fromMonth.equalsIgnoreCase("12")){
			return ""+(Integer.parseInt(fromYear)+1)+"-"+"01-01";
		}else{
			return fromYear+"-"+(Integer.parseInt(fromMonth)+1)+"-01";
		}
	}
	
	static Pattern yearPattern = Pattern.compile("^[0-9]{4}$");
	static Pattern monthPattern = Pattern.compile("^\\d{1,2}$");
	public static boolean isRightYear(String year){
		return yearPattern.matcher(year).matches();
	}
	public static boolean isRightMonth(String month){
		return monthPattern.matcher(month).matches();
	}
	
	public static void main(String args[]){
		System.out.println(Tool.isRightYear("1223"));
		System.out.println(Pattern.matches("^[0-9]{4}$","1234"));
		System.out.println(Tool.formatDate(new Date(System.currentTimeMillis())));
	}
	
	public static String formatDate(Date day){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(day);
	}
	
	
	public static void createAExcelForGameAndQuDao(){
		
	}
	
}

package com.ec.billySearch;

public class BillySearchException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 50284717241274303L;
	public static String ERROR_PARAMETER = "ERROR_PARAMETER";
	
	String errorMsg;
	public BillySearchException(String errorMsg){
		this.errorMsg = errorMsg;
	}
	public String getMessage(){
		return errorMsg;
	}
}

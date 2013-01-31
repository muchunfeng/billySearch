package com.ec.billySearch;



public class AllQuDaoGameBase {
	private String fromDate;
	private String toDate;
	public void parameterDeal(String fromYear,String fromMonth) throws BillySearchException{
		if(fromYear == null || (fromMonth != null && fromMonth.length()>0 && !Tool.isRightMonth(fromMonth) || !Tool.isRightYear(fromYear))){
			throw new BillySearchException(BillySearchException.ERROR_PARAMETER);
		}
		toDate = null;
		boolean yearCompute = false;
		if(fromMonth == null || fromMonth.length()==0){
			fromMonth = "01";
			yearCompute = true;
		}
		fromDate = fromYear + "-" + fromMonth + "-" + "01";
		if(yearCompute){
			toDate = ""+(Integer.parseInt(fromYear)+1) + "-01-01";
		}else{			
			toDate = Tool.getToDate(fromYear, fromMonth);
		}
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
}

package com.ec.billySearch.domain;

import java.sql.Date;

public class BillyEveryDay_QuDao {
	private String quDaoName;
	private Date today;
	private int money;
	public String getQuDaoName() {
		return quDaoName;
	}
	public void setQuDaoName(String quDaoName) {
		this.quDaoName = quDaoName;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}

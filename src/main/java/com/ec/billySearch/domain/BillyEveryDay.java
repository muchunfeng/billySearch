package com.ec.billySearch.domain;

import java.sql.Date;

public class BillyEveryDay {
	private String gameName;
	private Date today;
	private int money;
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
//		this.gameName = GameIdMap.gameMap.get(gameName);
		this.gameName = gameName;
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

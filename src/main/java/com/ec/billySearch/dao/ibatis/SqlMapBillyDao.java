package com.ec.billySearch.dao.ibatis;

import java.util.HashMap;
import java.util.List; 
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ec.billySearch.dao.BillyDao;

public class SqlMapBillyDao extends SqlMapClientDaoSupport implements BillyDao{

	public List getAllGamesEveryDayBilly(String fromDate,String toDate) {
		Map<String,String> dateMap = new HashMap<String,String>();
		dateMap.put("fromDate", fromDate);
		dateMap.put("toDate", toDate);
		return getSqlMapClientTemplate().queryForList("getEveryDayBillyPerGame",dateMap);
	}
	
	public List getAllQuDaoEveryDayBilly(String fromDate,String toDate){
		Map<String,String> dateMap = new HashMap<String,String>();
		dateMap.put("fromDate", fromDate);
		dateMap.put("toDate", toDate);
		return getSqlMapClientTemplate().queryForList("getEveryDayBillyPerQuDao",dateMap);
	}
}

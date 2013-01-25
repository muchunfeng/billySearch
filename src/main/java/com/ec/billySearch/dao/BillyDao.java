package com.ec.billySearch.dao;

import java.util.List;
import com.ec.billySearch.domain.BillyEveryDay;
import com.ec.billySearch.domain.BillyEveryDay_QuDao;

public interface BillyDao {
	List<BillyEveryDay> getAllGamesEveryDayBilly(String fromDate,String toDate);
	List<BillyEveryDay_QuDao> getAllQuDaoEveryDayBilly(String fromDate,String toDate);
}

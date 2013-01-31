package com.ec.billySearch;

import java.util.HashMap;  
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ec.billySearch.dao.BillyDao;
import com.ec.billySearch.domain.BillyEveryDay_QuDao;

public class SearchAllQuDaoController extends AllQuDaoGameBase implements Controller{
	private BillyDao billyDao;
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String fromYear = request.getParameter("year");
		String fromMonth = request.getParameter("month");
		try {
			super.parameterDeal(fromYear, fromMonth);
		} catch (BillySearchException e) {
			Map<String,String> errorMap = new HashMap<String,String>();
			errorMap.put("errorInfo", e.getMessage());
			return new ModelAndView("errorPage", errorMap);
		}
		response.setContentType("application/vnd.ms-excel");
		List<BillyEveryDay_QuDao> list = billyDao.getAllQuDaoEveryDayBilly(getFromDate(),getToDate());
		Map<String,List<BillyEveryDay_QuDao>> model = new HashMap<String,List<BillyEveryDay_QuDao>>();
		model.put("allQuDaoInfo", list);
		return new ModelAndView("allQuDao", model);
	}
	
	public BillyDao getBillyDao() {
		return billyDao;
	}
	public void setBillyDao(BillyDao billyDao) {
		this.billyDao = billyDao;
	}
}

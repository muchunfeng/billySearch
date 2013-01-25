package com.ec.billySearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ec.billySearch.dao.BillyDao;
import com.ec.billySearch.domain.BillyEveryDay;

public class SearchAllGamesController implements Controller{
	private BillyDao billyDao;
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String fromYear = request.getParameter("year");
		String fromMonth = request.getParameter("month");
		if(fromYear == null || fromMonth == null || (!Tool.isRightMonth(fromMonth) || !Tool.isRightYear(fromYear))){
//			throw new BillySearchException(BillySearchException.ERROR_PARAMETER);
			Map<String,String> errorMap = new HashMap<String,String>();
			errorMap.put("errorInfo", BillySearchException.ERROR_PARAMETER);
			return new ModelAndView("errorPage", errorMap);
		}
		response.setContentType("application/vnd.ms-excel");
		String fromDate = fromYear + "-" + fromMonth + "-" + "01";
		String toDate = Tool.getToDate(fromYear, fromMonth);
		List<BillyEveryDay> list = billyDao.getAllGamesEveryDayBilly(fromDate, toDate);
		System.out.println(list.size());
		Map<String,List<BillyEveryDay>> model = new HashMap<String,List<BillyEveryDay>>();
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(list.get(i).getGameName() + "  " + list.get(i).getMoney());
//		}
		model.put("allGamesInfo", list);
		return new ModelAndView("allGames", model);
	}

	public BillyDao getBillyDao() {
		return billyDao;
	}

	public void setBillyDao(BillyDao billyDao) {
		this.billyDao = billyDao;
	}

}

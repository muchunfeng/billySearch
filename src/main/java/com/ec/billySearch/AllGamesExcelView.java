package com.ec.billySearch;

import java.util.Iterator; 
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.ec.billySearch.domain.BillyEveryDay;

public class AllGamesExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<BillyEveryDay> allGames = (List<BillyEveryDay>)model.get("allGamesInfo");
		HSSFSheet sheet = workbook.createSheet("allGames");
		HSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("游戏名");
		header.createCell(1).setCellValue("日期");
		header.createCell(2).setCellValue("人民币");
//		HSSFDataFormat df = workbook.createDataFormat();
		HSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
		int rowNum = 1;
		for(Iterator iter = allGames.iterator(); iter.hasNext();){
			BillyEveryDay billyEveryDay = (BillyEveryDay)iter.next();
			HSSFRow row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(billyEveryDay.getGameName());
			row.createCell(1).setCellValue(billyEveryDay.getToday());
			row.getCell(1).setCellStyle(cellStyle);
			row.createCell(2).setCellValue(billyEveryDay.getMoney());
		}
		HSSFRow row = sheet.createRow(rowNum);
		row.createCell(0).setCellValue("Total");
		String formula = "SUM(C2:C"+rowNum+")";
		row.createCell(2).setCellFormula(formula);
	}

}

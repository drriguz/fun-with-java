package fun.with.java.day5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelParser {
	protected Workbook workbook;
	protected String file;
	protected SheetParser sheetParser;
	
	public ExcelParser(String file, SheetParser sheetParser){
		this.file = file;
		this.workbook = null;
		this.sheetParser = sheetParser;
	}
	
	public List<Item> parse(){
		List<Item> itemList = new ArrayList<Item>();
		File xls = new File(this.file);
		try {
			Workbook doc = Workbook.getWorkbook(xls);
			Sheet [] sheets = doc.getSheets();
			for(Sheet s:sheets){
				List<Item> items = this.sheetParser.parse(s);
				itemList.addAll(items);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return itemList;
	}
}

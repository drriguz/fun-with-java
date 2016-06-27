package fun.with.java.day5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;

public class SheetParser {
	SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
	SimpleDateFormat format1 = new SimpleDateFormat("yy-mm-dd");

	protected Item parseItem(String date, String project, String hour){
		try {
			SimpleDateFormat dateFormat = this.format;
			if(date.contains("-"))
				dateFormat = format1;
			
			Date d = dateFormat.parse(date);
			float h = Float.parseFloat(hour);

			return new Item(d, project, h);
		} catch (Exception e) {
			System.err.println("Error:" + date + " " + project + " " + hour);
			e.printStackTrace();
		}

		return null;
	}

	public List<Item> parse(Sheet sheet){
		System.out.println("Parsing sheet:" + sheet.getName());
		List<Item> items = new ArrayList<Item>();
		String date = "", project = "", hour = "";
		for(int row  = 3; row < sheet.getRows(); row ++){
			Cell[] cells = sheet.getRow(row);
			if(cells == null || cells.length == 0){
				//System.err.println("Error: Empty" + row);
				continue;
			}
			if(cells.length < 8){
				//System.err.println("Error: Not enough" + row);
				continue;
			}
				
			String tmpDate = cells[0].getContents().trim(),
					tmpProject = cells[3].getContents().trim();

			hour = cells[8].getContents().trim();

			if(Utils.isNullOrEmpty(hour))
				continue;
			if(!Utils.isNullOrEmpty(tmpDate))
				date = tmpDate;
			if(!Utils.isNullOrEmpty(tmpProject))
				project = tmpProject;

			Item item = this.parseItem(date, project, hour);
			if(item == null){
				System.err.println("Failed to get item");
				continue;
			}
			items.add(item);
		}
		return items;
	}
}

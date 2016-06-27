package fun.with.java.day5;

import java.util.Date;

public class Item {
	private Date date;
	private String projectName;
	private float hour;
	
	public Item(Date date, String projectName, float hour){
		this.date = date;
		this.projectName = projectName;
		this.hour = hour;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getHour() {
		return hour;
	}
	public void setHour(float hour) {
		this.hour = hour;
	}
}

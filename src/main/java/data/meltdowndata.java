package data;

import com.google.gson.annotations.SerializedName;

public class meltdowndata {
	@SerializedName("date")
	private MyDate date;
	@SerializedName("starttime")
	private MyTime StartTime;
	@SerializedName("endtime")
	private MyTime EndTime;
	
	@SerializedName("runtime in secs")
	private double runtimeinSecs;
	
	@SerializedName("cause")
	private String cause;
	
	@SerializedName("days without incident")
	private int DaysWithoutIncident;
	
	@SerializedName("description")
	private String description;
	
	
	//default constructor
	public meltdowndata() {
		
		setDate(new MyDate());
		
		setStartTime(new MyTime());
		setEndTime(new MyTime());
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getDaysWithoutIncident() {
		return DaysWithoutIncident;
	}


	public void setDaysWithoutIncident(int daysWithoutIncident) {
		DaysWithoutIncident = daysWithoutIncident;
	}


	public String getCause() {
		return cause;
	}


	public void setCause(String cause) {
		this.cause = cause;
	}


	public double getRuntimeinSecs() {
		return runtimeinSecs;
	}


	public void setRuntimeinSecs(double runtimeinSecs) {
		this.runtimeinSecs = runtimeinSecs;
	}


	public MyTime getEndTime() {
		return EndTime;
	}


	public void setEndTime(MyTime endTime) {
		EndTime = endTime;
	}


	public MyTime getStartTime() {
		return StartTime;
	}


	public void setStartTime(MyTime startTime) {
		StartTime = startTime;
	}


	public MyDate getDate() {
		return date;
	}


	public void setDate(MyDate date) {
		this.date = date;
	}
	
	
	
	
	
	
	
	
	

}

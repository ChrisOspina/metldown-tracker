package data;

import java.io.FileReader;
import java.io.PrintStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class MyTime {
	@SerializedName("hour")
	private double Hour;
	
	@SerializedName("minute")
	private double Minute;
	
	@SerializedName("timeofday")
	private String TimeofDay;
	
	public MyTime() {}
	
	public MyTime(double h, double m, String tod) {
		setHour(h);setMinute(m); setTimeofDay(tod);}

	public double getMinute() {
		return Minute;
	}

	public void setMinute(double minute) {
		Minute = minute;
	}

	public double getHour() {
		return Hour;
	}

	public void setHour(double hour) {
		Hour = hour;
	}

	private String getTimeofDay() {
		return TimeofDay;
	}

	public void setTimeofDay(String timeofDay) {
		TimeofDay = timeofDay;
	}
	
	
	public void readJSON(FileReader fr) {
        //***********************
        //In order to read to JSON we need a new instance
        //of GSONBuilder. We also need to call the setPrettyPrinting
        //and create methods while we are at it
        //********************************************
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        //******************************************
        //We then must create an instance of MyTime in order to use as
        //a reference for the JSON file to read
        //****************************************
        MyTime mt = gson.fromJson(fr, MyTime.class);
        //Finally we will set each member variable to the returned values from get
        this.setHour(mt.getHour());
        this.setMinute(mt.getMinute());
        this.setTimeofDay(mt.getTimeofDay());
    }
	
	 public void writeJSON(PrintStream ps) {
	        //The same setup as above but we are writing to a JSON file
	        GsonBuilder builder = new GsonBuilder();
	        builder.setPrettyPrinting();
	        Gson gson = builder.create();
	        String jsonString = gson.toJson(this);
	        ps.println(jsonString);
	    }
	 
	 public String toString() {
		 String s = this.Hour +":"+this.Minute+" "+this.TimeofDay;
		 return s;
	 }
	 
	 
	 
    
	
}

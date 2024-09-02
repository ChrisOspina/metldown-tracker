package data;

import java.io.FileReader;
import java.io.PrintStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class MyDate {
	@SerializedName("month")
	private int Month;
	
	@SerializedName("day")
	private int Day;
	
	@SerializedName("year")
	private int Year;
	
	public MyDate() {}
	
	public MyDate(int m, int d, int y) {setMonth(m); setDay(d); setYear(y);}

	public int getYear() {return Year;}

	public void setYear(int year) {Year = year;}

	public int getDay() {return Day;}

	public void setDay(int day) {Day = day;}

	public int getMonth() {return Month;}

	public void setMonth(int month) {Month = month;}
	
	
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
        //We then must create an instance of MyDate in order to use as
        //a reference for the JSON file to read
        //****************************************
        MyDate md = gson.fromJson(fr, MyDate.class);
        //Finally we will set each member variable to the returned values from get
        this.setMonth(md.getMonth());
        this.setDay(md.getDay());
        this.setYear(md.getYear());
    }
    
     /**
     * Writes the member variables in JSON format to the given PrintStream
     *
     * @param ps the PrintStream instance that performs the reading of the
     * values to JSON
     */
    public void writeJSON(PrintStream ps) {
        //The same setup as above but we are writing to a JSON file
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String jsonString = gson.toJson(this);
        ps.println(jsonString);
    }

	
	@Override
	public String toString() {
		String s = this.Month + "/" + this.Day + "/" + this.Year;
		return s;
	}
	
	
	
}
	
	

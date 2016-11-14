package topic04.chapter10;
import java.util.Date;
public class E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time currentTime = new Time();
		System.out.println(currentTime.getHour()+ ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
		
		Time time = new Time(555550000);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
	}

}

class Time {
	private long hour;
	private long minute;
	private long second;
	
	//no args constructor for current time
	Time(){
		long totalSecond = System.currentTimeMillis() / 1000;
		this.second = totalSecond % 60;
		long totalMinute = totalSecond / 60;
		this.minute = totalMinute % 60;
		long totalHour = totalMinute / 60;
		this.hour = totalHour % 24;
	}
	
	//A constructor that makes a time object with elapsed time
	Time(long elapsedTime){
		long totalSecond = elapsedTime / 1000;
		this.second = totalSecond % 60;
		long totalMinute = totalSecond / 60;
		this.minute = totalMinute % 60;
		long totalHour = totalMinute / 60;
		this.hour = totalHour % 24;
	}
	
	//object that specifies hour, minute, and second
	Time(long hour, long minute, long second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//getter methods
	long getHour(){
		return hour;
	}
	long getMinute(){
		return minute;
	}
	long getSecond(){
		return second;
	}
	
	//method that sets a new time for the object; not sure what we need this for?
	void setTime(long elapsedTime){
		long totalSecond = elapsedTime / 1000;
		long second = totalSecond % 60;
		long totalMinute = totalSecond / 60;
		long minute = totalMinute % 60;
		long totalHour = totalMinute / 60;
		long hour = totalHour % 60;
	}
}
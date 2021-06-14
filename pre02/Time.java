import java.io.*;
import java.util.*;

public class Time {
	public static void main(String[] args){
		int hour = 21;
		int minute = 43;
		int sec = 25;
		double secsSinceMidnight = (((hour * 60) + minute) * 60 + sec);
		double secsRemain = (24*60*60)-secsSinceMidnight;
		double percentDay = ((secsRemain/secsSinceMidnight)*100);
		int hourNow = 22;
		int minuteNow = 9;
		int secNow = 25;
		double elapsedHour = ((hourNow-hour)-1);
		double elapsedMin = (Math.abs(minute-minuteNow));
	System.out.println(secsSinceMidnight + " seconds since midnight");
	System.out.println("Seconds remaining: " + secsRemain);
	System.out.println("Percentage of day complete: " + (100-percentDay));
	System.out.println("Elapsed Time: " + elapsedHour + " Hours and " + elapsedMin + " Minutes");
		
		
	}
}
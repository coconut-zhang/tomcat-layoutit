package com.ariix.myTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
//		String sTime = "1986-09-13 22:00:00 -0600";
//		sdf.setTimeZone(TimeZone.getTimeZone("GMT-6"));
//		TimeZone.setDefault(TimeZone.getTimeZone("GMT-6"));
//		Date time = sdf.parse(sTime);
//		System.out.println(time.getTime());
//		System.out.println(time);
//		Calendar cd = Calendar.getInstance();
//		cd.setTime(time);
//		cd.add(Calendar.HOUR, 2);
//		time = cd.getTime();
//		System.out.println("------------------------------");
//		System.out.println(time.getTime());
//		System.out.println(time);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
//		String sTime = "1991-04-07 00:00:00";
//		Date time = sdf.parse(sTime);
//		System.out.println(sdf.format(time));
		
		String dateString = "2016-06-06 15:22:36 -0600";
		String[] s = TimeZone.getAvailableIDs();
		
		//TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		
		String formatedDateString11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		
		System.out.println(TimeZone.getAvailableIDs());
		Date d = transformDateStringAtSpecifiedTimeZone1(TimeZone.getTimeZone("GMT-6"), "yyyy-MM-dd HH:mm:ss Z", dateString);
		System.out.println(d);
	}
	
	public static Date transformDateStringAtSpecifiedTimeZone(TimeZone exptecteTimezone, String inputDateTimePattern, String inputDateTimeString) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
					inputDateTimePattern, Locale.ENGLISH);
//			simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
			Date date = simpleDateFormat.parse(inputDateTimeString);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			Long times = c.getTime().getTime() - c.getTimeZone().getRawOffset()
					+ exptecteTimezone.getRawOffset();
			c.setTimeInMillis(times);
			return c.getTime();
			
		} catch (ParseException e) {
			return null;
		}
	}
	
	public static Date transformDateStringAtSpecifiedTimeZone1(TimeZone exptecteTimezone, String inputDateTimePattern, String inputDateTimeString) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
					inputDateTimePattern);
			
			//simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
			Date date = simpleDateFormat.parse(inputDateTimeString);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			Long times = c.getTime().getTime() - c.getTimeZone().getRawOffset()
					+ exptecteTimezone.getRawOffset();
			c.setTimeInMillis(times);
			return c.getTime();
		} catch (ParseException e) {
			return null;
		}
	}

}

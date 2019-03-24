package com.github.date;

import java.lang.String;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
	/**
	 * 时间显示，以及时间格式化
	 * @param args
	 */
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());
		System.out.println("------------------------");
		SimpleDateFormat sd = new SimpleDateFormat();
		System.out.println(sd.format(d));
		System.out.println("-------------------------");
		SimpleDateFormat sd2 = new SimpleDateFormat("Y/M/d H:m:s");
		System.out.println(sd2.format(d));
		String s = "2019/08/08 19:32:34";
		try {
			System.out.println(sd2.parse(s));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		getdays();

	}
	public  static void getdays() throws ParseException {
		String birthday = "1992/06/09";
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("Y/M/d");
		String today = sd.format(d);
		System.out.println(today);
		long birthdayDay = sd.parse(birthday).getTime();
		long myDay =  (sd.parse(today).getTime() - birthdayDay)/1000/60/60/24;
		System.out.println("我已经活了"+ myDay + "天");
	}
}

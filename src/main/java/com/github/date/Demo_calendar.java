package com.github.date;

import java.util.Calendar;

public class Demo_calendar {
	/**
	 * 日历
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println(cl.get(Calendar.YEAR) + "年" + (cl.get(Calendar.MONTH)+1) + "月" +
			cl.get(Calendar.DAY_OF_MONTH) + "日");
		cl.add(Calendar.YEAR, 1);
		System.out.println(cl.get(Calendar.YEAR) + "年" + (cl.get(Calendar.MONTH)+1) + "月" +
			cl.get(Calendar.DAY_OF_MONTH) + "日");
		cl.set(Calendar.YEAR, 2000);
		System.out.println(cl.get(Calendar.YEAR) + "年" + (cl.get(Calendar.MONTH)+1) + "月" +
			cl.get(Calendar.DAY_OF_MONTH) + "日");

	}
}

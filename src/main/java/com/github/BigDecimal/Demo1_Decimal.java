package com.github.BigDecimal;

import java.math.BigDecimal;

public class Demo1_Decimal {
	/**
	    解决小数计算不精确的问题
	*/
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));

		BigDecimal bd3 = BigDecimal.valueOf(2.0);
		BigDecimal bd4 = BigDecimal.valueOf(1.9);
		System.out.println(bd3.subtract(bd4));

	}
}

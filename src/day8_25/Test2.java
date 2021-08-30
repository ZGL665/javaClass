package day8_25;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.DoubleAdder;

public class Test2 {

	public static void main(String[] args) throws Exception {

		String s1 = "tom";
		String s2 = "tom";
		System.out.println(s1 == s2);

		String s3 = new String("tom");
		System.out.println(s2 == s3);

		System.out.println("=========日期格式化========");
		Date d1 = new Date();
		System.out.println(d1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss"); // 定义显示规则
		System.out.println(sdf.format(d1));

		sdf.applyPattern("yyyy/MM/dd");

		System.out.println(sdf.format(d1));

		String d2 = "2021/01/02 14:25:30";

		/*
		 * sdf.applyPattern("yyyy-MM-dd HH:mm:ss"); Date d3=sdf.parse(d);
		 * System.out.println(d3);
		 */

		System.out.println("===================");
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		double num1 = 1.86994;
		System.out.println(num1);

		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println(df.format(num1));

		df.applyPattern("#.00");
		System.out.println(df.format(num1));

		df.applyPattern("#.00%");
		System.out.println(df.format(num1));

		System.out.println("===================");

		int[] array1 = { 1, 5, 80, 2, 68, 7, 445, 96, 3212 };
		System.out.println(Arrays.toString(array1));

		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));

		int[] array2 = new int[5];
		Arrays.fill(array2, 2, 4, 100);
		System.out.println(Arrays.toString(array2));

		
		int[] array3= {5,8,9,3,45,21,68,796,1000};
		int index = Arrays.binarySearch(array3, 45);

		System.out.println(index);
	}

}

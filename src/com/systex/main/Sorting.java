package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class Sorting {

	public static void main(String[] args) {
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(1, 9, 2024));
		dates.add(new MyDate(23, 6, 2020));
		dates.add(new MyDate(13, 3, 2024));
		dates.add(new MyDate(10, 3, 2024));
		dates.add(new MyDate(30, 1, 2030));
		dates.add(new MyDate(5, 11, 2008));
		dates.add(new MyDate(28, 3, 2024));
		dates.add(new MyDate(31, 12, 2012));
		dates.add(new MyDate(18, 9, 2015));
		dates.add(new MyDate(16, 3, 2024));
		dates.add(new MyDate(9, 10, 1999));
		dates.add(new MyDate(21, 6, 2031));
		dates.add(new MyDate(19, 4, 2031));
		dates.add(new MyDate(5, 5, 1888));
		dates.add(new MyDate(3, 6, 2500));
		dates.add(new MyDate(10, 10, 2020));
		dates.add(new MyDate(2, 12, 2020));
		dates.add(new MyDate(22, 11, 2030));
		
		if (args[0].equals("1")) {
			System.out.println("升冪排序");
			Collections.sort(dates);
			dates.forEach(d->System.out.println(d));
		} else if (args[0].equals("2")) {
			System.out.println("降冪排序");
			Collections.sort(dates.reversed());
			dates.forEach(d->System.out.println(d));
		} else {
			System.out.println("參數請使用1 or 2");
			System.out.println("1 生冪排序");
			System.out.println("2 降冪排序");
		}
	}

}

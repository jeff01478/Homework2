package com.systex.model;

import java.util.Comparator;
import java.util.Objects;

public class MyDate implements Comparable<MyDate> {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		super();
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return year + "/" + month + "/" + day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	@Override
	public int compareTo(MyDate o) {
		if(this.year > o.year) {
			return 1;
		} else if (this.year < o.year) {
			return -1;
		} else if(this.month > o.month) {
			return 1;
		} else if (this.month < o.month) {
			return -1;
		} else if(this.day > o.day) {
			return 1;
		} else if (this.day < o.day) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

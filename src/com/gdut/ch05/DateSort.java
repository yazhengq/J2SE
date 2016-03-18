package com.gdut.ch05;

public class DateSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewDate[] days = new NewDate[5];

		days[0] = new NewDate(2006, 6, 4);
		days[1] = new NewDate(2002, 5, 4);
		days[2] = new NewDate(2003, 5, 24);
		days[3] = new NewDate(2005, 8, 4);
		days[4] = new NewDate(2008, 5, 4);
		bubbleSort(days);
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
	}

	private static NewDate[] bubbleSort(NewDate[] a) {
		for (int i = a.length - 1; i >= 1; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (a[j].compare(a[j+1]) > 0) {
					NewDate temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}

}

class NewDate {
	int year, month, day;

	public NewDate(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}

	public int compare(NewDate date) {
		return year > date.year ? 1 : year < date.year ? -1
				: month > date.month ? 1 : month < date.month ? -1
						: day > date.day ? 1 : day < date.day ? -1 : 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Y:M:D--"+year+"-"+month+"-"+day;
	}

}

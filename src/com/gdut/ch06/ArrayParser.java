package com.gdut.ch06;

public class ArrayParser {

	public static void main(String[] args) {
		double [][] d;
		
		// TODO Auto-generated method stub
		String s = "1, 2; 3, 4; 5, 6, 7";
		String[] sFirst = s.split(";");
		d = new double[sFirst.length][];
		for (int i = 0; i < sFirst.length; i++) {
//System.out.println(sFirst[i]);
			String[] sSecond = sFirst[i].split(",");
			d[i] = new double[sSecond.length];
			for (int j = 0; j < sSecond.length; j++) {
				d[i][j] = Double.parseDouble(sSecond[j]);
				System.out.println(sSecond[j]);
			}
		}
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

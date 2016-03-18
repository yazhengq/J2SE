package com.gdut.ch05;

public class ArrayParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] d;
		String s = " 1, 2; 3, 4; 5, 6; 7, 8";
		String[] sFirst = s.split(";");
		for (int i = 0; i < sFirst.length; i++) {
			System.out.println("µÚÒ»Î¬" + sFirst[i]);
			String[] sSecond = sFirst[i].split(",");
			for (int j = 0; j < sSecond.length; j++) {
				System.out.println(sSecond[j]);
			}
		}
	}

}

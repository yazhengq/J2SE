package com.gdut.ch06;

public class TestJava {
	public static void main(String[] args) {
		String s = "sunjava hello java goodjavanjava";
		
		String sToFind = "java";
		int count = 0;
		int index = -1;

		while ((index  = s.indexOf(sToFind)) != -1) {
			s = s.substring(index + sToFind.length());
			count++;
		}
		System.out.println(count);
	}
}

package com.gdut.ch06;

public class TestBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Microsoft";
		char a[] = {'a', 'b', 'c'};
		StringBuffer sb1 = new StringBuffer(s);
		sb1.append('/').append("IBM").append('/').append("Sun");
		System.out.println(sb1);
	}

}

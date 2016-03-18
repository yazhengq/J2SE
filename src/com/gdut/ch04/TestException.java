package com.gdut.ch04;

import java.lang.*;

public class TestException {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		/* System.out.println(arr[4]); */
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("wrong");
			ae.printStackTrace();
		}
		TestException te = new TestException();
		te.m(0);
		/*
		 * try{ new TestException().m(0); }catch (ArithmeticException ae) { //
		 * TODO: handle exception ae.printStackTrace();
		 * System.out.println("wrong"); }
		 */

	}

	void m(int i) throws ArithmeticException {
		if (i == 0) {
			throw new ArithmeticException("±»³ýÊýÎª0");
		}

	}
}

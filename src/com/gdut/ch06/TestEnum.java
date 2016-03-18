package com.gdut.ch06;

public class TestEnum {
	
	public enum Mycolor{ red,  green,  blue};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycolor m = Mycolor.red;
		switch (m) {
		case red:
			System.out.println("red");
			break;
		case green:
			System.out.println("green");
			break;
		case blue:
			System.out.println("blue");
			break;
		default:
			System.out.println("default");
			break;
		}
		System.out.println(m);
	}

}

package com.gdut.ch07;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		s.add("Hello");
		s.add("a");
		s.add("b");
//		while (s.iterator().hasNext()) {
			System.out.println(s);	
//		}
	}
}

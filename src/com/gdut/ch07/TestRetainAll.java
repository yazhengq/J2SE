package com.gdut.ch07;

import java.util.HashSet;
import java.util.Set;

public class TestRetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("a");s2.add("d");s2.add("c");
		
		Set sn = new HashSet(s1);
		sn.retainAll(s2);
System.out.println(sn);	
		Set su = new HashSet(s1);
		su.addAll(s2);
System.out.println(su);		
	}

}

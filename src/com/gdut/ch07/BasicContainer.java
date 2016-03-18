package com.gdut.ch07;

import java.util.Collection;
import java.util.HashSet;

public class BasicContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new HashSet();
		c.add("Hello");
		c.add(new Name("f1","l1"));
		c.add(new Integer(100));
		c.remove("Hello");
		c.remove(new Integer(100));
		System.out.println(c.remove(new Name("f1","l1")));
		System.out.println(c);
	}
}

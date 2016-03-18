package com.gdut.ch07;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestInterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new HashSet();
		c.add(new Name("f1","l1"));
		c.add(new Name("f2","l2"));
		c.add(new Name("f3","l3"));
		Iterator i = c.iterator();
		while (i.hasNext()) {
			Name n = (Name)i.next();
			System.out.println(n.getFirstName() + " " + n.getLastName());
		}
	}

}

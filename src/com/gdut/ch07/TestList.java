package com.gdut.ch07;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		for (int i = 0; i < 9; i++) {
			l1.add("a" + i);
		}
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
	}
}

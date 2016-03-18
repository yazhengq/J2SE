package com.gdut.ch03;

public class TestOverWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		p.setName("Person");
		p.setAge(19);
		s.setName("Jhon");
		s.setAge(1100);
		s.setSchool("GDUT");
		System.out.println(p.getInfo());
		System.out.println(s.getInfo());
		System.out.println(s.getSchool());
		
	}

}

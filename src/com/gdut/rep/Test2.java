package com.gdut.rep;

class Person{
	private String name;
	private String location;
	
	Person(String name) {
		this.name = name;
		location = "beijing";
	}

	public Person(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String info() {
		return "name: " + name + " location: " + location;
	}
}

class Sudent extends Person{
	private String school;
	
	Sudent(String name, String school) {
		this(name, "beijing", school);
	}
	
	public Sudent(String n, String l, String school) {
		super(n, l);
		this.school = school;
	}
	
	public String info() {
		return super.info() + " school: " + school;
	}
}

public class Test2 {

	public static void main(String[] args) {
		Person p1 = new Person("A");
		Person p2 = new Person("B", "bejing");
		
		Sudent s1 = new Sudent("C", "shanghai");
		Sudent s2 = new Sudent("C", "shanghai", "S2");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}

}

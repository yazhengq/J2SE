package com.gdut.test;

class Person{
	String name;
	String location;
	
//	Person(String name){
//		this.name = name;
//		location = "bejing";
//	}
	
	Person(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	String info() {
		return "name: " + name + " location: " + location;
	}
	
}

class Teacher extends Person{
	private String capital;

	Teacher(String n, String l, String capital) {
		super(n, l);
		this.capital = capital;
	}
	
	Teacher(String name, String capital) {
		this(name, "beijing", capital);
	}
	
	String info(){
		return super.info() + " capital: " + capital;
	}
	
}


public class TestTeacher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher("zhang", "Pro");
		System.out.println(t1.info());
	}

}

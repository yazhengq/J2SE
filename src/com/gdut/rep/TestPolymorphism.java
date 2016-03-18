package com.gdut.rep;

abstract class Animal{     //抽象类：包含抽象方法的类，必须为抽象类
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
//	public void enjoy() {
//		System.out.println("叫声...");
//	}
	
	public abstract void enjoy(); //抽象方法
}

class Cat extends Animal{
	private String eyeColor;
	public Cat(String n, String c) {
		super(n);
		eyeColor = c;
	}
	/* (non-Javadoc)
	 * @see com.gdut.rep.Animal#enjoy()
	 */
	@Override
	public void enjoy() {
		System.out.println("猫叫声···");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		System.out.println("输出1");
		return "shuchu1";
	}
	
	
}

class Dog extends Animal{
	private String furColor;

	public Dog(String n, String f) {
		super(n);
		furColor = f;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.gdut.rep.Animal#enjoy()
	 */
	@Override
	public void enjoy() {
		System.out.println("狗叫声···");
	}

//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "shuchu2";
//	}
	
	
}

class Bird extends Animal{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.gdut.rep.Animal#enjoy()
	 */
	@Override
	public void enjoy() {
		// TODO Auto-generated method stub
		System.out.println("鸟！！！");
	}
	
	
}

class Lady{
	private String name;
	private Animal pet;
	public Lady(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public void petEnjoy() {
		pet.enjoy();
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		String string = pet.toString();
//		return string;
//	}
}

public class TestPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cat cat = new Cat("mimi", "blue");
		Dog dog = new Dog("wangwang", "yellow");
		Bird bird = new Bird("polly");
		
		Lady l1 = new Lady("l1", cat); //new 谁的方法 你就去找谁的方法
		Lady l2 = new Lady("l2", dog); //
		Lady l3 = new Lady("l3", bird);
		l1.petEnjoy();
		l2.petEnjoy();
		l3.petEnjoy();
		
		System.out.println(l1.toString());
		
		
	}
}

package com.gdut.rep;

abstract class Animal{     //�����ࣺ�������󷽷����࣬����Ϊ������
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
//	public void enjoy() {
//		System.out.println("����...");
//	}
	
	public abstract void enjoy(); //���󷽷�
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
		System.out.println("è����������");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		System.out.println("���1");
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
		System.out.println("������������");
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
		System.out.println("�񣡣���");
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
		
		Lady l1 = new Lady("l1", cat); //new ˭�ķ��� ���ȥ��˭�ķ���
		Lady l2 = new Lady("l2", dog); //
		Lady l3 = new Lady("l3", bird);
		l1.petEnjoy();
		l2.petEnjoy();
		l3.petEnjoy();
		
		System.out.println(l1.toString());
		
		
	}
}

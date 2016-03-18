package com.gdut.ch03;

class Animal{
	public String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
}

class Cat extends Animal{
	public String eyesColor;
	public Cat(String n, String c) {
		super(n);
		eyesColor = c;
	}
}

class Mouse extends Animal{
	public String furColor;
	public Mouse(String n, String c) {
		super(n);
		furColor = c;
	}
}

public class TestAnimal {

	public void f(Animal a) {
		System.out.println("name: " + a.name);
		if (a instanceof Cat) {
			Cat cat = (Cat)a;
			System.out.println(" " + cat.eyesColor + " eyes");
		} else if (a instanceof Mouse) {
			Mouse m = (Mouse)a;
			System.out.println(" " + m.furColor + " fur");
		}{

		}
	}
	public static void main(String[] args) {
		TestAnimal testAnimal = new TestAnimal();
		Animal animal = new Animal("name");
		Cat cat = new Cat("catname", "blue");
		Mouse mouse = new Mouse("mousename", "black");
		
		testAnimal.f(animal);
		testAnimal.f(cat);
		testAnimal.f(mouse);
	}

}

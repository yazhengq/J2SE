package com.gdut.ch03;

class FatherClass{
	public int value; //Ä¬ÈÏÖµÎª0£»£¡£¡£¡
	public void f(){
		value = 100;
		System.out.println("FatherClass.value" + value);
	}
}

class ChildClass extends FatherClass{
	public int value;
	public void f() {
		value = 200;
		System.out.println("ChildClass.value" + value);
		System.out.println(value);
		System.out.println(super.value);
	}
	
} 

public class TestInherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cc = new ChildClass();
		cc.f();
	}

}

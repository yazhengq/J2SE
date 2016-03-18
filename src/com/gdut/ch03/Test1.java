package com.gdut.ch03;

class A{
	
	protected void print(String s){
		System.out.println(s);
	}

	public A() {
		print("A()");
	}
	
	public void f() {
		print("A:f()");		
	}
}

class B extends A{
	B() {
		print("B()");
	}
	public void f() {
		print("B:f()");//B的方法把A的方法重写了 相当于覆盖掉了！！！ 所以显示：B:f()
	}
}

public class Test1 {

	public static void main(String[] args) {
		B b = new  B();
		b.f();
	}

}

/*
 * A()
 * B()
 * B:f()
 * */

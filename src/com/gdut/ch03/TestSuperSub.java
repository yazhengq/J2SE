package com.gdut.ch03;

class SuperClass{
	private int n;

	public SuperClass() {
		System.out.println("SuperClass()");
	}
	
	public SuperClass(int n) {
		System.out.println("SuperClass(" + n + ")");
		this.n = n;
	}
}

class SubClass extends SuperClass{
	private int n;
	
	SubClass(int n){
		//super();  如果未写出 ， 即 则会 默认的调用父类的 默认的参数为空的构造函数！！！ 
		//			所以在main函数中先 输出的是父类的 默认构造函数的:SuperClass()		
		System.out.println("SuperClass(" + n + ")");
		this.n = n;
	}
	
	SubClass(){
		super(300);
		System.out.println("SubClass");
	}
}

public class TestSuperSub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc1 = new SubClass();
		System.out.println();
		SubClass sc2 = new SubClass(4000);
	
	}

}

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
		//super();  ���δд�� �� �� ��� Ĭ�ϵĵ��ø���� Ĭ�ϵĲ���Ϊ�յĹ��캯�������� 
		//			������main�������� ������Ǹ���� Ĭ�Ϲ��캯����:SuperClass()		
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

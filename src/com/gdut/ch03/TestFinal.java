package com.gdut.ch03;

final class T{
	final int i = 8;
	public final void m() {
		// TODO Auto-generated method stub
//		j = 9;
	}
}

//class TT extends T{ //final 类不能继承！！！
//	public void m() {
//  final方法不能重写	！！！	
//	}       
//} 

public class TestFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t = new T();
//		t.i = 9;   final的值不能被改变！！！ 说白了 可以读 不可以写

	}

}

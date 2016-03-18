package com.gdut.ch03;

class Dog{

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A cool dog !";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;  
		//重写equals方法之后  老鼠和猫 都是一样的
	}

//	/* (non-Javadoc)
//	 * @see java.lang.Object#equals(java.lang.Object)
//	 */
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if (obj == Null) {
//			return false
//		} else {
//			if (obj instanceof Dog) {
//				Dog d = (Dog)obj;
////				if (d) {
////					
////				}
////				return ture;
//			}
//		}
//	}

	
	
}



public class TestToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		System.out.println(d);
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
//		d2 = d1;
		
		System.out.println(d1.equals(d2));
		System.out.println(d1 == d2);
	}

}

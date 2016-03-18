package com.gdut.rep;

interface Singer{
	public static final String name = "zhang";
	public void sing();
	public void sleep();
}

interface Painter{	
	public void paint();
	public void eat();	
}

class Student implements Singer, Painter{  //ʵ�ֽӿڱ�����д�ӿ��еĳ��󷽷�
	private String name;					//

//	public Student(String name) {
//		this.name = name;
//	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.gdut.rep.Singer#sing()
	 */
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("student is singing");
	}

	/* (non-Javadoc)
	 * @see com.gdut.rep.Singer#sleep()
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("student is sleeping");
	}

	/* (non-Javadoc)
	 * @see com.gdut.rep.Painter#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("student is eating");
	}

	/* (non-Javadoc)
	 * @see com.gdut.rep.Painter#paint()
	 */
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("student is painting");
	}
	
	public void study() {
		System.out.println("student is studying ");
	}
}  

public class Test {
	public static void main(String[] args) {
		Singer s1 = new Student();
		s1.sing();
//		s1.study;   		վ��s1�ĽǶ� ֻ�ܿ���sing������ ָ��student��sing������
		s1.sleep();			//������study����
		Painter s2 = new Student();
		s2.paint();
		s2.eat();
	}
}

package com.gdut.ch03;

class Person{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getInfo(){			// 不能严格访问权限！！！ private ！！！
		return "name: " + name + " age: " + age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + name + " age: " + age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			if (obj instanceof Person) {
				Person person = (Person)obj;
				if (person.name == this.name && person.age == this.age) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}

class Student extends Person{
	private String school;

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	void Use(){
	//name = 10;	//继承父类的有些是 具有所有权 但不具有使用权！！！
					//几个修饰符的使用范围
	}
	
	public String getInfo(){
		return "name: " + getName() + " age: " + getAge() + " school: " + school;
	}
	
//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "name: " + getName() + " age: " + getAge();
//	}
}


public class TestPerson {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Jhon");
		s.setAge(25);
		s.setSchool("GDUT");
		
		String name = s.getName();
		int age = s.getAge();
		String school = s.getSchool();
		
		System.out.println("name:  "+ name +" age: " + age +" school: " + school);
		
		System.out.println(s.getInfo());
		System.out.println(s.toString());
		
		Student s1 = new Student();
		s1.setName("Jhon");
		s1.setAge(26);
		
		System.out.println(s1.equals(s));

	}

}

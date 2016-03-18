package CH03;

public class Person {
	private int id;
	private int age;
	
	
	public void getId(int p_id){
		p_id = id;
	}
	
	public void setAge(int i){
		age = i;
	}
	
	public void setId(int i){
		id = i;
	}
	
	Person(int n,int i){
		id = n;  // n = id;
		age = i; // i = age;
	}
	
	public static void main(String[] args){
		String s;
		s = new String("Hello");
		
		Person tom = new Person(1,24);
		
		
		///////////////////////
		//tom.setId(20);
		///////////////////////
		
		///////////////////////
		System.out.println(tom.id);
		System.out.println(tom.age);
		///////////////////////
		
		//Person jerry = new Person();
	}
}

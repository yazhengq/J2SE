package CH03;

public class Cat {
	
	int id, age;
	static int sid = 1;                //去掉static
	private String name;
		
	Cat(int i, int j)
	{
		id = i;
		age = j;
	}
	
	Cat(String name){
		this.name = name;
		id  = sid++;
	}
	
	public void info(){
		System.out.println("Name is " + name + " No is " + id );
	}
	
	public static void main(String[] args) {
		Cat kitty = new Cat(1, 1);
		System.out.println(kitty.id);
		System.out.println(kitty.age);
		
		Cat.sid = 1001;
		Cat mimi = new Cat("MIMI");
		mimi.sid = 2000; //sid为静态的，你改也是改，我改也是改！！！
		Cat pp = new Cat("pp");
		mimi.info();
		pp.info();
		
		//id
		
	}

}

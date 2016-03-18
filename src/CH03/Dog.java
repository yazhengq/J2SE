package CH03;

public class Dog {
	int furCorlor;
	float height;
	float weight;
	
	void catchMouse(Mouse m){
		m.scream();
	}
	
	public static void main(String[] args){
		Dog d = new Dog();
		Mouse m = new Mouse();
		d.catchMouse(m);
		
		HelloWorld hw = new HelloWorld();
	}
	
}

class Mouse{
	void scream(){
		
	}
}

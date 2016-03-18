package CH03;

class B extends A{
	B(){
		print("B()");
	}
	public void f(){
		print("B:f()");
	}
	public static void main(String arg[]){
		B b = new B();
		b.f();
	}
}

package CH03;

class A{
	protected void print(String s){
		System.out.println(s);
	}
	A(){
		print("A()");
	}
	public void f(){
		print("A:f()");
	}
}



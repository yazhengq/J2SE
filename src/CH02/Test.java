package CH02;

public class Test {
	public static void main(String arg[]){
		System.out.println(method(40));
	}
	public static int method(int n){
		if(n==1||n==2)
			return 1;
		else 
			//return n*method(n-1);
			return method(n-1)+method(n-2);
	}
}

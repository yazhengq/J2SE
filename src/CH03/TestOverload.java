package CH03;

public class TestOverload {

	void max(int a, int b){
		System.out.println(a > b ? a : b);
	}
	
	void max(float a, float b){
		System.out.println(a > b ? a : b);
	}

	void max(double a, double b){
		System.out.println(a > b ? a : b);
	}
	//参数不一样：1 个数  2类型
	
	public static void main(String args[]){
		TestOverload t = new TestOverload();
		t.max(1, 2);
		t.max(1.002f, 2.001f);
	}
}

package CH03;

public class Leaf {

	int i = 0;

	Leaf(int i) {			//构造方法 形参的名字和参数重名
		this.i = i;			//this是当前对象的调用，
	}
	
	Leaf increament(){
		i++;
		return this;
	}

	void print(){
		System.out.println("i = " + i);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leaf leaf = new Leaf(100);
		leaf.increament().increament().print();
	}

}

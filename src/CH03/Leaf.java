package CH03;

public class Leaf {

	int i = 0;

	Leaf(int i) {			//���췽�� �βε����ֺͲ�������
		this.i = i;			//this�ǵ�ǰ����ĵ��ã�
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

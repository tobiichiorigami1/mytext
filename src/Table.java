public class Table {
	// ���� ��Ĭ��ֵ
	int leg;
	String shape;
	static boolean ff;

	// �������η� �������� �������б�
	// ���췽��
	// �������η� ���� �������б�
	// public Table(){
	// System.out.println("ִ�����޲ι��췽��");
	// }
	// �����д���췽�� ϵͳ���Զ����һ��Ĭ���޲ι��췽��
	// ����д�ˣ�ϵͳ�Ͳ����Զ�����Ĭ��
	// ���������� overload
	// ͬһ���з�������ͬ �����б�ͬ
	public Table() {
		
		System.out.println("ִ���޲�");
	}

	public Table(int leg) {
		this();
		System.out.println("ִ��һ���������췽��");
	}

	public Table(int leg, String shape) {
		this(3);
		System.out.println("ִ���������Ĺ��췽��");
		this.leg = leg;
		this.shape = shape;
	}

	public void jisuan() {
		int result = jia(2, 3);
	}

	public int jia(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// int xxx=0;
		// System.out.println(xxx);
		Table xiaofangTable = new Table(1, " ");
		System.out.println(xiaofangTable.leg);
		System.out.println(xiaofangTable.shape);
		System.out.println(ff);
	}

}

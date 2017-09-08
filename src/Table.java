public class Table {
	// 属性 有默认值
	int leg;
	String shape;
	static boolean ff;

	// 访问修饰符 返回类型 （参数列表）
	// 构造方法
	// 访问修饰符 类名 （参数列表）
	// public Table(){
	// System.out.println("执行了无参构造方法");
	// }
	// 如果不写构造方法 系统会自动添加一个默认无参构造方法
	// 但是写了，系统就不会自动加入默认
	// 方法的重载 overload
	// 同一类中方法名相同 参数列表不同
	public Table() {
		
		System.out.println("执行无参");
	}

	public Table(int leg) {
		this();
		System.out.println("执行一个参数构造方法");
	}

	public Table(int leg, String shape) {
		this(3);
		System.out.println("执行两参数的构造方法");
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

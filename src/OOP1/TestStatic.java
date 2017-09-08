package OOP1;
public class TestStatic {
	static int age;
	static {
		age = 2;
		System.out.println(age);
	}
	{
		age = 4;
		System.out.println(age);
	}

	public TestStatic() {
		System.out.println(age);
	}

	private void hehe() {
		System.out.println(age);
	}

	private static void haha() {
		TestStatic ts4 = new TestStatic();
		ts4.hehe();
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestStatic.hehe();
		TestStatic ts = new TestStatic();
		ts.age = 22;
		TestStatic ts2 = new TestStatic();
		ts2.age = 23;
		TestStatic ts3 = new TestStatic();
		System.out.println(ts.age);
		System.out.println(ts2.age);
		System.out.println(ts3.age);
	}

}
// 考试机 网络爬虫 URL
// 流 抓取出来
// qq 好友推荐
//   A 
//  B C 
//   D


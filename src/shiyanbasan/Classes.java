package shiyanbasan;

import java.util.Scanner;

public class Classes {
	static Student st[] = new Student[10];
	
	static int i = 0;
	Teacher teacher=Teacher.getInstance();
	public Classes() {
		for (int k = 0; k < st.length; k++) {
			st[k] = new Student("hh", 1234);
		}
		Teacher teacher=Teacher.getInstance();
		// TODO Auto-generated constructor stub
	}

	{
		System.out.print(i);
	}
//更新老师 老师设置为静态
	public void upDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入老师姓名");
		String a = scanner.next();
		System.out.println("请输入老师职工号");
		int n = scanner.nextInt();
		
		teacher.name=a;
		teacher.num=n;
		System.out.println("更改老师成功");
	}
//添加学生
	public void add() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生姓名");
		String a = scanner.next();
		System.out.println("请输入学生学号");
		int n = scanner.nextInt();
		Student s = new Student(a, n);
		//创建一个新数组，比原数组长度加一
		Student sts[] = new Student[st.length + 1];
		//将原数组内元素赋给新数组
		for (int l = 0; l < st.length; l++) {
			sts[l] = st[l];
		}
		//将添加的数据加入到新数组最后一位
		sts[st.length] = s;
		//将原数组的引用指向新数组
		st = sts;
		System.out.println("添加成功");

	}

	public Classes delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你需要删除的人的名字");
		String aString = scanner.next();
		int e = 0;
		int num = 0;
		boolean s = false;
		//遍历对数组进行查找   找到该元素所在的下脚标
		for (int j = 0; j < st.length; j++) {
			if (st[j].getName().equals(aString)) {
				e = j;
				s = true;
				break;
			}
		}
		if (!s) {
			System.out.println("查无此人请重新进行删除操作");
			return this.delete();
		} else {
			Student sts[] = new Student[st.length - 1];
			//创建新数组装原数组，跳过被删元素的角标
			for (int j = 0; j < st.length; j++) {
				if (j != e) {
					sts[num] = st[j];
					num++;
				}
			}
			st = sts;
            System.out.println("删除成功");
		    return null;
		}
	}

	public void show() {
		System.out.println("当前老师名称" + teacher.name
				+"当前老师职工号："+teacher.num);
		System.out.println("当前学生列表");
		for (Student s : st) {
			System.out.println("姓名"+s.name+"学号"+s.num);
		}
	}

}

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
//������ʦ ��ʦ����Ϊ��̬
	public void upDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ʦ����");
		String a = scanner.next();
		System.out.println("��������ʦְ����");
		int n = scanner.nextInt();
		
		teacher.name=a;
		teacher.num=n;
		System.out.println("������ʦ�ɹ�");
	}
//���ѧ��
	public void add() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ������");
		String a = scanner.next();
		System.out.println("������ѧ��ѧ��");
		int n = scanner.nextInt();
		Student s = new Student(a, n);
		//����һ�������飬��ԭ���鳤�ȼ�һ
		Student sts[] = new Student[st.length + 1];
		//��ԭ������Ԫ�ظ���������
		for (int l = 0; l < st.length; l++) {
			sts[l] = st[l];
		}
		//����ӵ����ݼ��뵽���������һλ
		sts[st.length] = s;
		//��ԭ���������ָ��������
		st = sts;
		System.out.println("��ӳɹ�");

	}

	public Classes delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������Ҫɾ�����˵�����");
		String aString = scanner.next();
		int e = 0;
		int num = 0;
		boolean s = false;
		//������������в���   �ҵ���Ԫ�����ڵ��½ű�
		for (int j = 0; j < st.length; j++) {
			if (st[j].getName().equals(aString)) {
				e = j;
				s = true;
				break;
			}
		}
		if (!s) {
			System.out.println("���޴��������½���ɾ������");
			return this.delete();
		} else {
			Student sts[] = new Student[st.length - 1];
			//����������װԭ���飬������ɾԪ�صĽǱ�
			for (int j = 0; j < st.length; j++) {
				if (j != e) {
					sts[num] = st[j];
					num++;
				}
			}
			st = sts;
            System.out.println("ɾ���ɹ�");
		    return null;
		}
	}

	public void show() {
		System.out.println("��ǰ��ʦ����" + teacher.name
				+"��ǰ��ʦְ���ţ�"+teacher.num);
		System.out.println("��ǰѧ���б�");
		for (Student s : st) {
			System.out.println("����"+s.name+"ѧ��"+s.num);
		}
	}

}

package oop;

//public class Test {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Tufu tufu=new Tufu(new Pig());
//          tufu.pig.name="������";
//	      tufu.pig.sex="��";
//	      tufu.pig.type="����";
//	      tufu.pig.weight=100;
//	      System.out.println(tufu.pig.chengzhong(7));
//	      tufu.shazhu();
//	       
//	
//	}
//
//}
public class Test{ 
    public void method(Person e) {	 //��Person����û��getschool()����
//   System.out.pritnln(e.getschool());   //�Ƿ�,����ʱ����

   if(e  instanceof  Student){
       Student me = (Student)e;	//��eǿ��ת��ΪStudent����
       System.out.println(me.getschool());
   }	    
    }

    public static  void main(String args[]){
       Test t = new Test();
        Student m = new Student();
        t.method(m);
    }
}

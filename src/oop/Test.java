package oop;

//public class Test {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Tufu tufu=new Tufu(new Pig());
//          tufu.pig.name="猪猪侠";
//	      tufu.pig.sex="公";
//	      tufu.pig.type="土猪";
//	      tufu.pig.weight=100;
//	      System.out.println(tufu.pig.chengzhong(7));
//	      tufu.shazhu();
//	       
//	
//	}
//
//}
public class Test{ 
    public void method(Person e) {	 //设Person类中没有getschool()方法
//   System.out.pritnln(e.getschool());   //非法,编译时错误

   if(e  instanceof  Student){
       Student me = (Student)e;	//将e强制转换为Student类型
       System.out.println(me.getschool());
   }	    
    }

    public static  void main(String args[]){
       Test t = new Test();
        Student m = new Student();
        t.method(m);
    }
}

package shiyanjiusi;


public class BankAccount {
    static String BankAccountId[]=new String[1];
	String Date[]=new String[1]; 
	double reset=100;
	static int o=0;
	public BankAccount(){
		autoAdd();
		
	}
	public void Bankin(int a){
		reset+=a;
	    System.out.println("���ɹ�"+"��ǰ���"+reset);
	}
	public void Bankout(int a){
		if(reset>=a){
			reset-=a;
		   System.out.println("ȡ��ɹ�"+"��ǰ���"+reset);
		}
		else{
		System.out.println("����");	
		}
	}
	public void autoAdd(){
		o++; 
		String s[]=new String[BankAccountId.length+1];
		 //����ʮλ������˺�
		 int a[]=new int[10];
		 for(int i=0;i<10;i++){
		     a[i]=(int)(Math.random()*10);	 
		 }
		 String b="";
		 for(int i=0;i<10;i++){
			 b+=a[i];
		 }
	     int m=0;
		 for(int i=0;i<s.length;i++){
	         if(BankAccountId[m]!=null){
	             	s[i]=BankAccountId[m];
	             	m++;
	         }       	 
	         else{
	        	 s[i]=b;
	        	 break;
	         }
		 } 
		 BankAccountId=s;
		 System.out.println("��ӭ������������˺���" +b);
	}
	public static void show(){
		System.out.println("��ǰ������Ա"+o);
	    for(int i=0;i<o;i++)
		{System.out.println(BankAccountId[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount asd=new BankAccount();
        BankAccount wasd=new BankAccount();
        asd.Bankin(100);
        asd.Bankout(200);
        wasd.Bankout(1000);
        BankAccount.show();
	}

}

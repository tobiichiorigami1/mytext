package 实验五;


 class Shi {


	private static Shi shi=new Shi();
 	private String name; 
    public static Shi getshi(){
    	return shi;
    }
 	static{
 		System.out.println("开始了");
 	}
 	private Shi(){
 		
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shi s3=new Shi();
		Shi s1=Shi.getshi();
          Shi s2=Shi.getshi();
          if(s1==s2){
       System.out.println("这是同一个shi");        	  
          }
//		System.out.println(args.length);
//		for(int i=0;i<args.length;i++){
//			System.out.println("args"+"["+i+"]"+args[i]);
//		}
	}

}

package paixu;


public class xier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]={1,2,3,4,5,7,8,6,9};
	for(int ge=a.length/2;ge>=1;ge/=2){
	 for(int i=0;i+ge<=a.length-1;i++)
	 {
	       if(a[i]>a[i+ge]){/
	    	   int t=a[i];
	    	   a[i]=a[i+ge];
	    	   a[i+ge]=t;
	       }	 
      }
		
		
	}
	for(int b:a){
		System.out.println(b);
	}
	}

}

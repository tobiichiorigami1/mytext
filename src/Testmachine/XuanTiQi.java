package Testmachine;


public class XuanTiQi {
    private static XuanTiQi xtq;
	private XuanTiQi(){
		
	}
    public static XuanTiQi getInstance(){
    	if(xtq==null){
    		xtq=new XuanTiQi();
    	}
    	return xtq;
    	
    }
	public void xuanTi(Ti[] ztk,Ti[]lstk){
		for(int i=0;i<lstk.length;i++){
			int index=(int)(Math.random()*ztk.length);
			//ÌâÖØ¸´
			lstk[i]=ztk[index];
			}
		
		
		
	}
	public static void main(String[] args) {
		//XuanTiQi.getInstance().xuanTi(ztk, lstk);
	}
	
}

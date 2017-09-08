package สตั้ม๙;

public class tuoyuan extends Tuxing {
      int changzhou;
      int duanzhou;
      public tuoyuan(String name,int changzhou,int duanzhou){
    	  super(name);
    	  this.changzhou=changzhou;
    	  this.duanzhou=duanzhou;
      }
	@Override
	public double findArea() {
		
		return 3.14*changzhou*duanzhou;
	}

}

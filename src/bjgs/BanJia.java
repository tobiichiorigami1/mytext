package bjgs;
public class BanJia {
      HuoChe xhc[]=new HuoChe[10];
      JiaJu[] jj=new JiaJu[10];
      static int a=0;
      static
      {
    	   a=1;
      }
      {
    	  System.out.println();
    	  System.out.println("���ǵ�"+a+"λ�˿�");
          a++;
      }
      public BanJia() {
		jj[0]=new JiaJu("����");
		jj[1]=new JiaJu("����");
		jj[2]=new JiaJu("����");
		jj[3]=new JiaJu("�¹�");
		jj[4]=new JiaJu("д����");
		jj[5]=new JiaJu("ϴ�»�");
		jj[6]=new JiaJu("΢��¯");
		jj[7]=new JiaJu("��ˮ��");
		jj[8]=new JiaJu("д��̨");
		jj[9]=new JiaJu("����");
	    xhc[0]=new HuoChe("1��");
	    xhc[1]=new HuoChe("2��");
	    xhc[2]=new HuoChe("3��");
	    xhc[3]=new HuoChe("4��");
	    xhc[4]=new HuoChe("5��");
	    xhc[5]=new HuoChe("6��");
	    xhc[6]=new HuoChe("7��");
	    xhc[7]=new HuoChe("8��");
	    xhc[8]=new HuoChe("9��");
	    xhc[9]=new HuoChe("10��");
		zhuanche(jj,xhc);
      }
      public  HuoChe zhuanche(JiaJu jj[],HuoChe xhc[]) {
		// TODO Auto-generated method stub
          HuoChe hc=new HuoChe(null);
    	   hc=this.xhc[(int)(Math.random()*9)];
    	  System.out.println("��ǰΪ���������"+hc.getName()+"����");
    	      	   for (int i = 0; i < hc.jj.length; i++) {
			hc.jj[i]=this.jj[(int)(Math.random()*9)];
		    System.out.println("װ��"+hc.jj[i].getName());
        }
	    System.out.println("��ʼ����");
        return  hc.zhuandx(hc.jj);
      }
}

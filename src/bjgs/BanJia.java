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
    	  System.out.println("您是第"+a+"位顾客");
          a++;
      }
      public BanJia() {
		jj[0]=new JiaJu("冰箱");
		jj[1]=new JiaJu("电脑");
		jj[2]=new JiaJu("电视");
		jj[3]=new JiaJu("衣柜");
		jj[4]=new JiaJu("写字桌");
		jj[5]=new JiaJu("洗衣机");
		jj[6]=new JiaJu("微波炉");
		jj[7]=new JiaJu("热水器");
		jj[8]=new JiaJu("写字台");
		jj[9]=new JiaJu("凳子");
	    xhc[0]=new HuoChe("1号");
	    xhc[1]=new HuoChe("2号");
	    xhc[2]=new HuoChe("3号");
	    xhc[3]=new HuoChe("4号");
	    xhc[4]=new HuoChe("5号");
	    xhc[5]=new HuoChe("6号");
	    xhc[6]=new HuoChe("7号");
	    xhc[7]=new HuoChe("8号");
	    xhc[8]=new HuoChe("9号");
	    xhc[9]=new HuoChe("10号");
		zhuanche(jj,xhc);
      }
      public  HuoChe zhuanche(JiaJu jj[],HuoChe xhc[]) {
		// TODO Auto-generated method stub
          HuoChe hc=new HuoChe(null);
    	   hc=this.xhc[(int)(Math.random()*9)];
    	  System.out.println("当前为您服务的是"+hc.getName()+"货车");
    	      	   for (int i = 0; i < hc.jj.length; i++) {
			hc.jj[i]=this.jj[(int)(Math.random()*9)];
		    System.out.println("装入"+hc.jj[i].getName());
        }
	    System.out.println("开始运输");
        return  hc.zhuandx(hc.jj);
      }
}

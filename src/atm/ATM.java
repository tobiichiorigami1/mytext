package atm;


public class ATM {
       //记录用户信息
	  User[]users=new User[3];
	  
	  public void init(){
		  User zsUser=new User("zs","123",100,1000,1000);
		  User lsUser=new User("ls","123",5000,20000,20000);
		  User wemzUser=new User("wemz","123",800,5000,5000);
//	      users={zsUser,lsUser,wemzUser};
		  users[0]=zsUser;
	      users[1]=lsUser;
	      users[2]=wemzUser;
		  
	  }
      public ATM() {
		init();
	}
      public User login(String uname,String password){
    	  User user=null;
    	  for(int i=0;i<users.length;i++){
    	  if(users[i].uname.equals(uname)){
    		  if(users[i].password.equals(password)){
    			  user=users[i];
    			  break;
    		  }
    	  }}
    	  return user;
      }
      public void savemoney(double savemoney,User user){
    	  user.money+=savemoney;
    	  }
           
      
 public static void main(String[] args) {
	ATM atm=new ATM();
	User user1=atm.login("zs","123");
    atm.savemoney(1000,user1);
	System.out.println(user1.uname);
    System.out.println(user1.money);
}
}

package OOP1;

public class TestBlock {
	String name;
	{
		name="abc";
		System.out.println("执行了 非static");
		
	}
    static{
    	System.out.println("执行了static ");
    }    
public static void main(String[] args) {
	new TestBlock();  
	TestBlock testBlock;
	  
}


}

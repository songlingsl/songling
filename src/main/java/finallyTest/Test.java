package finallyTest;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println("结果"+t.abc());;
	}
	
	String abc(){
		
		String s="";
		
		try{
			System.out.println(111);
s.substring(3);
			System.out.println(222);
			return s;
		}catch(Exception e){
			
			e.printStackTrace();
			System.out.println(333);
			return s;
		}finally{
			System.out.println(444);
			//不在这return；
		}
		
	}
}
